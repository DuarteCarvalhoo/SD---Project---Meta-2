package action;

import com.opensymphony.xwork2.ActionSupport;
import model.RegisterBean;
import org.apache.struts2.interceptor.SessionAware;

import java.util.Map;

public class Register extends ActionSupport implements SessionAware {
    private static final long serialVersionUID = 4L;
    private String username = "", password = "";
    private Map<String,Object> session;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String execute() throws Exception {
        System.out.println(username + " + " + password);
        // any username is accepted without confirmation (should check using RMI)
        if((this.username != null && !username.equals("")) && (this.password !=null && !password.equals(""))) {
            this.getRegisterBean().setUsername(this.username);
            this.getRegisterBean().setPassword(this.password);
            System.out.println("oof");
            return SUCCESS;
        }
        else
            System.out.println("oops");
            return LOGIN;
    }

    public RegisterBean getRegisterBean() {
        if(!session.containsKey("registerBean"))
            this.setRegisterBean(new RegisterBean());
        return (RegisterBean) session.get("registerBean");
    }

    private void setRegisterBean(RegisterBean registerBean) {
            this.session.put("registerBean", registerBean);
    }

    @Override
    public void setSession(Map<String, Object> session) {
        this.session = session;
    }
}
