package wolt.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

/**
 * Class contains all Discovery page locators and methods.
 */
public class DiscoveryPage extends Page {


    //locators
    protected static By nextBtn = By.xpath("//button[@type='button'])[8]");
    protected static By weWantYouCard = By.className("//*[@class='We want you!']");

    //methods
    public void clickOnNextBtn() {
        $(nextBtn).click();
        page(DiscoveryPage.class);

    }

    public JobsPage clickOnWeWantYouCard() {
        $(weWantYouCard).click();
        return page(JobsPage.class);
    }

}