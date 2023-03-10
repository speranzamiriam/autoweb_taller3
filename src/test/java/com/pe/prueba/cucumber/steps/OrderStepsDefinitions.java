package com.pe.prueba.cucumber.steps;

import com.pe.prueba.cucumber.pages.OrderActions;
import com.pe.prueba.cucumber.utils.HelperClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderStepsDefinitions {

    OrderActions order = new OrderActions();

    @Given("^que ingreso a la aplicacion demoblaze$")
    public void queIngresoALaAplicacionDemoBlaze() {
        HelperClass.openPage();
    }

    @And("^seleccionamos el primer producto$")
    public void seleccionamosElPrimerProducto() {
        order.selectProduct();
    }

    @When("^yo agrego el producto al carrito de compras$")
    public void yoAgregoElProductoAlCarritoDeCompras() {
        order.addToCart();
    }

    @And("^yo ingreso mis datos mi nombre (.*) y mi tarjeta (.*)$")
    public void yoIngresoMisDatosMiNombreNombreYMiTarjetaCards(String name, String cards) {
        order.placeOrder(name, cards);
    }

    @Then("^yo valido que se genera la orden correctamente con mis datos (.*) y (.*)$")
    public void yoValidoQueSeGeneraLaOrdenCorrectamenteConMisDatosNombreYCards(String name, String cards) {
        order.validateName(name);
        order.validateCards(cards);
    }
}
