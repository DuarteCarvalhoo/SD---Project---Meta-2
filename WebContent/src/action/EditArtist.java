package action;

import com.opensymphony.xwork2.ActionSupport;
import model.Bean;
import org.apache.struts2.interceptor.SessionAware;

import java.util.Map;

public class EditArtist extends ActionSupport implements SessionAware {
    private String artistName=null;
    Map<String, Object> session;
    public String execute() throws Exception {
        if((this.artistName != null && !artistName.equals(""))) {
            String response = this.getBean().editArtist(session.get("artistChange").toString(),artistName);
            if(response.equals("type|somethingWentWrong")){
                return "rip";
            }
            else if(response.equals("type|nameChanged")){
                return "worked";
            }
            else {
                return "failed";
            }
        }
        return "rip";
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public Bean getBean(){
        if(!session.containsKey("Bean"))
            this.setBean(new Bean());
        return (Bean) session.get("Bean");
    }

    public void setBean(Bean bean) {
        this.session.put("Bean", bean);
    }

    @Override
    public void setSession(Map<String, Object> session) {
        this.session = session;
    }
}
