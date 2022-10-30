package wolt.steps;

import io.cucumber.java.en.Then;

public class JobsPage {

    @Then("I see CategoryField on JobsPage")
    public void iSeeCategoryFieldOnJobsPage() {
        wolt.pages.JobsPage jobsPage = new wolt.pages.JobsPage();
        jobsPage.iSeeCategoryField();

    }
}
