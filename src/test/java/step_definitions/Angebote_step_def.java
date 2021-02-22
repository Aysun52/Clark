package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import pages.Angebote;
import pages.BasePage;
import pages.Dashboard;
import pages.Privathaftpflicht;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.util.Set;

public class Angebote_step_def  {
    private WebDriver driver;

    @Given("the user is on dashboard")
    public void the_user_is_on_dashboard() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
        Driver.get().manage().window().maximize();

       // String actualWindow =Driver.get().getWindowHandle();
        //System.out.println(actualWindow);


        //Set<String> windowHandles = Driver.get().getWindowHandles();
      //  System.out.println(windowHandles);
    //loop through each window
        //for (String handle : windowHandles) {
            //one by one change it
            //Driver.get().switchTo().window(handle);
            //whenever your title equals to your expected window title
            //if(Driver.get().getTitle().equals("New Window")){
                //stop on that window
               // break;
          // }
       // }
        BrowserUtils.waitFor(5);
        Dashboard dashboard = new Dashboard();
        BrowserUtils.waitFor((3));
        dashboard.angebot.click();
        System.out.println(dashboard.angebot);

        }








    @When("the user navigates to {string}")
    public void the_user_navigates_to(String expectedtab) {
        System.out.println("expectedtab = " + expectedtab);
        BrowserUtils.waitForClickablility("Privathaftpflicht");




    }


    @Then("the user insurance category displays")
    public void the_user_insurance_category_displays() {




    }
}