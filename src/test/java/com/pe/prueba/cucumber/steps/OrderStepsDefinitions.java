package com.pe.prueba.cucumber.steps;

import com.pe.prueba.cucumber.pages.OrderActions;
import com.pe.prueba.cucumber.utils.HelperClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class OrderStepsDefinitions {

    OrderActions order = new OrderActions();

    @Given("^que ingreso a la aplicacion globalsqa$")
    public void queIngresoALaAplicacionGloblaSqa() {
        HelperClass.openPage();
    }

    @And("^seleccionamos en el menu samplepage$")
    public void seleccionamosElMenuSamplePage() {
        order.selectMenuSamplePage();
    }

    @When("^yo ingreso mis datos mi name (.*)  mi email (.*)  mi web site (.*) , mi experiencia (.*), expertice (.*) , mi comentario (.*) y mi educacion (.*)$")
    public void yoAgregoElProductoAlCarritoDeCompras(String name,String email,String webSite,String experience,String expertice ,String comment,String education) {
        order.llenarFormSimpleTest(name,email,webSite,experience,expertice,comment,education);

    }

    @Then("^yo valido que se genera una visualizacion de mis datos (.*) , (.*) , (.*) , (.*) , (.*) , (.*) , (.*)$")
    public void yoValidoQueSeGeneraLaOrdenCorrectamenteConMisDatosNombreYCards(String name,String email,String webSite,String experience,String expertice ,String comment,String education) {
        Assert.assertTrue(order.validarName(name));
        Assert.assertTrue(order.validarEmail(email));
        Assert.assertTrue(order.validarWebSite(webSite));
        Assert.assertTrue(order.validarExperience(experience));
        Assert.assertTrue(order.validarCommen(comment));
        Assert.assertTrue(order.validarExpertice(expertice));
        Assert.assertTrue(order.validarEducation(education));

    }
}
