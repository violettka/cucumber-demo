package wolt.steps;

import io.cucumber.java.en.Then;

/**
 * Class JobsSteps contains all base steps.
 */
public class JobsSteps extends StepsBase {

    @Then("I see text {string} on Jobs page")
    public void iSeeTextOnJobsPage(String text)
    {
        jobsPage.iSeeJoinUs(text);
    }
}
