/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancoid;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import rmiinterfaces.ClienteBancoIdsInterface;

/**
 *
 * @author guilhermemarx14
 */
public class BancoId extends UnicastRemoteObject implements ClienteBancoIdsInterface {
    public static int id = 0;
    public static ArrayList<String> banco = new ArrayList<>();

    public BancoId() throws Exception{
        super();
    }

    @Override
    public int getId(){
        return BancoId.id;
    }
    @Override
    public void updateId(String name){
        BancoId.banco.add(name);
        BancoId.id++;
        System.out.println(name+" atualizou ID.");
        
    }
    @Override
    public String getName(int id){
        return BancoId.banco.get(id);
    }
    
    public static void main(String[] args) throws Exception{
       
        try {
            Registry registry = LocateRegistry.createRegistry(1099);
            System.setProperty( "java.rmi.server.hostname", "localhost" );
            Naming.rebind("//localhost/BancoId", new BancoId());          
            System.out.println("Server ready");

        } catch (Exception e) {

            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();

        }   
    }
}