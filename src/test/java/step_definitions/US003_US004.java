package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;
import pages.Dashboard;
import pages.Privathaftpflicht;
import pages.Registration;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.util.Map;

public class US003_US004 {
    private WebDriver driver;
    Dashboard dashboard = new Dashboard();
    Privathaftpflicht privathaftpflicht = new Privathaftpflicht();
    Registration registration=new Registration();


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
    public void the_user_press_on_recommended_insurance_button(String Abschlissen) {
       // System.out.println("Abschlissen ="+Abschlissen);
        privathaftpflicht.recommendedinsurancebutton.click();
        Assert.assertEquals(Abschlissen,Abschlissen);
        BrowserUtils.waitFor(3);
    }

    @When("the user enters {string} and {string} follow by registration")
    public void the_user_enters_and_follow_by_registration(String user_email, String password) {
        //Driver.get().findElement(By.xpath("//input[@type='email']")).sendKeys(useremail);
       registration.email.sendKeys(user_email);
        registration.password.sendKeys(password);
        registration.registerButton.click();
       BrowserUtils.waitFor(2);

    }

    @When("the user select gender on registration info page")
    public void the_user_select_gender_on_registration_info_page() {
    registration.Gender.click();
    BrowserUtils.waitFor(2);

    }

}

