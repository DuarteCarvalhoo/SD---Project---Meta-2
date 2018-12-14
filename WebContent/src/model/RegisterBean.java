package model;

import rmiserver.Album;
import rmiserver.Hello;
import rmiserver.User;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;

public class RegisterBean {
    private Hello rmi;
    private String username; // username and password supplied by the user
    private String password;
    private User user;

    public void setUser(User user){
        this.user = user;
    }

    public RegisterBean() {
        try {
            Registry registry = LocateRegistry.getRegistry(7000);
            this.rmi =(Hello) registry.lookup("Hello");
        }
        catch(NotBoundException | RemoteException e) {
            e.printStackTrace();
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

    public String insertData(String username, String password) {
        String response = "";
        try{
            response = rmi.checkRegister(username,password);
            return response;
        } catch (RemoteException e) {
            response = "somethingWentWrong";
            System.out.println(e.getMessage());
        }
        return response;
    }


    public String makeCritic(double score, String text, String album) throws RemoteException {
        return this.rmi.makeCritic(score, text, album, this.user);
    }
}
