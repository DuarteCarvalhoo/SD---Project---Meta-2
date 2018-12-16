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
    public String makeCritic(double score, String text, String album, String username) throws RemoteException {
        return this.rmi.makeCritic(score, text, album, username);
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

    public String showMusicByName(String name){
        String response = "";
        try{
            response = rmi.showMusic(name);
            return response;
        }catch(RemoteException e){
            response = "something";
            e.printStackTrace();
        }
        return response;
    }

    public String showMusicsByComposer(String name){
        String response = "";
        try{
            response = rmi.showComposerMusics(name);
            return response;
        }catch(RemoteException e){
            response = "something";
            e.printStackTrace();
        }
        return response;
    }

    public String showMusicsBySongwriter(String name){
        String response = "";
        try{
            response = rmi.showSongwriterMusics(name);
            return response;
        }catch(RemoteException e){
            response = "something";
            e.printStackTrace();
        }
        return response;
    }

    public String showAlbumByName(String name){
        String response = "";
        try{
            response = rmi.showAlbum(name);
            return response;
        }catch(RemoteException e){
            response = "something";
            e.printStackTrace();
        }
        return response;
    }

    public String showAlbumByArtist(String name){
        String response = "";
        try{
            response = rmi.showArtistAlbums(name);
            return response;
        }catch(RemoteException e){
            response = "something";
            e.printStackTrace();
        }
        return response;
    }

    public String makeEditor(String name){
        String response = "";
        try{
            response = rmi.checkEditorMaking(name);
            return response;
        }catch(RemoteException e){
            response = "something";
            e.printStackTrace();
        }
        return response;
    }

    public String isEditor(String name){
        String response="";
        try{
            response = rmi.isEditor(name);
            return response;
        }catch (RemoteException e){
            response="rip";
            System.out.println(e.getMessage());
        }
        return response;
    }

    //DROPBOX
    public String saveDropboxInfo(String token, String name, String mail){
        String response="";
        try{
            response = rmi.saveDropboxToken(token,name,mail);
            return response;
        }catch (RemoteException e){
            response="rip";
            System.out.println(e.getMessage());
        }
        return response;
    }

    public String getDropboxInfo(String username){
        String response="";
        try{
            response = rmi.getDropboxInfo(username);
            return response;
        }catch (RemoteException e){
            response="rip";
            System.out.println(e.getMessage());
        }
        return response;
    }

    //CONNECT
    public String connectMusicFile(String musicName, String dbFileId){
        String response="";
        try{
            response = rmi.connectMusicFile(musicName,dbFileId);
            return response;
        }catch (RemoteException e){
            response="rip";
            System.out.println(e.getMessage());
        }
        return response;
    }

    public String checkKnownEmail(String email) {
        String response="";
        try{
            response = rmi.checkKnownEmail(email);
            return response;
        }catch (RemoteException e){
            response="rip";
            System.out.println(e.getMessage());
        }
        return response;
    }
}
