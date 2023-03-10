package com.pe.prueba.cucumber.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderPageLocators {

    @FindBy(xpath = "//a[(@class='hrefch') and (text()='Samsung galaxy s6')]")
    public WebElement product;

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
