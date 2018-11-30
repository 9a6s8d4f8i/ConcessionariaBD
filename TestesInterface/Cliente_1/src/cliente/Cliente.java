/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import java.util.Scanner;
import rmiinterfaces.ClienteBancoIdsInterface;
/**
 *
 * @author guilhermemarx14
 */
public class Cliente {
    public static ClienteBancoIdsInterface banco;
    static Scanner in = new Scanner (System.in);
    static String nome;
    static ArrayList<String> mensagens = new ArrayList<>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
       banco = (ClienteBancoIdsInterface) Naming.lookup("//192.168.2.9/BancoId");

        
        
        try {//Inicializa a interface RMI que vai funcionar como servidor, dando acesso aos outros clientes aos scripts
        System.out.println("Digite o nome desta máquina: ");
        nome = "//"+ InetAddress.getLocalHost().getHostAddress() +"/"+ in.nextLine();
            
            
            Registry registry = LocateRegistry.createRegistry(1097);
            System.setProperty( "java.rmi.server.hostname", ""+InetAddress.getLocalHost().getHostAddress()+"" );
            Naming.rebind(nome, new ClienteThread1(nome));
            
            Thread thread = new Thread(new ClienteThread2());//STARTA O TRABALHO CLIENTE
            thread.start();

        
        
        Thread.sleep(1000);
        System.out.println("Digite uma mensagem: ");
        for(int i=0;i<100;i++){
            

            mensagens.add(in.nextLine());
            banco.updateId(nome);
            Thread.sleep(1000);
        
        }
        } catch (Exception e) {

            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();

        }
    }
    
}
