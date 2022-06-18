package test_package;

import main_package.API_Demos_HomePage;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class Tap_Views_Scroll_down_tap_Lists extends Base_Class{
    API_Demos_HomePage api_demos_homePage;

    @Test
    public void test1() throws InterruptedException, MalformedURLException {
        Android_setup();
       api_demos_homePage = new API_Demos_HomePage(appiumDriver);
       api_demos_homePage.clickViews();
       api_demos_homePage.swipetoList();
       api_demos_homePage.clickLists();




    }
}
