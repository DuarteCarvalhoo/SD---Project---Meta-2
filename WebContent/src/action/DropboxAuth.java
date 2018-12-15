package action;

import com.github.scribejava.core.oauth.OAuthService;
import rest.DropBoxApi2;
import rest.DropBoxRestClient;
import com.github.scribejava.core.builder.ServiceBuilder;
import com.github.scribejava.core.exceptions.OAuthException;
import com.github.scribejava.core.model.*;
import com.github.scribejava.core.oauth.OAuthService;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class DropboxAuth extends DropBoxRestClient {
    private String url;
    public String getUrl(){
        return url;
    }

    public String execute() throws Exception {
        OAuthService service = createService();
        url = service.getAuthorizationUrl(null);
        return "redirect";
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
