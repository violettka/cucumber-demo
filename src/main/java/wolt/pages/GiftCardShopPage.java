package wolt.pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

/**
 * Class contains all Gift Card Shop locators and methods.
 */
public class GiftCardShopPage extends Page{

    //locators
    protected static By venueInformationButton = By.xpath("//button[@data-test-id='venue-information-button']");
    protected static By loginBtn = By.xpath("//button[@data-test-id='UserStatus.Login']");
    protected static By closeBtn = By.xpath("//button[@data-test-id='modal-close-button']");
    protected static By favoriteBtn = By.xpath("//button[@aria-label='Favorite']");
    protected static By googleBtn = By.xpath("//button[@data-test-id='MethodSelect.Google']");
    protected static By appleBtn = By.xpath("//button[@data-test-id='MethodSelect.Apple']");
    protected static By facebookBtn = By.xpath("//button[@data-test-id='MethodSelect.Facebook']");
    protected static By nextBtn = By.xpath("//button[@data-test-id='StepMethodSelect.NextButton']");
    protected static By emailInput = By.xpath("//input[@data-test-id='MethodSelect.EmailInput']");

    //methods
    public void clickOnVenueInformationButton() {
        $(venueInformationButton).shouldBe(Condition.exist).click();
    }

    public void clickOnCloseBtn() {
        $(closeBtn).shouldBe(Condition.exist).click();
    }

    public void clickOnLoginBtn() {
        $(loginBtn).click();
    }

    public void clickOnFavoriteBtn() {
        $(favoriteBtn).click();
    }

    public void createAccountOrLoginPopUp() {
        $(googleBtn).exists();
        $(appleBtn).exists();
        $(facebookBtn).exists();
        $(emailInput).exists();
        $(nextBtn).shouldBe(Condition.visible);
    }
}
