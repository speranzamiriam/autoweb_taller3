package com.pe.prueba.cucumber.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderPageLocators {


    @FindBy(xpath = "//li[@id='menu-item-2822']/a")
    public WebElement linkMenuTester;
    @FindBy(xpath = "//li[@id='menu-item-2846']/a")
    public WebElement opcionMenuSamplePageTest;
    @FindBy(xpath = "//div[@id='wrapper']/div/div/div/div/div/div[2]/h1")
    public WebElement tituloFormularioSamplePageTest;

    @FindBy(id = "g2599-name")
    public WebElement nameTx;
    @FindBy(id = "g2599-email")
    public WebElement emailTx;
    @FindBy(id = "g2599-website")
    public WebElement webSiteTx;

    //@FindBy(xpath = "//input[@value='"+textForFunctionalTesting+"']")
    public WebElement expertice;
    public WebElement education;
    @FindBy(id = "g2599-experienceinyears")
    public WebElement experienceYear;

    @FindBy(id = "contact-form-comment-g2599-comment")
    public WebElement commenTx;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement botonSubmit;

    @FindBy(xpath = "//div[@id='contact-form-2599']/blockquote/p")
    public WebElement nameLbl;
    @FindBy(xpath = "//div[@id='contact-form-2599']/blockquote/p[2]")
    public WebElement emailLbl;
    @FindBy(xpath = "//div[@id='contact-form-2599']/blockquote/p[3]")
    public WebElement webSiteLbl;
    @FindBy(xpath = "//div[@id='contact-form-2599']/blockquote/p[4]")
    public WebElement experienceLbl;
    @FindBy(xpath = "//div[@id='contact-form-2599']/blockquote/p[5]")
    public WebElement experticeLbl;
    @FindBy(xpath = "//div[@id='contact-form-2599']/blockquote/p[6]")
    public WebElement educationLbl;
    @FindBy(xpath = "//div[@id='contact-form-2599']/blockquote/p[7]")
    public WebElement commentLbl;

    public void cargarExpertice(WebDriver driver, String textForFunctionalTesting){
        expertice =driver.findElement(By.xpath("//input[@value='"+textForFunctionalTesting+"']"));
    }
    public void cargarEducation(WebDriver driver, String textForEducationText){
        education =driver.findElement(By.xpath("//input[@value='"+textForEducationText+"']"));
    }

//

/*
*     driver.findElement(By.xpath("//div[@id='contact-form-2599']/h3")).click();
    driver.findElement(By.xpath("//div[@id='contact-form-2599']/blockquote/p")).click();
    driver.findElement(By.xpath("//div[@id='contact-form-2599']/blockquote/p[2]")).click();
    driver.findElement(By.xpath("//div[@id='contact-form-2599']/blockquote/p[3]")).click();
    driver.findElement(By.xpath("//div[@id='contact-form-2599']/blockquote/p[4]")).click();
    driver.findElement(By.xpath("//div[@id='contact-form-2599']/blockquote/p[5]")).click();
    driver.findElement(By.xpath("//div[@id='contact-form-2599']/blockquote/p[6]")).click();
    driver.findElement(By.xpath("//div[@id='contact-form-2599']/blockquote/p[7]")).click();
* */
    //------------------------


    @FindBy(xpath = "//a[text()='Add to cart']")
    public WebElement buttonAddCart;

    @FindBy(id = "cartur")
    public WebElement linkCart;

    @FindBy(id = "tbodyid")
    public WebElement containerProduct;
    @FindBy(xpath = "//button[text()='Place Order']")
    public WebElement buttonPlaceOrder;
    @FindBy(id = "name")
    public WebElement nameTxt;
    @FindBy(id="country")
    public WebElement countryTxt;
    @FindBy(id = "city")
    public WebElement cityTxt;
    @FindBy(id = "card")
    public WebElement cardTxt;
    @FindBy(id="month")
    public WebElement monthTxt;
    @FindBy(id = "year")
    public WebElement yeartxt;
    @FindBy(xpath = "//button[text()='Purchase']")
    public WebElement buttonPurchase;
    @FindBy(xpath = "//p[@class='lead text-muted ']")
    public WebElement valueOrder;

}
