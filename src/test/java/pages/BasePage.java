package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

public abstract class BasePage {



    @FindBy(xpath ="//button[@class='btn btn-primary cucumber-cookie-banner-accept-btn _cookie-banner-opt-in_1hvnco']")
    public WebElement cookieBanner;

    @FindBy(css= "span._title_ojnkb3._override_ojnkb3")
    public WebElement privat;

    @FindBy(css = "[id^='ember19']")
    public WebElement weiter;

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    public String angebot() {
        //ant time we are verifying page name, or page subtitle, loader mask appears
        waitUntilLoaderScreenDisappear();
//        BrowserUtils.waitForStaleElement(pageSubTitle);
        return cookieBanner.getText();
    }
    public void waitUntilLoaderScreenDisappear() {
        try {
            WebDriverWait wait = new WebDriverWait(Driver.get(), 5);
            wait.until(ExpectedConditions.invisibilityOf(cookieBanner));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}