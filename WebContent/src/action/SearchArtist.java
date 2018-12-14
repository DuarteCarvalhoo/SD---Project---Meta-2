package action;

import com.opensymphony.xwork2.ActionSupport;
import model.Bean;
import org.apache.struts2.interceptor.SessionAware;

import java.util.Map;

public class SearchArtist extends ActionSupport implements SessionAware {
    private static final long serialVersionUID = 4L;
    private String artistName = "";
    private Map<String, Object> session;

    public String execute() throws Exception{ {
        if((this.artistName != null && !artistName.equals(""))){
            String response = this.getBean().showArtist(this.artistName);
            String[] respSplit = response.split(";");
            switch(respSplit[0]){
                case "type|artistDatabaseEmpty":
                    return "failed";
                case "type|partialSearchComplete":
                    return "workedP;Possibilities|"+respSplit[1];
                case "type|notPartialSearchComplete":
                    return "worked;"+respSplit[1]+";"+respSplit[2]+";"+respSplit[3]+";"+respSplit[4];
                default:
                    return "rip";
            }
        }
        return "rip";
    }
    }

    public Bean getBean() {
        if(!session.containsKey("Bean"))
            this.setBean(new Bean());
        return (Bean) session.get("Bean");
    }

    private void setBean(Bean Bean){
        this.session.put("Bean", Bean);
    }

    @Override
    public void setSession(Map<String, Object> session) {
        this.session = session;
    }

    public void setArtistName(String artistName) {
        this.artistName=artistName;
    }
}
