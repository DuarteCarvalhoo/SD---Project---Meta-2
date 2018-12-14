package action;

import java.rmi.RemoteException;

public class Critic extends Action{
    public String album=null, critic=null, score=null;

    @Override
    public String execute() throws RemoteException{
        String aux = this.getBean().makeCritic(Double.parseDouble(score), critic, album);
        if(aux.equals("type|criticComplete")) {
            return SUCCESS;
        }
        return ERROR;
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
