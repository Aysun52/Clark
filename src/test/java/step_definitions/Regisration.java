package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.Dashboard;
import pages.Privathaftpflicht;
import pages.Registration;
import utilities.BrowserUtils;

public class Regisration {
    private WebDriver driver;
    Dashboard dashboard = new Dashboard();
    Privathaftpflicht privathaftpflicht = new Privathaftpflicht();
    Registration registration=new Registration();

    @And("the user input {string} {string} {string} {string} {string} {string} {string} {string}")
    public void the_user_input(String firstname, String lastName, String street, String  houseNumber, String zipCode, String city,String birthDate,String telephoneNumber) {
        registration.firstName.sendKeys(firstname);
        registration.lastName.sendKeys(lastName);
        registration.street.sendKeys(street);
        registration.houseNummber.sendKeys(houseNumber);
        registration.zipCode.sendKeys(zipCode);
        registration.city.sendKeys(city);
        registration.birthDate.sendKeys(birthDate);
        registration.telephoneNumber.sendKeys(telephoneNumber);
        BrowserUtils.waitFor(2);

    }




    @Then("the user click on {string} button")
    public void the_user_click_on_button(String Continue) {
        registration.weiterButton.click();
        BrowserUtils.waitFor(2);

    }


}