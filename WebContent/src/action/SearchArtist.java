package action;

import model.SearchArtistBean;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;
import java.util.HashMap;
import java.util.Map;

public class SearchArtist extends ActionSupport implements SessionAware {
    private static final long serialVersionUID = 4L;
    private String artistName = "";
    private Map<String, Object> session;

    public String execute() throws Exception{ {
        if((this.artistName != null && !artistName.equals(""))){
            this.getSearchArtistBean().setArtistName(this.artistName);
            String response = this.getSearchArtistBean().getArtistInfo();
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

    private SearchArtistBean getSearchArtistBean() {
        if(!session.containsKey("searchArtistBean"))
            this.setSearchArtistBean(new SearchArtistBean());
        return (SearchArtistBean) session.get("searchArtistBean");
    }

    private void setSearchArtistBean(SearchArtistBean searchArtistBean) {
        this.session.put("searchArtistBean", searchArtistBean);
    }

    @Override
    public void setSession(Map<String, Object> session) {
        this.session = session;
    }
}
