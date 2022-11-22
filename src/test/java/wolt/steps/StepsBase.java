package wolt.steps;

import io.cucumber.java.en.When;
import wolt.pages.DiscoveryPage;
import wolt.pages.Homepage;
import wolt.pages.JobsPage;

/**
 * Class StepsBase contains all base steps.
 */
public class StepsBase {
    public DiscoveryPage discoveryPage = new DiscoveryPage();
    public static Homepage homepage;
    public static JobsPage jobsPage;



}

