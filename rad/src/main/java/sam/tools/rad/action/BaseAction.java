package sam.tools.rad.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class BaseAction extends ActionSupport implements SessionAware, 
	ServletRequestAware, ServletResponseAware {
	private static final long serialVersionUID = 8737318663684604015L;

	protected Map<String, Object> session;

	public HttpServletRequest request;
	public HttpServletResponse response;
	
	public String execute(){
		
		return SUCCESS;
	}
	
	public void setServletResponse(HttpServletResponse response) {
		this.response = response;
		
	}

	public void setServletRequest(HttpServletRequest request) {
		this.request =  request;
		
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
		
	}

}
