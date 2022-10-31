package wolt.pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class DiscoveryPage extends Page {

    protected static By categoryName = By.cssSelector(".CategoryCardBody__Header-sc-1quwqfy-2");
    protected static By allCountriesLink = By.xpath("//span[@data-localization-key='front-view.city-selection.all-countries']");
    protected static By allCountriesList = By.cssSelector(".List-module__listOfCountries___KWT6z");

    protected static By swedenOption = By.xpath("//*[@data-test-id ='front-country-link-SWE']");
    protected static By listOfCitiesInSweden = By.xpath("//*[@data-test-id ='ListOfCities']");
    protected static By malmoOption = By.xpath("//*[@data-test-id ='front-city-link-SWE-malmo']");
    protected static By malmoTextExist=By.cssSelector("#mainContent>nav>div>div.SubNavigationContainer__Start-sc-1fcwc14-1.hDmuOM>button>span>span");


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

    public void clickAllCountriesLink(){
        $(allCountriesLink).click();
    }

    public void getAllCountriesList(){
        $(allCountriesList).shouldBe(exist);
    }

    public void getSwedenOption(){
        $(swedenOption).click();
    }

    public void getListOfCitiesInSweden(){
        $(listOfCitiesInSweden).shouldBe(exist);
    }

    public void getMalmoOption(){
        $(malmoOption).click();
    }

    public void getMalmoText(){
        $(malmoTextExist).shouldHave(Condition.text("Malmö"));
    }
}
