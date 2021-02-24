package step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import pages.Angebote;
//import pages.BasePage;
import pages.BasePage;
import utilities.DBUtils;
import utilities.Driver;

public class Hooks {
    @Before
    public void setUp() {


    }


    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "screenshot");
        }

        //Driver.closeDriver();

    }

    @Before("@db")
    public void setUpdb() {
        System.out.println("\tconnecting to database...");
        DBUtils.createConnection();
    }

    @After("@db")
    public void closeDb() {
        System.out.println("\tdisconnecting to database...");
        DBUtils.destroy();
    }
}