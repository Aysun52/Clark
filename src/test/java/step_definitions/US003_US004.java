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



    @When("click on {string}")
    public void click_on(String string) {
        privathaftpflicht.zumAngebote.click();
        BrowserUtils.waitFor(2);

    }

    @Then("the user see {string}  page for recommended insurances")
    public void the_user_see_page_for_recommended_insurances(String expectedHeader) {
        System.out.println("expectedHeader="+expectedHeader);
        Assert.assertEquals(expectedHeader,expectedHeader);
        BrowserUtils.waitFor(2);



}}