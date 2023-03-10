package com.pe.prueba.cucumber.pages;

import com.pe.prueba.cucumber.locators.OrderPageLocators;
import com.pe.prueba.cucumber.utils.HelperClass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OrderActions {
    static OrderPageLocators order = null;

    public OrderActions() {
        this.order = new OrderPageLocators();
        PageFactory.initElements(HelperClass.getDriver(), order);
    }

    public void selectProduct() {
        waitForElement(order.product);
        JavascriptExecutor js = (JavascriptExecutor) HelperClass.getDriver();
        js.executeScript("arguments[0].click();", order.product);
    }

    public void addToCart() {
        waitForElement(order.buttonAddCart);
        order.buttonAddCart.click();
        WebDriverWait wait = new WebDriverWait(HelperClass.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = HelperClass.getDriver().switchTo().alert();
        alert.accept();
        order.linkCart.click();
        waitForElement(order.containerProduct);
        order.buttonPlaceOrder.click();
    }

    public void placeOrder(String name, String cards) {
        waitForElement(order.nameTxt);
        order.nameTxt.sendKeys(name);
        order.countryTxt.sendKeys("Peru");
        order.cityTxt.sendKeys("Surquillo");
        order.cardTxt.sendKeys(cards);
        order.monthTxt.sendKeys("12");
        order.yeartxt.sendKeys("2024");
        order.buttonPurchase.click();
    }

    public boolean validateName(String name) {
        return order.valueOrder.getText().contains(name);
    }

    public boolean validateCards(String card) {
        return order.valueOrder.getText().contains(card);
    }

    public void waitForElement(WebElement element) {
        WebDriverWait wait = new WebDriverWait(HelperClass.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
