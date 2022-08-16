package scripts;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.AddToCartPage;
import pomPages.SkillraryDemoPage;
import pomPages.SkillraryPage;

public class Testcase1 extends BaseClass{
	@Test
	public void tc1() {
		SkillraryPage s=new SkillraryPage(driver);
		s.gearsbutton();
		s.skillrarydemoapplication();
		
		driverutilities.switchTabs(driver);
		SkillraryDemoPage sd=new SkillraryDemoPage(driver);
		driverutilities.mouseHover(driver, sd.getCoursetab());
		sd.seleniumtraining();
		
		AddToCartPage a= new AddToCartPage(driver);
		driverutilities.doubleClick(driver,a.getAddbtn());
		a.addtocartbutton();
		driverutilities.alertpopup(driver);
	}

}
