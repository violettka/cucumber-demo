package wolt.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

import static com.codeborne.selenide.Selenide.open;
import static wolt.Constants.BASE_URL;

/**
 * Class contains all the steps that can be done from the Gift Card Shop page.
 */
public class GiftCardShopSteps extends StepsBase {

    @Then("I click on VenueInformation Button")
    public void iSeeVenueInformationButton() {
        giftCardShopPage.clickOnVenueInformationButton();
        giftCardShopPage.cityMapPopUp();
    }

    @Then("I close Pop-up")
    public void iCloseTheCityMap() {
        giftCardShopPage.clickOnCloseBtn();
    }

    @Then("I click on Login Button")
    public void iClickOnLoginButton() {
        giftCardShopPage.clickOnLoginBtn();
        giftCardShopPage.createAccountOrLoginPopUp();
    }

    @Then("I click on Favorite Button")
    public void iClickOnFavoriteButton() {
        giftCardShopPage.clickOnFavoriteBtn();
    }

    @Then("I click on Gifts Categories")
    public void iClickOnGiftsCategories() {
        giftCardShopPage.clickOnGiftsLink();
    }

    @When("I click on {} Card")
    public void iClickOnGiftCard(String gift) {
        List<String> cards = giftCardShopPage.getGiftCardTexts();
        Assert.assertTrue(cards.contains(gift));
        giftCardShopPage.clickOnGiftCard();
    }

    @When("I click on Add To Order Button")
    public void iClickOnAddToOrderButton() {
        giftCardShopPage.clickOnAddToOrdetBtn();
    }

    @Then("I see Login To Order Button")
    public void iClickOnLoginToOrderButton() {
        giftCardShopPage.iSeeloginToOrderBtn();
    }

    @And("I Remove from order Gift Card")
    public void iRemoveFromOrderGiftCard() {
        giftCardShopPage.removeFromOrderGiftCard();
    }

    @Given("I open Gift card shop in {} in {}")
    public void iOpenGiftCardShopInBerlin(String city, String country) {
        open(BASE_URL);
        homepage.accCookies();
        if (!homepage.checkForLocalCountry().equals(country)) {
            homepage.showAllCountriesBtnClick();
            homepage.clickOnCountryName(country);
        }
        discoveryPage = homepage.clickOnCityName(city);
        discoveryPage.clickOnGiftCardShop();
    }

    @Then("I see {} pop-up")
    public void iSeeGiftCardPopUp(String gift) {
        Assert.assertTrue((giftCardShopPage.getGiftCardHeaderTexts()).equals(gift));
    }
}
