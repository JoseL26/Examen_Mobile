package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class LoginScreen extends PageObject {

    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Username\"]")
    private WebElement inUser;

    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Password\"]")
    private WebElement inPass;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-LOGIN\"]")
    private WebElement btnLogin;

    public void IngresarUsuario(String usuario){
        inUser.click();
        inUser.sendKeys(usuario);
    }

    public void IngresoPassword(String password){
        inPass.click();
        inPass.sendKeys(password);
    }

    public void clickIngresar(){
        getDriver().manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        btnLogin.click();
    }

}
