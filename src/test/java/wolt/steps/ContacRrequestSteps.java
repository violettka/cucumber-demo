package wolt.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.codeborne.selenide.Selenide.open;
import static wolt.Constants.CONTACT_REQUEST;

public class ContacRrequestSteps extends StepsBase {

    @Given("User on Get started with Wolt at Work Page")
    public static void iAmOnGSWWAWPage() {
        open(CONTACT_REQUEST);
        contacRrequestPage.accCookies();
    }

    @And("On the open page User sees the title")
    public void onTheOpenPageUserSeesTheTitle() {
        contacRrequestPage.iSeeTitle();
    }

    @When("User enters Credentials to the form")
    public void userEntersCredentialsToTheForm(DataTable usercredentials) {
        contacRrequestPage.fillInCreds(usercredentials);
    }

    @Then("User clicks on contact Us Button")
    public void userClickOnContactUsButton() {
        contacRrequestPage.contactUsBtnClick();
    }
}
