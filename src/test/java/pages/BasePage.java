package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

public abstract class BasePage {



    @FindBy(xpath ="//button[@class='btn btn-primary cucumber-cookie-banner-accept-btn _cookie-banner-opt-in_1hvnco']")
    public WebElement akzeptieren;

    @FindBy(xpath ="//*[@id=\"ember4\"]/div/div/div/header/nav/ul[1]/li[4]/a")
    public WebElement Angebote;

    @FindBy(xpath = "//*[@id=\"ember4\"]/div/div/div/main/div[2]/div[3]/div/div[2]/div/span[1]")
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
        return akzeptieren.getText();
    }
    public void waitUntilLoaderScreenDisappear() {
        try {
            WebDriverWait wait = new WebDriverWait(Driver.get(), 5);
            wait.until(ExpectedConditions.invisibilityOf(akzeptieren));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}