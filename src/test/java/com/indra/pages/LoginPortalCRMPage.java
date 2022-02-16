package com.indra.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;

@DefaultUrl("http://10.69.60.85:8280/portal/login?initialURI=%2Fportal%")
public class LoginPortalCRMPage extends PageObject {
    public LoginPortalCRMPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "username")
    WebElementFacade user;
    @FindBy(id = "password")
    WebElementFacade password;
    @FindBy(xpath = "/html/body/div[1]/div[2]/form/div[3]/input[2]")
    WebElementFacade btnLogin;

    public WebElementFacade getUser() {
        return user;
    }

    public WebElementFacade getPassword() {
        return password;
    }

    public WebElementFacade getBtnLogin() {
        return btnLogin;
    }
}
