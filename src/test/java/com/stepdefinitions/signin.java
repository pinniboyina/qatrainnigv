package com.stepdefinitions;

import com.pages.signIn_page;
import com.webDriverClass;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class signin extends webDriverClass {


   signIn_page signInPage= PageFactory.initElements(driver, signIn_page.class);



    @Given("^I goto url as  \"([^\"]*)\"$")
    public void iGotoUrlAs(String URL) {

        signInPage.GotoURL(URL);


    }



    @When("^I click register button$")
    public void iClickRegisterButton() {
        signInPage.ClickRegisterbutton();
    }

    @Given("^enter first name as “Kalyani”$")
    public void enterFirstNameAsKalyani() {

    }

    @Given("^enter last name as “Abhi”$")
    public void enterLastNameAsAbhi() {

    }
//
//    @Given("^enter email id as \"([^\"]*)\"$")
//    public void enterEmailIdAs(String arg0) {
//    }

//    @Given("^enter password as “fun(\\d+)”$")
//    public void enterPasswordAsFun(int arg0) {
//
//    }

    @Given("^confirm pass word “fun(\\d+)”$")
    public void confirmPassWordFun(int arg0) {

    }

    @When("^I click registration button$")
    public void iClickRegistrationButton() {

    }

    @Then("^I should see my account button$")
    public void iShouldSeeMyAccountButton() {
    }

    @Then("^I should see logout button$")
    public void iShouldSeeLogoutButton() {

    }

    @Then("^I should see firstname as header$")
    public void iShouldSeeFirstnameAsHeader() {

    }

    @Then("^I should not see signin button$")
    public void iShouldNotSeeSigninButton() {
    }

    @When("^I click contact us  button$")
    public void iClickContactUsButton() {

    }

    @Given("^enter first name as \"([^\"]*)\"$")
    public void enterFirstNameAs(String arg0) {

    }


    @Given("^enter last name as \"([^\"]*)\"$")
    public void enterLastNameAs(String arg0)  {

    }



    @Given("^phone number as \"([^\"]*)\"$")
    public void phoneNumberAs(String arg0)  {

    }

    @When("^I click \"([^\"]*)\"  button$")
    public void iClickButton(String arg0)  {

    }

    @And("^I enter subject as \"([^\"]*)\"$")
    public void iEnterSubjectAs(String arg0)  {

    }
    @And("^I enter message as \"([^\"]*)\"$")
    public void iEnterMessageAs(String arg0)  {

    }

    @When("^I click send button$")
    public void iClickSendButton() {
    }


    @Then("^I should see message \"([^\"]*)\"$")
    public void iShouldSeeMessage(String arg0)  {

    }


    @When("^I click \"([^\"]*)\"$")
    public void iClick(String arg0)  {

    }

    @Then("^I should see my \"([^\"]*)\"$")
    public void iShouldSeeMy(String arg0)  {

    }

    @Then("^I should see \"([^\"]*)\"$")
    public void iShouldSee(String arg0)  {

    }

    @Then("^I should see \"([^\"]*)\" as header$")
    public void iShouldSeeAsHeader(String arg0)  {

    }

    @Then("^I should not see \"([^\"]*)\"$")
    public void iShouldNotSee(String arg0)  {

    }


    @And("^I enter capatcha code as \"([^\"]*)\"$")
    public void iEnterCapatchaCodeAs(String arg0) {

    }

    @Then("^I should see a message \"([^\"]*)\"$")
    public void iShouldSeezMessage(String arg0)  {

    }

    @Given("^enter confirm password as \"([^\"]*)\"$")
    public void enterConfirmPasswordAs(String arg0)  {

    }




    @When("^I click sign in button$")
    public void iClickSignInButton() {
        signInPage.clickSignInbutton();

    }

    @Given("^enter email id as \"([^\"]*)\"$")
    public void enterEmailIdAs(String emailid) {
        signInPage.enterEmailAddress(emailid);
    }


    @Given("^enter password as \"([^\"]*)\"$")
    public void enterPasswordAs(String password)  {

        signInPage.enterPassword(password);

    }

    @When("^click the \"([^\"]*)\" on sign in page$")
    public void clickThesigninbuttonOnSignInPage(String arg0)  {
        signInPage.clickSignInbuttonOnSignInPage();


    }

    @Then("^I should see error message as \"([^\"]*)\"$")
    public void iShouldSeeErrorMessageAs(String errorMessage_Exp)  {
        signInPage.asserterrormessageOnSignInPage(errorMessage_Exp);

    }

    @When("^click the \"([^\"]*)\"$")
    public void clickThe(String arg0)  {

    }
}

