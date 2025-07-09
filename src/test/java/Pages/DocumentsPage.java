package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class DocumentsPage {

    WebDriver driver;

    @FindBy(xpath = "//div[contains(text(),'Official Insurance Documents')]")
    WebElement documentLayout_xpath;

    @FindBy(id = "btnDownloadDocument_AMENDMENT")
    WebElement requestPolicyScheduleButton_xpath;

    @FindBy(xpath = "//div[contains(text(),'Policy schedule')]")
    WebElement policySchedulePage_xpath;

    @FindBy(id = "NextBtn-question-steps")
    WebElement policyScheduleDoneButton_xpath;

    @FindBy(xpath = "//div[contains(text(),'Policy schedule')]")
    WebElement policyScheduleConfirmationPage_xpath;

    @FindBy(id = "btnQuickAmendDialogNext")
    WebElement policyScheduleConfirmationDoneButton_xpath;

    @FindBy(xpath = "//div[contains(text(),'Monthly payment date')]")
    WebElement homePage_xpath;


    public void verifyDocumentLayout(String actualText) {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(visibilityOf(documentLayout_xpath));
        actualText = documentLayout_xpath.getText();
        Assert.assertEquals(actualText, "Official Insurance Documents");
    }

    public void clickRequestPolicyScheduleButton() {
        requestPolicyScheduleButton_xpath.click();
    }

    public void verifyPolicySchedulePage(String actualText) {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(visibilityOf(policySchedulePage_xpath));
        actualText = policySchedulePage_xpath.getText();
        Assert.assertEquals(actualText, "Policy schedule");

    }

    public void clickPolicyScheduleDoneButton() {
        policyScheduleDoneButton_xpath.click();
    }

    public void verifyPolicyScheduleConfirmationPage(String actualText) {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(visibilityOf(policyScheduleConfirmationPage_xpath));
        actualText = policyScheduleConfirmationPage_xpath.getText();
        Assert.assertEquals(actualText, "Policy schedule");

    }

    public void clickPolicyScheduleConfirmationDoneButton() {
        policyScheduleConfirmationDoneButton_xpath.click();
    }

    public void verifyHomePage(String actualText) {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(visibilityOf(homePage_xpath));
        actualText = homePage_xpath.getText();
        Assert.assertEquals(actualText, "Monthly payment date");
    }


}
