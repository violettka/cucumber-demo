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

    @Then("I see {} Card and click on it")
    public void iSeeGiftCard(String gift) {
        List<String> cards = giftCardShopPage.getGiftCardTexts();
        Assert.assertTrue(cards.contains(gift));
        giftCardShopPage.clickOnGiftCard();
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
