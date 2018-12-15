package action;

import com.github.scribejava.core.model.Response;
import com.github.scribejava.core.oauth.OAuthService;
import com.sun.net.httpserver.HttpContext;
import org.apache.struts2.dispatcher.HttpHeaderResult;
import rest.DropBoxRestClient;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

public class DropboxAuthRedirect extends DropBoxRestClient {
    private String url;
    public String execute() throws Exception {
        OAuthService service = createService();
        
        return "success";
    }
}
