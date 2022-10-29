package wolt.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

/**
 * Class contains all the steps that can be done from the Gift Card Shop page.
 */
public class GiftCardShopSteps extends StepsBase {

    @Then("I click on VenueInformation Button")
    public void iSeeVenueInformationButton() {
        giftCardShopPage.clickOnVenueInformationButton();
    }

    @Then("I close the City Map Pop-up")
    public void iCloseTheCityMap() {
        giftCardShopPage.cityMapPopUp();
        giftCardShopPage.clickOnCloseBtn();
    }

    @Then("I click on Login Button")
    public void iClickOnLoginButton() {
        giftCardShopPage.clickOnLoginBtn();
    }

    @Then("I click on Favorite Button")
    public void iClickOnFavoriteButton() {
        giftCardShopPage.clickOnFavoriteBtn();
    }

    @And("I close the Create an account or log Pop-up")
    public void iCloseTheCreateAnAccountOrLogInPopUp() {
        giftCardShopPage.createAccountOrLoginPopUp();
        giftCardShopPage.clickOnCloseBtn();
    }

    @Then("I click on Gifts Categories")
    public void iClickOnGiftsCategories() {
        giftCardShopPage.clickOnGiftsLink();
    }

    @Then("I see {} Card and click on it")
    public void iSeeGiftCard(String gift) {
        List<String> cards = giftCardShopPage.getGiftCardTexts();
        Assert.assertTrue(cards.contains(gift));
        giftCardShopPage.clickOnGiftCard();
    }

    @And("I close Gift Card Pop-up")
    public void iCloseGiftCardPopUp() {
        giftCardShopPage.clickOnCloseBtn();
    }

    @Then("I click on Add To Order Button")
    public void iClickOnAddToOrderButton() {
        giftCardShopPage.clickOnAddToOrdetBtn();
    }

    @Then("I click on Login To Order Button")
    public void iClickOnLoginToOrderButton() {
        giftCardShopPage.clickOnloginToOrderBtn();
    }

    @And("I Remove from order Gift Card")
    public void iRemoveFromOrderGiftCard() {
        giftCardShopPage.removeFromOrderGiftCard();
    }
}
