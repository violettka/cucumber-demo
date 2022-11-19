package wolt.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

/**
 * Class contains locators and methods that can be used from many pages of the site.
 */
public abstract class Page {

    //locators
    protected static By logo = By.id("lottie");
    protected static By mainHeader = By.xpath("(//h1)[1]");
    protected static By signUpButton = By.xpath("//*[@data-test-id='UserStatus.Signup']");
    protected static By emailField = By.xpath("//*[@data-test-id='MethodSelect.EmailInput']");
    protected static By nextButton = By.xpath("//*[@data-test-id='StepMethodSelect.NextButton']");
    protected static By errorMessage = By.xpath("//*[@data-test-id='MethodSelect.EmailInputError']");

    //methods
    public void accCookies() {
        SelenideElement element = $(By.xpath("//button[2]/div[2]"));
        if (element.exists()) {
            actions().moveToElement(element).click(element).perform();
        }
    }

    public SelenideElement buildXpathTextLocator(String text) {
        return $(By.xpath("//span[text()='" + text + "']"));
    }

    public Homepage clickOnLogo() {
        $(logo).shouldBe(visible).click();
        return page(Homepage.class);
    }

    public String getMainHeaderText() {
        $(mainHeader).shouldBe(visible);
        return $(mainHeader).getText();

    public void clickOnSignUpBtn() {
        $(signUpButton).click();
    }

    public void inputEmail(String email) {
        $(emailField).setValue(email);
    }

    public void clickOnNextBtn() {
        $(nextButton).click();
    }

    public void checkErrorMessageExists(String message) {
        $(errorMessage).shouldHave(text(message));
    }
}
