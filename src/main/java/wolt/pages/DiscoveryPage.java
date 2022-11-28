package wolt.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.Collection;
import java.util.List;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

/**
 * Class contains all Discovery page locators and methods.
 */
public class DiscoveryPage extends Page {

    //locators
    protected static By categoryName = By.cssSelector(".CategoryCardBody__Header-sc-1quwqfy-2");
    protected static By quickLink = By.cssSelector(".QuickLinks-module__itemWrapper____Ne1r");
    protected static By cityTextExist = By.cssSelector("#mainContent>nav>div>div.SubNavigationContainer__Start-sc-1fcwc14-1.hDmuOM>button>span>span");
    protected static By nextBtnJoinOurTeam = By.xpath("//*[@id='mainContent']/div[3]/div/div/div[7]/div/div[1]/div/div/button[2]");
    protected static By weWantYouCard = By.xpath("//span[contains(.,'We want you!')]");
    protected static By nextBtnFrequentlyAskedQuestions = By.xpath("//*[@id=\"mainContent\"]/div[3]/div/div/div[6]/div/div[1]/div/div/button[2]");
    protected static By nextBtnGetInspired = By.xpath("//*[@id=\"mainContent\"]/div[3]/div/div/div[8]/div/div[1]/div/div/button[2]");
    protected static By orderTogetherCard = By.xpath("//*[@id='mainContent']/div[3]/div/div/div[9]/div/div[2]/div/div[4]/a/div/div/div[2]/div");
    protected static By facebookCard = By.xpath("//*[@id=\"mainContent\"]/div[3]/div/div/div[8]/div/div[2]/div/div[4]/a/div/div/div[2]/div");
    protected static By discoveryPageLayout = By.xpath("//div[@data-test-id='MainDiscoveryContent']");
    protected static By sendAGiftBtn = By.linkText("Send a gift");

    //methods
    public void clickOnMenu(String menuOption) {
        $(By.linkText(menuOption)).click();
    }

    public List<String> getRestaurantCategoriesTexts() {
        $(categoryName).shouldBe(visible);
        return $$(categoryName).texts();
    }

    public void checkCityText(String city) {
        $(cityTextExist).shouldBe(visible);
        $(cityTextExist).shouldHave(Condition.text(city));
    }

    public ElementsCollection getLinkElts() {
        $(quickLink).shouldBe(visible);
        return $$(quickLink);
    }

    public JobsPage clickOnWeWantYouCard() {
        $(weWantYouCard).shouldBe(visible).click();
        return page(JobsPage.class);
    }

    public void clickOnNextBtnInCategory(String category) {
        if (category.equals("Frequently asked questions")) {
            $(nextBtnFrequentlyAskedQuestions).shouldBe(visible).click();
        }
        if (category.equals("Join our team!")) {
            $(nextBtnJoinOurTeam).shouldBe(visible).click();
        }
        if (category.equals("Get inspired!")) {
            $(nextBtnGetInspired).shouldBe(visible).click();
        }
    }

    public void iSeeLastCard(String card) {
        if (card.equals("Order together")) {
            $(orderTogetherCard).shouldBe(visible);
        }
        if (card.equals("We want you!")) {
            $(weWantYouCard).shouldBe(visible);
        }
        if (card.equals("Facebook")) {
            $(facebookCard).shouldBe(visible);
        }
    }

    public void clickOnGiftCardShop() {
        $(sendAGiftBtn).click();
    }

    public void discoveryPageLayoutPresent() {
        $(discoveryPageLayout).should(exist);
    }
}
