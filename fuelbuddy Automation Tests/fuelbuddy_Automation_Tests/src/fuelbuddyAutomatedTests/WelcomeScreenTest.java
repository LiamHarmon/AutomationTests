package fuelbuddyAutomatedTests;

import org.testng.annotations.Test;

import fuelbuddyMainClasses.WelcomeScreen;

import org.testng.Assert;

public class WelcomeScreenTest extends BaseTestClass {
	
	@Test
	public void testFuelBuddyLogo() {
		WelcomeScreen welcomeScreen = new WelcomeScreen(driver);
		boolean actualValue = welcomeScreen.isFuelBuddyLogoDisplayed();
		Assert.assertTrue(actualValue, "The FuelBuddy logo is not displayed.");
	}
	
	@Test
	public void testWelcomeText() {
		WelcomeScreen welcomeScreen = new WelcomeScreen(driver);
        String actualText = welcomeScreen.getWelcomeText();
        String expectedText = "Welcome";
        Assert.assertEquals(actualText, expectedText, "The welcome text does not match the expected value.");
	}

    @Test
    public void testWelcomeSloganText() {
        WelcomeScreen welcomeScreen = new WelcomeScreen(driver);
        String actualText = welcomeScreen.getWelcomeSloganText();
        String expectedText = "The Friend Your Tank Deserves.";
        Assert.assertEquals(actualText, expectedText, "The welcome slogan text does not match the expected value.");
    }
}
