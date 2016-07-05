package sam.tools.rad.action;

import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import sam.tools.rad.interfaces.SaveMenu;

public class WebserviceAction extends BaseAction implements SaveMenu{
	private static final long serialVersionUID = -2745320037433082495L;
	private static final String URI = "http://localhost:8080/rad/rest";
	private List<String> myList;

	public String execute(){
		Client client = ClientBuilder.newClient();
		WebTarget webTarget = client.target(URI).path("demorestservice");
		Invocation.Builder invocationBuilder = webTarget.request(MediaType.APPLICATION_JSON);
		Response response = invocationBuilder.get();
		setMyList(response.readEntity(new GenericType<List<String>>(){}));
		
		return SUCCESS;
	}

	public List<String> getMyList() {
		return myList;
	}

	public void setMyList(List<String> myList) {
		this.myList = myList;
	}


}
