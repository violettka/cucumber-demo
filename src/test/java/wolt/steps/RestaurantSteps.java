package wolt.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import static com.codeborne.selenide.Selenide.open;
import static wolt.Constants.BASE_URL;

public class RestaurantSteps extends StepsBase {


    @Given("I am on the Restaurant page in {}")
    public void IAmOnTheRestaurantPage(String city) {
        open(BASE_URL + city.toLowerCase() + "/restaurant/sticksnsushi");
        restaurantPage.accCookies();
    }

    @When("I click {} menu category")
    public void iClickMenuCategory(String category) {
        restaurantPage.clickOnMenuCategory(category);
    }

    @Then("I see {} menu title")
    public void iSeeMenuTitle(String title) {
        restaurantPage.checkMenuTitle(title);
    }
}
