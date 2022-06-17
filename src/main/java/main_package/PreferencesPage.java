package main_package;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PreferencesPage extends Mobile_Gestures{

    public PreferencesPage(AppiumDriver<MobileElement> appiumDriver) {
        super(appiumDriver);
    }
    @AndroidFindBy(xpath="//android.widget.TextView[@text='3. Preference dependencies']")
    MobileElement preferencedependencies;
    public void clickpreferencedependencies(){click(preferencedependencies);}
    @AndroidFindBy(id="android:id/checkbox")
    MobileElement wifi;
    public void clickwifi(){click(wifi);}
    @AndroidFindBy(xpath="//android.widget.TextView[@text='WiFi settings']")
    MobileElement wifisetting;
    public void clickwifisettings(){click(wifisetting);}

    public String getwifisettingenabled(){
        String result= wifisetting.getAttribute("enabled");
        return result;
    }


    @AndroidFindBy(id="android:id/button1")
    MobileElement okbutton;
    public void clickokbutton(){click(okbutton);}
    @AndroidFindBy(className="android.widget.EditText\n")
    MobileElement wifisettingedit;

    public void writewifisetting()
    { wifisettingedit.sendKeys("Hello!!");

    }
}