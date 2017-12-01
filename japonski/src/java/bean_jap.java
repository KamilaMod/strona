
import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;

@Named(value = "bean_jap")
@SessionScoped
public class bean_jap implements Serializable{

private String login,password;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isLogged() {
        return logged;
    }
    
    private boolean logged;
    public String login(){
        if("ala".equals(login)){
            logged = true;
            return "/priv/index";
        }
        logged = false;
        return "/index";
    }
    public String logout(){
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        logged = false;
        return "/index";
    }
    
    public bean_jap() {
    }
    
}
