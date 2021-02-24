package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.Dashboard;
import pages.Privathaftpflicht;
import utilities.BrowserUtils;

public class US003_US004 {

    Dashboard dashboard = new Dashboard();
    Privathaftpflicht privathaftpflicht = new Privathaftpflicht();


    @Then("the user press {string}")
    public void the_user_press(String Angeboteanfordern) {
        privathaftpflicht.Angebote_anfordern.click();
        BrowserUtils.waitFor(2);
    }

    @Then("verify that user should see {string}")
    public void verify_that_user_should_see(String expectedMessage) {
        System.out.println("expectedMessage= " + expectedMessage);
        Assert.assertEquals(expectedMessage, expectedMessage);
        BrowserUtils.waitFor(3);

    }

    @When("click on {string}")
    public void click_on(String string) {
        privathaftpflicht.zumAngebote.click();
        BrowserUtils.waitFor(2);

    }

    @Then("the user see {string}  page for recommended insurances")
    public void the_user_see_page_for_recommended_insurances(String Recommended) {
        System.out.println("DeineAngeboteMessage= " + Recommended);
        Assert.assertEquals(Recommended, Recommended);
        BrowserUtils.waitFor(2);

    }

    @When("the user press on recommended insurance {string} button")
    public void the_user_press_on_recommended_insurance_button(String string) {
        privathaftpflicht.recommendedinsurancebutton.click();
        BrowserUtils.waitFor(2);
    }

    @When("the user enters email")
    public void the_user_enters_email() {


    }

    @When("the user enter password")
    public void the_user_enter_password() {


    }

    @Then("the user press {string} button")
    public void the_user_press_button(String string) {

    }
}