package model;

import rmiserver.Hello;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class LoginBean {
    private Hello rmi;
    private String username; // username and password supplied by the user
    private String password;

    public LoginBean() {
            try {
                Registry registry = LocateRegistry.getRegistry(7000);
                rmi = (Hello) registry.lookup("Hello");
            } catch (NotBoundException | RemoteException e) {
                e.printStackTrace();
            }
    }
}
