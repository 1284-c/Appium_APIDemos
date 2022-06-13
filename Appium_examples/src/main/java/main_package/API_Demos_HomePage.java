package main_package;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class API_Demos_HomePage extends Mobile_Gestures{

    public API_Demos_HomePage(AppiumDriver<MobileElement> appiumDriver) {
        super(appiumDriver);
    }
    @AndroidFindBy(accessibility ="Views")
    MobileElement views;
    @AndroidFindBy(accessibility = "Lists")
    MobileElement lists;
    public void clickViews(){click(views);}
    public void swipetoList(){swipe(DIRECTION.DOWN);}
    public void clickLists(){click(lists);}


    }