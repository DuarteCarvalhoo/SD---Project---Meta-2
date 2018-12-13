package model;

import rmiserver.Hello;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class RegisterBean {
    private Hello rmi;
    private String username; // username and password supplied by the user
    private String password;

    public RegisterBean() {
        try {
            rmi = (Hello) Naming.lookup("Hello");
        }
        catch(NotBoundException | RemoteException | MalformedURLException e) {
            e.printStackTrace(); // what happens *after* we reach this line?
        }
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean getUserMatchesPassword() {
        return false;
    }
}
