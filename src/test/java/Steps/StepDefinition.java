package Steps;

import Utils.TakeScreenShots;
import io.cucumber.java.en.*;


public class StepDefinition extends Base {

    //-------------------------LOGIN STEPS-----------------------------------
    @Given("Iam on the A&G Website")
    public void iam_on_the_a_g_website() {
        loginpage.VerifyWelcomeTextDisplayed();
    }

    @When("I enter the id passport number (.*)$")
    public void iEnterTheIdPassportNumberId(String id) {
        loginpage.EnterID(id);
    }

    @And("I click on the Login button")
    public void i_click_on_the_login_button() {
        loginpage.ClickLoginButton();
    }

    @Then("I am redirected to the options page")
    public void i_am_redirected_to_the_options_page() {
        loginpage.VerifyOptionPageIsDisplayed();
    }

    @When("I select the PhoneNumber option")
    public void i_select_the_phone_number_option() {
        loginpage.SelectPHoneNumber();
    }

    @Then("I am redirected to the OTP Page")
    public void i_am_redirected_to_the_otp_page() {
        loginpage.VerifyOtpPage();
    }

    @When("I enter the OTP (.*)$")
    public void i_enter_the_otp(String otp) {
        loginpage.EnterOTP(otp);
    }

    @And("I click on the OTPLogin button")
    public void i_click_on_the_otp_login_button() {
        loginpage.ClickOTPLoginButton();
    }

    @Then("I am redirected to the A&G Dashboard")
    public void i_am_redirected_to_the_a_g_dashboard() {
        takeScreenShots.takesSnapShot(driver, "Dashboard");
        loginpage.VerifyDashboardPage();
    }


    //-------------------------DOCUMENTS STEPS-----------------------------------
    @Given("I am on the Documents Layout Page")
    public void i_am_on_the_documents_layout_page() {
        documentsPage.verifyDocumentLayout("Official Insurance Documents");
    }

    @When("I click on the Request Document button for Policy schedule")
    public void i_click_on_the_request_document_button_for_policy_schedule() {
        documentsPage.clickRequestPolicyScheduleButton();
    }

    @Then("I am redirected to the Policy schedule Page")
    public void i_am_redirected_to_the_policy_schedule_page() {
        documentsPage.verifyPolicySchedulePage("Policy schedule");
    }

    @When("I click on the Done button")
    public void i_click_on_the_done_button() {
        documentsPage.clickPolicyScheduleDoneButton();

    }

    @Then("I am redirected to the Policy schedule confirmation Page")
    public void i_am_redirected_to_the_policy_schedule_confirmation_page() {
        documentsPage.verifyPolicyScheduleConfirmationPage("Policy schedule");

    }
    @When("I click on the confirmation done button")
    public void i_click_on_the_confirmation_done_button() {
        documentsPage.clickPolicyScheduleConfirmationDoneButton();

    }
    @Then("I am redirected to the Home Page")
    public void i_am_redirected_to_the_home_page() {
        documentsPage.verifyHomePage("Monthly payment date");

    }



}
