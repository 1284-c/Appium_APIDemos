package test_package;

import io.appium.java_client.MobileElement;
import main_package.API_Demos_HomePage;
import main_package.PreferencesPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class PreferencesPage_TestCases extends Base_Class{
    API_Demos_HomePage api_demos_homePage;
    PreferencesPage preferencesPage;
    @Test
    public void click_Preferences() throws MalformedURLException, InterruptedException {
        Android_setup();

        api_demos_homePage = new API_Demos_HomePage(appiumDriver);
        api_demos_homePage.clickpreferences();
        preferencesPage = new PreferencesPage(appiumDriver);
        preferencesPage.clickpreferencedependencies();
        preferencesPage.clickwifi();
       // preferencesPage.clickwifisettings();
        Assert.assertEquals(preferencesPage.getwifisettingenabled(),"true");
        preferencesPage.clickwifisettings();
       // preferencesPage.clickeditlabel();
        preferencesPage.writewifisetting();
        preferencesPage.clickokbutton();
        preferencesPage.clickwifi();
        Assert.assertEquals(preferencesPage.getwifisettingenabled(),"false");





    }
}
