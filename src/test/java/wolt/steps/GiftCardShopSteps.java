package wolt.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static wolt.steps.StepsBase.giftCardShopPage;

/**
 * Class contains all the steps that can be done from the Gift Card Shop page.
 */
public class GiftCardShopSteps {

    @Then("I click on VenueInformation Button")
    public void iSeeVenueInformationButton() {
        giftCardShopPage.clickOnVenueInformationButton();
    }

    @Then("I see the City Map Pop-up")
    public void iSeeTheCityMap() {
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

    @And("I see the Create an account or log in Pop-up")
    public void iSeeTheCreateAnAccountOrLogInPopUp() {
        giftCardShopPage.createAccountOrLoginPopUp();
        giftCardShopPage.clickOnCloseBtn();
    }
}
