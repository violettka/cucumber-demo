package wolt.pages;

import io.cucumber.datatable.DataTable;
import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

/**
 * Class contains locators and methods that can be used at contact request.
 */
public class ContacRrequestPage extends Page {

    //locators
    protected static By title = By.xpath("//div[@data-localization-key='wolt-at-work.self-signup.get-started-form-section.title']");
    protected static By email = By.xpath("//input[@name='email']");
    protected static By companyName = By.xpath("//input[@name='company']");
    protected static By companySize = By.xpath("//select[@name='corporate_employees_count']");
    protected static By country = By.xpath("//select[@name='country']");
    protected static By signUpBtn = By.xpath("//button[@data-test-id='woltAtWork.signupForFreeButton']");
    protected static By contactUsBtn = By.xpath("//button[@data-test-id='woltAtWork.contactRequestButton']");

    //methods
    public void iSeeTitle() {
        $(title).shouldHave(text("Get started with Wolt at Work"));
    }

    public void fillInCreds(DataTable usercredentials) {
        //Write the code to handle Data Table
        List<List<String>> data = usercredentials.asLists(String.class);
        //This is to get the first data of the set (First Row + First Column)
        $(email).sendKeys(data.get(0).get(0));
        //This is to get the first data of the set (First Row + Second Column)
        $(companyName).sendKeys(data.get(0).get(1));
        //This is to click on options
//        $(companySize + "/option[@value='" + data.get(0).get(2) + "']").click();
//        $(country + "/option[text()='" + data.get(0).get(3) + "']").click();
    }

    public void contactUsBtnClick() {
        $(contactUsBtn).click();
    }
}
