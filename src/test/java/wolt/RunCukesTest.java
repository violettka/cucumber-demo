package wolt;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.cucumber.java.BeforeStep;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.jetbrains.annotations.NotNull;
import org.junit.runner.RunWith;
import org.testng.annotations.*;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber-report.json", "pretty"},
        glue = "wolt.steps",
        tags = "@DataTableTest"
)

public class RunCukesTest extends AbstractTestNGCucumberTests {
    @Parameters("browser")
    @BeforeMethod(alwaysRun = true)
    public void setupBrowser(@NotNull String browser){
        if (browser.equals("Firefox")) {
            Configuration.browser = "firefox";
        }
        if (browser.equals("Chrome")){
            Configuration.browser = "chrome";
        }
    }

    @AfterMethod(alwaysRun = true)
    public void cleanBrowser(){
        Selenide.closeWebDriver();
    }

}