package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Registration extends BasePage {
    public Registration() {
        PageFactory.initElements(Driver.get(), this);
    }


    @FindBy(xpath="//input[@type='email']")
    public WebElement email;

    @FindBy(xpath="//input[@type='password']")
    public WebElement password;

    @FindBy(xpath = "//span[@class='_block_dsfphm']")
    public WebElement registerButton;

    @FindBy(css = "span._radio-button_1xh103")
    public WebElement Gender;

    @FindBy(xpath = "//input[contains(@class,'ember-view _input_w51zx9 cucumber-profile-customer-first-name')]")
    public WebElement firstName;

    @FindBy(xpath = "//input[contains(@class,'ember-view _input_w51zx9 cucumber-profile-customer-street-name')]")
    public WebElement street;

    @FindBy(xpath = "//input[contains(@id,'ember87')]")
    public WebElement houseNummber;

    @FindBy(xpath = "//input[contains(@class,'ember-view _input_w51zx9 cucumber-profile-customer-last-name')]")
    public WebElement lastName;

    @FindBy(xpath = "//input[contains(@class,'ember-view _input_w51zx9 cucumber-profile-customer-post-code')]")
    public WebElement zipCode;

    @FindBy(xpath = "//input[contains(@id,'ember91')]")
    public WebElement city;

    @FindBy(xpath = "//input[contains(@id,'ember83')]")
    public  WebElement birthDate;

    @FindBy(xpath = "//input[contains(@id,'ember93')]")
    public WebElement telephoneNumber;

    @FindBy(xpath = "//button[@class='ember-view _button_dsfphm _appearance-primary_dsfphm _size-medium_dsfphm'][contains(.,'Weiter')]")
    public  WebElement weiterButton;


    public void register(String userEmail, String userPassword) {
        email.sendKeys(userEmail);
        password.sendKeys(userPassword);
        registerButton.click();
    }
}
