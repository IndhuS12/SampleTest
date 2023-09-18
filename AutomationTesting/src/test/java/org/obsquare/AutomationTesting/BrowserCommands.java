package org.obsquare.AutomationTesting;

public class BrowserCommands extends Base {
	
	public void browserCommands()
	{
		String Url=driver.getCurrentUrl();
		String Pagesource=driver.getPageSource();
		String Title=driver.getTitle();
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserCommands browsercommands =new BrowserCommands();
		browsercommands.InitializeBrowser();
		browsercommands.browserCommands();

	}

}
