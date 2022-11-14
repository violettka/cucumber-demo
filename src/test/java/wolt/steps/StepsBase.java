package wolt.steps;

import wolt.pages.ContacRrequestPage;
import wolt.pages.ContactFormPage;
import wolt.pages.DiscoveryPage;
import wolt.pages.Homepage;

public class StepsBase {
    public DiscoveryPage discoveryPage = new DiscoveryPage();
    public static ContacRrequestPage contacRrequestPage = new ContacRrequestPage();
    public static ContactFormPage contactFormPage = new ContactFormPage();
    public static Homepage homepage;
}
