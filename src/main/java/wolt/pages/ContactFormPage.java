package wolt.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

/**
 * Class contains locators and methods that can be used at contact form.
 */
public class ContactFormPage extends Page {

    //locators
    protected static By email = By.xpath("//input[@name='email']");
    protected static By companyName = By.xpath("//input[@name='company']");

    //methods
    public void iSeeCreds() {
        $(email).getText();
        $(companyName).getText();
    }
}
