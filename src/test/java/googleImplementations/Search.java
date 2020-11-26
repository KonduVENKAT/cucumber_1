package googleImplementations;

public class Search {
	public String displayLinkText(LinkPage lp)
	{
		if(lp.linkTexts().contains(lp.getLinkString()))
		{
			return lp.getLinkString();
		}
		return null;
		
	}
	
	

}
