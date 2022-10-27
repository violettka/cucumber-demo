package wolt.steps;

import io.cucumber.java.en.Then;

/**
 * Class contains all the steps that can be done from the Homepage.
 */
public class HomepageSteps extends StepsBase {

    @Then("I should see Homepage")
    public void iShouldSeeHomepage() {
        homepage.homePageTextExist();
    }
}
