package Interfaces;


import java.rmi.Remote;
import java.rmi.RemoteException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guilhermemarx14
 */
public interface ClienteClienteInterface extends Remote {
    public String getScript(int id) throws RemoteException;
}
