package action;

import com.github.scribejava.core.model.OAuthRequest;
import com.github.scribejava.core.model.Token;
import com.github.scribejava.core.oauth.OAuthService;
import org.apache.struts2.interceptor.SessionAware;

public class GetMusic extends DropboxAuthRedirect implements SessionAware {
    private String url,path;

    public String execute() throws Exception {
        OAuthService service = createService();
        url = "file:///C:/Users/fabio/Desktop/h.mp3";
        path = "/Apps/h.mp3";
        Token accessToken = new Token("bMizrFH9wWAAAAAAAAAAZOclfZZpEdzbo7QY-x6oC6FSnlinUj32BY7Aw6XpMszr","");
        downloadFile("/Apps/h.mp3",service,accessToken);
        return "success";
    }

    public void setUrl (String url){
        this.url = url;
    }
}
