package com.orangehrmlive.pages;

import com.aventstack.extentreports.Status;
import com.orangehrmlive.customlisteners.CustomListeners;
import com.orangehrmlive.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage extends Utility {
    @CacheLookup
    @FindBy(name = "username")
    WebElement usernameField;
    @CacheLookup
    @FindBy(name = "password")
    WebElement passwordField;
    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement loginButton;
    @CacheLookup
    @FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")
    WebElement dashboardText;

    public void enterUsername(String username) {
        Reporter.log("enterUsername" + usernameField.toString());
        sendTextToElement(usernameField, username);
        CustomListeners.test.log(Status.PASS,"enterUsername");
    }

    public void enterPassword(String password) {
        Reporter.log("enterPassword" + passwordField.toString());
        sendTextToElement(passwordField, password);
        CustomListeners.test.log(Status.PASS,"enterPassword");
    }

    public void clickOnLoginButton() {
        Reporter.log("clickOnLoginButton" + loginButton.toString());
        clickOnElement(loginButton);
        CustomListeners.test.log(Status.PASS,"clickOnLoginButton");
    }

    public String getDashboardText() {
        Reporter.log("getDashboardText" + dashboardText.toString());
        CustomListeners.test.log(Status.PASS,"getDashboardText");
        return getTextFromElement(dashboardText);
    }
}
