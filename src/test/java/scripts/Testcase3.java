package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.CarejavaPage;
import pomPages.SkillraryPage;
import pomPages.WishlistPage;

public class Testcase3 extends BaseClass{
	@Test
	public void tc3() throws IOException, InterruptedException
	{
		SkillraryPage s=new SkillraryPage(driver);
		s.searchtextbox(pdata.getData("searchtextbox"));
		s.searchbutton();
		
		CarejavaPage c=new CarejavaPage(driver);
		c.seleniumcourse();
		
		WishlistPage w=new WishlistPage(driver);
		driverutilities.switchtoframe(driver);
		w.playbutton();
		Thread.sleep(1000);
		w.pausebutton();
		driverutilities.switchbackframe(driver);
		w.wishlistbtn();
		
		
		
		
	}
	

}
