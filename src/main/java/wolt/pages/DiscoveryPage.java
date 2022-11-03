package wolt.pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class DiscoveryPage extends Page {

    //locators
    protected static By categoryName = By.cssSelector(".CategoryCardBody__Header-sc-1quwqfy-2");
    protected static By cityTextExist = By.cssSelector("#mainContent>nav>div>div.SubNavigationContainer__Start-sc-1fcwc14-1.hDmuOM>button>span>span");
    protected static By signUpButton = By.xpath("//*[@data-test-id='UserStatus.Signup']");
    protected static By emailField = By.xpath("//*[@data-test-id='MethodSelect.EmailInput']");
    protected static By nextButton = By.xpath("//*[@data-test-id='StepMethodSelect.NextButton']");
    protected static By errorMessage = By.xpath("//*[@data-test-id='MethodSelect.EmailInputError']");

    //methods
    public void clickOnMenu(String menuOption) {
        $(By.linkText(menuOption)).click();
    }

    public List<String> getRestaurantCategoriesTexts() {
        $(categoryName).shouldBe(visible);
        return $$(categoryName).texts();
    }

    public Homepage clickOnLogo() {
        $(logo).click();
        return page(Homepage.class);
    }

    public void checkCityText(String city) {
        $(cityTextExist).shouldBe(visible);
        $(cityTextExist).shouldHave(Condition.text(city));
    }

    public void clickOnSignUpBtn() {
        $(signUpButton).click();
    }

    public void inputIncorrectEmail(String incorrectEmail) {
        $(emailField).setValue(incorrectEmail);
    }

    public void clickOnNextBtn() {
        $(nextButton).click();
    }

    public void checkErrorMessageExists() {
        $(errorMessage).shouldHave(text("Please enter a valid email."));
    }

}
