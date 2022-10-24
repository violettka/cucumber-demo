package wolt.steps;

import io.cucumber.java.en.Then;

public class HomePageSteps extends StepsBase {
    @Then("I should see Homepage")
    public void iShouldSeeHomepage() {
        homepage.homePageTextExist();
    }
}
