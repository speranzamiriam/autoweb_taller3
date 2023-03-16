package com.pe.prueba.cucumber.pages;

import com.pe.prueba.cucumber.locators.OrderPageLocators;
import com.pe.prueba.cucumber.utils.HelperClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OrderActions {
    static OrderPageLocators order = null;

    public OrderActions() {
        this.order = new OrderPageLocators();
        PageFactory.initElements(HelperClass.getDriver(), order);
    }

    public void selectMenuSamplePage() {

        Actions actions = new Actions(HelperClass.getDriver());
        actions.moveToElement(order.linkMenuTester).perform();
        waitForElement(order.opcionMenuSamplePageTest);
        order.opcionMenuSamplePageTest.click();
    }

    public void llenarFormSimpleTest(String name, String email, String webSite, String experience,String expertice, String comment,String education) {
        order.cargarExpertice(HelperClass.getDriver(),expertice);
        order.cargarEducation(HelperClass.getDriver(),education);
        waitForElement(order.tituloFormularioSamplePageTest);
        order.nameTx.sendKeys(name);
        order.emailTx.sendKeys(email);
        order.webSiteTx.sendKeys(webSite);
        order.commenTx.sendKeys(comment);
        new Select(order.experienceYear).selectByVisibleText(experience);
        order.expertice.click();
        order.education.click();
        order.botonSubmit.click();

    }

    public boolean validarName(String name) {
        return order.nameLbl.getText().contains(name);
    }

    public boolean validarEmail(String email) {
        return order.emailLbl.getText().contains(email);
    }

    public boolean validarWebSite(String webSite) {
        return order.webSiteLbl.getText().contains(webSite);
    }

    public boolean validarExperience(String experienceYear) {
        return order.experienceLbl.getText().contains(experienceYear);
    }
    public boolean validarCommen(String comment) {
        return order.commentLbl.getText().contains(comment);
    }

    public boolean validarExpertice(String expertice) {
        return order.experticeLbl.getText().contains(expertice);
    }
    public boolean validarEducation(String education) {
        return order.educationLbl.getText().contains(education);
    }

    public void waitForElement(WebElement element) {
        WebDriverWait wait = new WebDriverWait(HelperClass.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
