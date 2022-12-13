package com.orangehrmlive.pages;

import com.aventstack.extentreports.Status;
import com.orangehrmlive.customlisteners.CustomListeners;
import com.orangehrmlive.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ForgotPassword extends Utility {
    @CacheLookup
    @FindBy(xpath = "//p[@class = 'oxd-text oxd-text--p orangehrm-login-forgot-header']")
    WebElement forgotPassword;
    @CacheLookup
    @FindBy(xpath = "//h6[@class = 'oxd-text oxd-text--h6 orangehrm-forgot-password-title']")
    WebElement resetPasswordText;

    public void clickOnForgotPassword() {
        Reporter.log("clickOnForgotPassword" + forgotPassword.toString());
        clickOnElement(forgotPassword);
        CustomListeners.test.log(Status.PASS, "clickOnForgotPassword");
    }

    public String getResetPasswordText() {
        Reporter.log("getResetPasswordText" + resetPasswordText.toString());
        CustomListeners.test.log(Status.PASS, "getResetPasswordText");
        return getTextFromElement(resetPasswordText);
    }

}
