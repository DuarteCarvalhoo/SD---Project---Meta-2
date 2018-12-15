package rest;

import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import com.github.scribejava.apis.DropBoxApi;
import com.github.scribejava.core.builder.ServiceBuilder;
import com.github.scribejava.core.exceptions.OAuthException;
import com.github.scribejava.core.model.OAuthRequest;
import com.github.scribejava.core.model.Response;
import com.github.scribejava.core.model.Token;
import com.github.scribejava.core.model.Verb;
import com.github.scribejava.core.model.Verifier;
import com.github.scribejava.core.oauth.OAuthService;

import uc.sd.apis.DropBoxApi2;


// Step 1: Create Dropbox Account

// Step 2: Create Application (https://www.dropbox.com/developers)

public class DropBoxRestClient {


	// Access codes #1: per application used to get access codes #2	
	private static final String API_APP_KEY = "ei8a3263rntvqx0";
	private static final String API_APP_SECRET = "a9xed0b1e4pxfwk";
	
	// Access codes #2: per user per application
	private static final String API_USER_TOKEN = "";

    public static String getAccessTokenSecret(Token accessToken) {
        return accessToken.getSecret();
    }

    public static Token getAccessToken(Scanner in, OAuthService service, Verifier verifier) {
        return service.getAccessToken(null, verifier);
    }

    public static String getAuthorizationUrl(OAuthService service) {
        return service.getAuthorizationUrl(null);
    }

    public static OAuthService createService() {
        return new ServiceBuilder()
        .provider(DropBoxApi2.class)
        .apiKey(API_APP_KEY)
        .apiSecret(API_APP_SECRET)
        .callback("http://localhost:8080/dropboxRedirect.action")
        .build();
    }

    public static void listFiles(OAuthService service, Token accessToken) {
		OAuthRequest request = new OAuthRequest(Verb.POST, "https://api.dropboxapi.com/2/files/list_folder", service);
		request.addHeader("authorization", "Bearer " + accessToken.getToken());
		request.addHeader("Content-Type",  "application/json");
		request.addPayload("{\n" + 
				"    \"path\": \"\",\n" + 
				"    \"recursive\": false,\n" + 
				"    \"include_media_info\": false,\n" + 
				"    \"include_deleted\": false,\n" + 
				"    \"include_has_explicit_shared_members\": false,\n" + 
				"    \"include_mounted_folders\": true\n" + 
				"}");
		
		Response response = request.send();
		System.out.println("Got it! Lets see what we found...");
		System.out.println("HTTP RESPONSE: =============");
		System.out.println(response.getCode());
		System.out.println(response.getBody());
		System.out.println("END RESPONSE ===============");
		
		
		JSONObject rj = (JSONObject) JSONValue.parse(response.getBody());
		JSONArray contents = (JSONArray) rj.get("entries");
		for (int i=0; i<contents.size(); i++) {
			JSONObject item = (JSONObject) contents.get(i);
			String path = (String) item.get("name");
			System.out.println(" - " + path);
		}
	}

    public static void addFile(String path1, OAuthService service, Token accessToken) {
        OAuthRequest request = new OAuthRequest(Verb.POST, "https://content.dropboxapi.com/2/files/upload", service);
        request.addHeader("authorization", "Bearer " + accessToken.getToken());
        request.addHeader("Dropbox-API-Arg", "{\"path\":\""+path1+"\",\"mode\":{\".tag\":\"add\"},\"autorename\":true,\"mute\":false,\"strict_conflict\":false}");
        request.addHeader("Content-Type",  "application/octet-stream");
        Response response = request.send();
        System.out.println("Got it! Lets see what we found...");
        System.out.println("HTTP RESPONSE: =============");
        System.out.println(response.getCode());
        System.out.println(response.getBody());
        System.out.println("END RESPONSE ===============");
	}

	public static String getFileMetadata(String filePath, OAuthService service, Token accessToken){
        OAuthRequest request = new OAuthRequest(Verb.POST, "https://api.dropboxapi.com/2/files/get_metadata", service);
        request.addHeader("authorization", "Bearer " + accessToken.getToken());
        request.addHeader("Content-Type",  "application/json");
        request.addPayload("{\"path\":\"/Apps/2018-SD/Contacts.txt\"}");

        Response response = request.send();
        System.out.println("Got it! Lets see what we found...");
        System.out.println("HTTP RESPONSE: =============");
        System.out.println(response.getCode());
        System.out.println(response.getBody());
        System.out.println("END RESPONSE ===============");

        JSONObject rj = (JSONObject) JSONValue.parse(response.getBody());
        return (String) rj.get("id");
    }

    public static String getCurrentAccountMail(OAuthService service, Token accessToken){
        OAuthRequest request = new OAuthRequest(Verb.POST, "https://api.dropboxapi.com/2/users/get_current_account",service);
        request.addHeader("authorization", "Bearer " + accessToken.getToken());
        request.addHeader("Content-Type",  "application/json");
        request.addPayload("null");

        Response response = request.send();
        System.out.println("Got it! Lets see what we found...");
        System.out.println("HTTP RESPONSE: =============");
        System.out.println(response.getCode());
        System.out.println(response.getBody());
        System.out.println("END RESPONSE ===============");

        JSONObject rj = (JSONObject) JSONValue.parse(response.getBody());
        return (String) rj.get("email");
    }

    public static void deleteFile(String path, OAuthService service, Token accessToken) {
      // TODO
	}

	public static void shareFile(String mail,String fileId ,OAuthService service, Token accessToken){
        System.out.println("fileId:"+fileId+"     token"+accessToken.getToken());
        OAuthRequest request = new OAuthRequest(Verb.POST, "https://api.dropboxapi.com/2/sharing/add_file_member", service);
        request.addHeader("authorization", "Bearer " + accessToken.getToken());
        request.addHeader("Content-Type",  "application/json");
        request.addPayload("{\"file\":\""+fileId+"\",\"members\":[{\".tag\":\"email\",\"email\":\""+mail+"\"}],\"access_level\":{\".tag\":\"viewer\"}}");


        Response response = request.send();
        System.out.println("Got it! Lets see what we found...");
        System.out.println("HTTP RESPONSE: =============");
        System.out.println(response.getCode());
        System.out.println(response.getBody());
        System.out.println("END RESPONSE ===============");
    }
}
