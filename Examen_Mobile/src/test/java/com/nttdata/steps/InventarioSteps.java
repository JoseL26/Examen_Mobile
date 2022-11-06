package com.nttdata.steps;

import com.nttdata.screens.LoginScreen;
import com.nttdata.screens.InventarioScreen;
import net.thucydides.core.annotations.Step;

public class InventarioSteps {

    LoginScreen loginScreen;
    InventarioScreen inventarioScreen;


    @Step("Obtiene el texto PRODUCTS")
    public String getResultText(){
        return inventarioScreen.getresultado();
    }

}
