package action;

import com.opensymphony.xwork2.ActionSupport;
import model.RegisterBean;
import org.apache.struts2.interceptor.SessionAware;

import java.rmi.RemoteException;
import java.util.Map;

public class Action extends ActionSupport implements SessionAware {
    private static final long serialVersionUID = 4L;
    Map<String, Object> session;

    public RegisterBean getBean() throws RemoteException {
        if(!session.containsKey("Bean"))
            this.setBean(new RegisterBean());
        return (RegisterBean) session.get("Bean");
    }

    public void setBean(RegisterBean bean) {
        this.session.put("Been", bean);
    }

    @Override
    public void setSession(Map<String, Object> map) {
        this.session = map;
    }
}
