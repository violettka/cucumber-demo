package wolt.steps;

import io.cucumber.java.en.Then;

public class JobsSteps extends StepsBase {
    @Then("I see text {string} on Jobs page")
    public void iSeeTextOnJobsPage(String arg0) {
        jobsPage.iSeeJoinUs();
    }
}