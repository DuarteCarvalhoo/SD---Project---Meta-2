package action;

import java.rmi.RemoteException;

public class Critic {
    public String album=null, critic=null, score=null;

    public String execute() throws RemoteException{
        return "ola";
    }
    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getCritic() {
        return critic;
    }

    public void setCritic(String critic) {
        this.critic = critic;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }
}
