package com.nttdata.steps;

import com.nttdata.screens.LoginScreen;
import net.thucydides.core.annotations.Step;

public class LoginSteps {

    LoginScreen loginScreen;

    @Step("Loguearse")
    public void Loguearse(String usu, String pass){
        loginScreen.IngresarUsuario(usu);
        loginScreen.IngresoPassword(pass);
        loginScreen.clickIngresar();
    }


}
