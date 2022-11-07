package wolt.pages;

import com.codeborne.selenide.Condition;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

/**
 * Class contains all Gift Card Shop locators and methods.
 */
public class GiftCardShopPage extends Page {

    //locators
    protected static By venueInformationButton = By.xpath("//button[@data-test-id='venue-information-button']");
    protected static By cityMap = By.xpath("//div[@class='leaflet-pane leaflet-map-pane']");
    protected static By loginBtn = By.xpath("//button[@data-test-id='UserStatus.Login']");
    protected static By closeBtn = By.xpath("//button[@data-test-id='modal-close-button']");
    protected static By favoriteBtn = By.xpath("//button[@aria-label='Favorite']");
    protected static By googleBtn = By.xpath("//button[@data-test-id='MethodSelect.Google']");
    protected static By appleBtn = By.xpath("//button[@data-test-id='MethodSelect.Apple']");
    protected static By facebookBtn = By.xpath("//button[@data-test-id='MethodSelect.Facebook']");
    protected static By nextBtn = By.xpath("//button[@data-test-id='StepMethodSelect.NextButton']");
    protected static By emailInput = By.xpath("//input[@data-test-id='MethodSelect.EmailInput']");
    protected static By giftsLink = By.xpath("(//a[@font-family='default'])[3]");
    protected static By giftCards = By.xpath("//span[@data-test-id='menu-item-presentational.price']");
    protected static By addToOrderBtn = By.xpath("//span[@data-localization-key='product-modal.submit.add']");
    protected static By loginToOrderBtn = By.xpath("//button[@data-test-id='CartViewButton']");
    protected static By minusBtn = By.xpath("//button[@aria-label='Remove one']");
    protected static By removeFromOrderBtn = By.xpath("//span[@data-localization-key='product-modal.submit.remove']");
    protected static By activeGiftCard = By.xpath("//span[@data-test-id='CountLabel']");
    protected static By popUp = By.xpath("//*[@data-test-id='product-modal']");
    protected static By popUpValue = By.xpath("//div[@data-modal-content-container='true']//h1");

    //methods
    public void clickOnVenueInformationButton() {
        $(venueInformationButton).shouldBe(Condition.exist).click();
    }

    public void cityMapPopUp() {
        $(cityMap).shouldBe(Condition.exist);
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
        $(googleBtn).shouldBe(visible);
        $(appleBtn).shouldBe(visible);
        $(facebookBtn).shouldBe(visible);
        $(emailInput).shouldBe(visible);
        $(nextBtn).shouldBe(visible);
    }

    public GiftsPage clickOnGiftsLink() {
        $(giftsLink).shouldBe(Condition.exist).click();
        return page(GiftsPage.class);
    }

    public List<String> getGiftCardTexts() {
        $(giftCards).shouldBe(visible);
        return $$(giftCards).texts();
    }

    public String getGiftCardHeaderTexts() {
        $(popUp).shouldBe(visible);
        return $(popUpValue).getText();
    }

    public void clickOnAddToOrdetBtn() {
        $(addToOrderBtn).shouldBe(Condition.exist).click();
    }

    public void iSeeloginToOrderBtn() {
        $(loginToOrderBtn).shouldBe(Condition.exist);
    }

    public void clickOnGiftCard() {
        $(giftCards).shouldBe(Condition.exist).click();
    }

    public void removeFromOrderGiftCard() {
        $(activeGiftCard).shouldBe(Condition.exist).click();
        $(minusBtn).shouldBe(Condition.exist).click();
        $(removeFromOrderBtn).doubleClick();
    }
}
