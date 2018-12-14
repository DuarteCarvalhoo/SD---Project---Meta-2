package model;

import rmiserver.Hello;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Map;

public class SearchArtistBean {
    private Hello rmi;
    private String artistName = "";

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public SearchArtistBean() {
        try {
            Registry registry = LocateRegistry.getRegistry(7000);
            rmi = (Hello) registry.lookup("Hello");
        } catch (NotBoundException | RemoteException e) {
            e.printStackTrace();
        }
    }

    public String getArtistInfo(){
        String response = "";
        try{
            response = rmi.showArtist(this.artistName);
            return response;
        } catch (RemoteException e) {
            response = "somethingWentWrong";
            e.printStackTrace();
        }
        return response;
    }


}
