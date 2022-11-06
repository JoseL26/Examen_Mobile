package com.nttdata.stepsdefinitions;

import com.nttdata.steps.InventarioSteps;
import com.nttdata.steps.LoginSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class LoginSD {

    @Steps
    InventarioSteps inventariosteps;

    @Given("que me enuentro en el login de SauceLab")
    public void que_me_enuentro_en_el_login_de_SauceLab() {


    }
    @When("inicio sesión con las credenciales usuario {string} y contraseña {string}")
    public void inicio_sesión_con_las_credenciales_usuario_y_contraseña(String user, String password) {
        LoginSteps login= new LoginSteps();
        login.Loguearse(user, password);
    }
    @Then("valido que se muestre el texto {string}")
    public void valido_que_se_muestre_el_texto(String text) {
        Assert.assertEquals(inventariosteps.getResultText(), text);
    }

    @And("valido que exista al menos un item")
    public void validoQueExistaAlMenosUnItem() {
    }
}
