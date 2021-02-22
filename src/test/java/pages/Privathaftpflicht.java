package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Privathaftpflicht extends BasePage {
    @FindBy(css= "span._title_ojnkb3._override_ojnkb3")
    public WebElement privat;

    @FindBy(css = "[id^='ember19']")
    public WebElement weiter;

    @FindBy(css = "h2.questionnaire__answers__answer__title")
    public WebElement questinnaire;

    @FindBy(xpath = "((//div[@id='ember4'][1]")
    public WebElement questinnaire1;
}
