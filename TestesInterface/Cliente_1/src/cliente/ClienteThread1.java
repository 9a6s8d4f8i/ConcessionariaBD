/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import rmiinterfaces.ClienteClienteInterface;
/**
 *
 * @author guilhermemarx14
 */
public class ClienteThread1 extends UnicastRemoteObject implements ClienteClienteInterface{
    public String nome;
    
    public ClienteThread1(String nome) throws Exception{
        
        this.nome = nome;
    }
    

    @Override
    public String getScript(int id) {
        return Cliente.mensagens.get(id);
        
    }
}
