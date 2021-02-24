package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Privathaftpflicht extends BasePage {

    @FindBy(xpath = "//*[@id=\"ember4\"]/div/div/div/main/div[2]/div[3]/div/div[2]/div/span[1]")
    public WebElement privat;

    @FindBy(css = "[id^='ember19']")
    public WebElement weiter;

    //@FindBy(id ="Single")
    //public WebElement Single;

    @FindBy(xpath = "//*[@id=\"radioButtonsSingleSelect\"]/li[1]/div")
    public WebElement Single;

    // @FindBy (className="radioButtonsSingleSelect")
    //public List<WebElement> radiobuttons;

    @FindBy(xpath = "//*[@id=\"radioButtonsSingleSelect\"]/li[2]")
    public WebElement Paar;

    @FindBy(xpath = "//*[@id=\"radioButtonsSingleSelect\"]/li[1]/div")
    public WebElement ja;

    @FindBy(xpath = "//*[@id=\"radioButtonsSingleSelect\"]/li[2]/div")
    public WebElement Nein;

    @FindBy(xpath = "//*[@id=\"radioButtonsSingleSelect\"]/li[1]/div")
    public WebElement Lebensjahr;

    @FindBy(xpath = "//*[@id=\"ember4\"]/div/div/div/main/div[3]/div/div/button[2]")
    public WebElement Angebote_anfordern;


    @FindBy(css = "span._block_dsfphm")
    public WebElement zumAngebote;


}
    /*

    public void getAvailableProducts() throws InterruptedException {
        for (int i = 0; i < radiobuttons.size(); i++) {
            radiobuttons.get(i).click();
            Thread.sleep(1000);

        }

    }
     */
