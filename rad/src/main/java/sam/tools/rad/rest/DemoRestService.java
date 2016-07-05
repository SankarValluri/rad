package sam.tools.rad.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Service;

@Service
@Path("/demorestservice")
public class DemoRestService {
	private List<String> demoList;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<String> getList(){
		return demoList;
	}
	

	public List<String> getDemoList() {
		return demoList;
	}


	public void setDemoList(List<String> demoList) {
		this.demoList = demoList;
	}
}
