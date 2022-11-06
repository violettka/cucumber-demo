package wolt.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.$;

public class JobsPage extends Page {
    public static By joinUs = By.xpath("//main[@id='mainContent']/div/div/div[2]/div/div/h2/span");

    public void iSeeJoinUs() {
        $(joinUs).should(exist);
    }
}