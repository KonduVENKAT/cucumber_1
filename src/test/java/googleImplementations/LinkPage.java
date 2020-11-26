package googleImplementations;

import java.util.ArrayList;
import java.util.List;

public class LinkPage {
	private String  linkString=null;
	// private for encapsulation achieving what we will achieve for encapsulation 
	/**
	 * @return the linkString
	 */
	public String getLinkString() {
		return linkString;
	}

	/**
	 * @param linkString the linkString to set
	 */
	public void setLinkString(String linkString) {
		this.linkString = linkString;
	}

	public LinkPage(String linkTxt)
	{
	this.linkString=linkTxt;	
	}
// for above variables for getting that values we need to generate getters and setters 
// How to generate getters and setters

	
	public List<String> linkTexts()
	{
		
		List<String> links=new ArrayList<String>();
		links.add(linkString);
		links.add("Facebook.com");
		links.add("google.com;");
		links.add("gmail.com");
		links.add("shine.com");
		links.add("nukari.com");
		
		// Like the above we have to add number of link text are passed to achieve the DataDriven approach through BBD 
			
		return links;
		
	}
	
	
}
