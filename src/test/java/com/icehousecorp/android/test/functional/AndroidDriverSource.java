package com.icehousecorp.android.test.functional;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import net.thucydides.core.webdriver.DriverSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class AndroidDriverSource implements DriverSource {

    public static AndroidDriver<AndroidElement> ANDROID_DRIVER;

    @Override
    public WebDriver newDriver() {

        DesiredCapabilities desiredCapabilities;

        desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("automationName", "uiautomator2");
        desiredCapabilities.setCapability("deviceName", "Android");
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("app", "");
        desiredCapabilities.setCapability("appPackage", "com.example.android.architecture.blueprints.todomvvmlive.mock");
        desiredCapabilities.setCapability("appActivity", "com.example.android.architecture.blueprints.todoapp.tasks.TasksActivity");
        desiredCapabilities.setCapability("noReset", false);

        try {
            ANDROID_DRIVER = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"), desiredCapabilities);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ANDROID_DRIVER;
    }

    @Override
    public boolean takesScreenshots() {
        return true;
    }
}
