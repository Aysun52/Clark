package step_definitions;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.junit.Assert;
import org.openqa.selenium.*;
import pages.Angebote;
import pages.BasePage;
import pages.Dashboard;
import pages.Privathaftpflicht;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;

public class US001_US002 {
    private WebDriver driver;
    Dashboard dashboard = new Dashboard();
    Privathaftpflicht privathaftpflicht = new Privathaftpflicht();

    @Given("the user is on dashboard")
    public void the_user_is_on_dashboard() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
        BrowserUtils.waitFor(2);
    }

    @When("the user press {string} in the iframe")
    public void the_user_press_in_the_iframe(String string) {
        dashboard.akzeptieren.click();
        BrowserUtils.waitFor(5);
    }

    @And("the user on the {string} main page")
    public void the_user_on_the_main_page(String expectedTitle) {
        System.out.println("expectedTitle= " + expectedTitle);
        BrowserUtils.waitFor(2);
        Assert.assertTrue(Driver.get().getTitle().contains(expectedTitle));
        dashboard.Angebote.click();
        BrowserUtils.waitFor(5);
    }

    @When("the user on the {string} page")
    public void the_user_on_the_page(String Privathaftplicht) {
        privathaftpflicht.privat.click();
        BrowserUtils.waitFor(5);

    }

    @When("the user  click on {string} button")
    public void the_user_click_on_button(String string) {
        privathaftpflicht.loslegen.click();
        BrowserUtils.waitFor(3);
    }

    @When("the user is on the 1st question")
    public void the_user_is_on_the_1st_question() {
        privathaftpflicht.ja.click();
        BrowserUtils.waitFor(3);
    }

    @When("the user is on the 2nd question")
    public void the_user_is_on_the_2nd_question() {
        privathaftpflicht.Nein.click();
        BrowserUtils.waitFor(3);

    }

    @When("the user is on the 3rd question")
    public void the_user_is_on_the_3rd_question() {
        privathaftpflicht.Lebensjahr.click();
        BrowserUtils.waitFor(2);
    }

    @When("the user is on the 4th question")
    public void the_user_is_on_the_4th_question() {
        privathaftpflicht.Selbstbeteiligung.click();
        BrowserUtils.waitFor(2);

    }


}
