package sam.tools.rad.action;

import java.util.List;

import sam.tools.rad.amazon.AmazonItem;
import sam.tools.rad.amazon.AmazonUtility;
import sam.tools.rad.interfaces.SaveMenu;

public class AmazonAction extends BaseAction implements SaveMenu{
	private static final long serialVersionUID = -5639656320074210942L;
	
	private String keyword = "";
	private List<AmazonItem> amazonList;

	public String execute(){
		
		return SUCCESS;
	}
	
    public String getJSON() {
    	amazonList = AmazonUtility.getInstance().getSearchResults(keyword);
    	
        return SUCCESS;
    }
	public String search(){
		
		return "search";
	}
	
	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public List<AmazonItem> getAmazonList() {
		return amazonList;
	}

	public void setAmazonList(List<AmazonItem> amazonList) {
		this.amazonList = amazonList;
	}
}