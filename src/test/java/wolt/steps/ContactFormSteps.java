package wolt.steps;

import io.cucumber.java.en.And;

public class ContactFormSteps extends StepsBase{

    @And("User sees Contact Form")
    public void iSeeContactForm() {
        contactFormPage.getMainHeaderText();
    }

//    @And("User sees entered Credentials")
//    public void iSeeEnteredCreds() {
//        contactFormPage.iSeeCreds();
//    }
}
