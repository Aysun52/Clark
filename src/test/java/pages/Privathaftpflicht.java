package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Privathaftpflicht extends BasePage {

    @FindBy(xpath = "//*[@id=\"ember4\"]/div/div/div/main/div[2]/div[3]/div/div[2]/div/span[1]")
    public WebElement privat;

    @FindBy(css = "[id^='ember19']")
    public WebElement weiter;

    @FindBy(xpath ="//*[@id=\"radioButtonsSingleSelect\"]/li[1]/h2")
    public WebElement Single;

    @FindBy(xpath ="//body/div[@id='ember4']/div[1]/div[1]/div[1]/main[1]/div[3]/section[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/h2[1]")
    public WebElement FamilieMitKinder;

    @FindBy(xpath ="//*[@id=\"radioButtonsSingleSelect\"]/li[3]/h2")
    public WebElement Paar_ohne_Kind;

    @FindBy(xpath ="//*[@id=\"radioButtonsSingleSelect\"]/li[4]/h2")
    public WebElement Single_mit_Kind;

    @FindBy(css = "h2.questionnaire__answers__answer__title")
    public WebElement questinnaire;

    @FindBy(xpath = "//*[@id=\"radioButtonsSingleSelect\"]/li[1]/h2")
    public WebElement ja;
}
