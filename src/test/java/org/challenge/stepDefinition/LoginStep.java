package org.challenge.stepDefinition;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class LoginStep {
    @Before
    public void setTheStage(){

        OnStage.setTheStage(new OnlineCast());
    }
    @Given("que soy usuario {string} abre el sitio web")
    public void que_soy_usuario_cliente_abre_el_sitio_web(String actor) {

    }
    @When("cuando ingreso al navegador")
    public void cuando_ingreso_al_navegador() {

    }
    @Then("debe visualizar el {string}")
    public void debe_visualizar_el(String string) {

    }
    @Given("que el usuario abre la página de inicio de sesión")
    public void que_el_usuario_abre_la_página_de_inicio_de_sesión() {

    }
    @When("ingresa el usuario {string}")
    public void ingresa_el_usuario(String string) {

    }
    @When("ingresa la contraseña {string}")
    public void ingresa_la_contraseña(String string) {

    }
    @When("hace clic en el botón de inicio de sesión")
    public void hace_clic_en_el_botón_de_inicio_de_sesión() {

    }
    @Then("el usuario debería ver la página de productos")
    public void el_usuario_debería_ver_la_página_de_productos() {

    }
    @Then("debería ver el título {string}")
    public void debería_ver_el_título(String string) {

    }
}
