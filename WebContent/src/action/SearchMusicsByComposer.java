package action;

import model.Bean;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;
import java.util.Map;

public class SearchMusicsByComposer extends ActionSupport implements SessionAware{
    private static final long serialVersionUID = 4L;
    private String composerName = "";
    private Map<String, Object> session;

    public String execute() throws Exception{ {
        if((this.composerName != null && !composerName.equals(""))){
            String response = this.getBean().showMusicsByComposer(this.composerName);
            String[] respSplit = response.split(";");
            System.out.println(respSplit[0]);
            switch(respSplit[0]){
                case "type|musicDatabaseEmpty":
                    System.out.println("failed");
                    return "failed";
                case "type|composerNotFound":
                    System.out.println("parcial");
                    return "failedNF";
                case "type|showComposerMusicsComplete":
                    System.out.println(" nao parcial");
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

    public void setComposerName(String composerName) {
        this.composerName=composerName;
    }
}
