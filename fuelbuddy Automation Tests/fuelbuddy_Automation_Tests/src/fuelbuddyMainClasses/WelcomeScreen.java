package fuelbuddyMainClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class WelcomeScreen {
    private AppiumDriver<WebElement> driver;

    public WelcomeScreen(AppiumDriver<WebElement> driver2) {
        this.driver = driver2;
    }
    
	public boolean isFuelBuddyLogoDisplayed() {
		MobileElement fuelBuddyLogo = (MobileElement) driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView"));
		return fuelBuddyLogo.isDisplayed();
	}
    
    public String getWelcomeText() {
    	MobileElement welcomeTextElement = (MobileElement) driver.findElement(By.xpath("//android.widget.TextView[@text=\"Welcome\"]"));
        return welcomeTextElement.getText();
    }

    public String getWelcomeSloganText() {
        MobileElement welcomeTextElement = (MobileElement) driver.findElement(By.xpath("//android.widget.TextView[@text=\"The Friend Your Tank Deserves.\"]"));
        return welcomeTextElement.getText();
    }
}
