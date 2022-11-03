package wolt.pages;


import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class RestaurantPage extends Page {


    public void clickOnMenuCategory(String category) {
        $(By.xpath("//span[text()[contains(.,'" + category + "')]]")).click();

    }

    public void checkMenuTitle(String title) {
        $(By.xpath("//h2[text()[contains(.,'" + title + "')]]")).exists();

    }

}
