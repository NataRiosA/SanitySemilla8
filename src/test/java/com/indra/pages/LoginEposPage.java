package com.indra.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;

@DefaultUrl("http://10.69.60.77:8180/tigo-pos-web/index.jsp")
public class LoginEposPage extends PageObject {
    public LoginEposPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "filtro1")
    WebElementFacade user;

    @FindBy(id = "filtro2")
    WebElementFacade password;

    @FindBy(className = "boton1")
    WebElementFacade btnLogin;

    @FindBy(xpath = "//span[contains(@id,'formMenu:j_id11_span')]")
    WebElementFacade clickLeave;

    @FindBy(xpath = "//span[contains(@id,'formMenu:j_id12:anchor')]")
    WebElementFacade btnLeave;

    public WebElementFacade getUser() {
        return user;
    }

    public WebElementFacade getPassword() {
        return password;
    }

    public WebElementFacade getBtnLogin() {
        return btnLogin;
    }

    public WebElementFacade getClickLeave() {
        return clickLeave;
    }

    public WebElementFacade getBtnLeave() {
        return btnLeave;
    }
}
