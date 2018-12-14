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
            String[] nameParts = respSplit[1].split("\\|");
            String[] descParts = respSplit[2].split("\\|");
            String[] funcParts = respSplit[3].split("\\|");
            String[] albumParts = respSplit[4].split("\\|");
            switch(respSplit[0]){
                case "type|artistDatabaseEmpty":
                    System.out.println("failed");
                    return "failed";
                case "type|partialSearchComplete":
                    System.out.println("parcial");
                    return "workedP";
                case "type|notPartialSearchComplete":
                    System.out.println(" nao parcial");
                    session.put("name",nameParts[1]);
                    session.put("description",descParts[1]);
                    session.put("functions",funcParts[1]);
                    session.put("albums",albumParts[1]);
                    return "worked";
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
