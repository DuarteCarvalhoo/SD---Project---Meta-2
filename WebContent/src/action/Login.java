package action;

import com.opensymphony.xwork2.ActionSupport;
import model.LoginBean;
import org.apache.struts2.interceptor.SessionAware;
import java.util.HashMap;
import java.util.Map;

public class Login extends ActionSupport implements SessionAware {
    private static final long serialVersionUID = 4L;
    private String username = "", password = "";
    private Map<String, Object> session;

    public String execute() throws Exception {
        // any username is accepted without confirmation (should check using RMI)
        if((this.username != null && !username.equals("")) && (this.password !=null && !password.equals(""))) {
            this.getLoginBean().setUsername(this.username);
            this.getLoginBean().setPassword(this.password);
            String response = this.getLoginBean().getUserMatchesPassword();
            System.out.println(response);
            switch(response){
                case "loginFail":
                    System.out.println("Entrou fail");
                    return "failed";
                case "loginComplete":
                    System.out.println("Entrou success");
                    return "worked";
                default:
                    return "rip";
            }
        }
        return "rip";
    }

    public LoginBean getLoginBean() {
        if(!session.containsKey("loginBean"))
            this.setLoginBean(new LoginBean());
        return (LoginBean) session.get("loginBean");
    }

    private void setLoginBean(LoginBean loginBean){
        this.session.put("loginBean", loginBean);
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void setSession(Map<String, Object> session) { this.session = session; }
}
