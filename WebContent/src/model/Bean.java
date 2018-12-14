package model;

import rmiserver.Hello;
import rmiserver.User;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Bean {
    private Hello rmi;
    private String username; // username and password supplied by the user
    private String password;
    private User user;
    private String artistName;

    public Bean() {
        try {
            Registry registry = LocateRegistry.getRegistry(7000);
            this.rmi =(Hello) registry.lookup("Hello");
        }
        catch(NotBoundException | RemoteException e) {
            e.printStackTrace();
        }
    }

    // LOGIN --------------------------

    public String getUserMatchesPassword() {
        String response = "";
        try{
            response = rmi.checkLogin(this.username,this.password);
            return response;
        } catch (RemoteException e) {
            response = "somethingWentWrong";
            e.printStackTrace();
        }
        return response;
    }

    // CRITIC ---------------------------
    public String makeCritic(double score, String text, String album) throws RemoteException {
        return this.rmi.makeCritic(score, text, album, this.user);
    }

    // REGISTER

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
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

    //SEARCH
    public String showArtist(String name){
        String response = "";
        try{
            response = rmi.showArtist(name);
            return response;
        } catch (RemoteException e) {
            response = "somethingWentWrong";
            e.printStackTrace();
        }
        return response;
    }
}
