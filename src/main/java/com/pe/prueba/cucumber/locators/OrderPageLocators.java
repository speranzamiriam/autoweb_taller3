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

    public void cargarExpertice(WebDriver driver, String textForExpertice){
        expertice =driver.findElement(By.xpath("//input[@value='"+textForExpertice+"']"));
    }
    public void cargarEducation(WebDriver driver, String textForEducation){
        education =driver.findElement(By.xpath("//input[@value='"+textForEducation+"']"));
    }

}
