package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Angebote extends BasePage {

    public Angebote() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath ="//*[@id=\"ember4\"]/div/div/div/header/nav/ul[1]/li[4]/a")
    public WebElement Angebote;





}

