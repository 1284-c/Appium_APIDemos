package test_package;

import main_package.API_Demos_HomePage;
import org.testng.annotations.Test;

public class Test_Case_1 extends Base_Class{
    API_Demos_HomePage api_demos_homePage;

    @Test
    public void test1() throws InterruptedException {
       api_demos_homePage = new API_Demos_HomePage(appiumDriver);
        api_demos_homePage.clickViews();
       // appiumDriver.findElementByAccessibilityId("Views").click();



    }
}
