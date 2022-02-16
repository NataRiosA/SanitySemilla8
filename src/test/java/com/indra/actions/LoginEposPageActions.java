package com.indra.actions;

import com.indra.models.DataExcelModels;
import com.indra.models.LoginEposModels;
import com.indra.pages.LoginEposPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LoginEposPageActions extends LoginEposPage {

    //public String contraseniaInicial;

    public LoginEposPageActions(WebDriver driver) {
        super(driver);
    }

    public void fillLogin(DataExcelModels dataExcelModels)  {
        enter(dataExcelModels.getUser()).into(getUser());
        enter(dataExcelModels.getPassword()).into(getPassword());
    }

    public void clickOnLogin(DataExcelModels dataExcelModels){
        fillLogin(dataExcelModels);
        login();
    }

    public void login(){
        getBtnLogin().click();
    }

    public void leave(){
        Actions actions = new Actions(getDriver());
        WebElement leave = getDriver().findElement(By.id("formMenu:j_id11_span"));
        actions.moveToElement(leave).build().perform();
        getBtnLeave().click();
    }
}
