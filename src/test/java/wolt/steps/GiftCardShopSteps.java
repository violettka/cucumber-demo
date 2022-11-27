package wolt.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

import static com.codeborne.selenide.Selenide.open;
import static wolt.Constants.*;

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
        giftCardShopPage.clickOnGiftCard(gift);
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

    @Given("I open Gift card shop in {}")
    public void iOpenGiftCardShopInBerlin(String city) {
        open(BASE_URL + city.toLowerCase() + SEND_A_GIFT_PART);
        giftCardShopPage.accCookies();
    }

    @Then("I see {} pop-up")
    public void iSeeGiftCardPopUp(String gift) {
        Assert.assertTrue((giftCardShopPage.getGiftCardHeaderTexts()).equals(gift));
    }

    @When("I select a Gift Card with values:")
    public void iSelectAGiftCardWithValues(DataTable giftCard) {
        // get dataTable values as list
        List<List<String>> cards = giftCard.asLists(String.class);
        // get first value from the dataTable (Gift Card)
        String gift = cards.get(0).get(0);
        // get second value from dataTable (num)
        int amount = Integer.parseInt(cards.get(0).get(1));
        // assert Texts
        List<String> cardTexts = giftCardShopPage.getGiftCardTexts();
        Assert.assertTrue(cardTexts.contains(gift));
        // click on THE card
        giftCardShopPage.clickOnGiftCard(gift);
        String price = gift.split("€|\\.", 3)[1];
        Assert.assertTrue(giftCardShopPage.getGiftCardHeaderTexts().contains(price));
        // select amount of gift cards
        giftCardShopPage.selectGiftCardAmount(amount);
    }
}
