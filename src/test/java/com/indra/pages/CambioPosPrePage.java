package com.indra.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;

public class CambioPosPrePage extends PageObject {
    public CambioPosPrePage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//a[@class='TabIcon DefaultPageIcon'][contains(.,'Postventa')]")
    WebElementFacade postSale;

    @FindBy(xpath = "//img[@id='pbGf5a1f4f3_2d5ecc_2d4e4a_2d8654_2d6459a01c3953:_viewRoot:j_id4:j_id10:j_id11:0::j_id12:handle:img:collapsed']" )
    WebElementFacade transaction;

    @FindBy(xpath = "//img[@id='pbGf5a1f4f3_2d5ecc_2d4e4a_2d8654_2d6459a01c3953:_viewRoot:j_id4:j_id10:j_id11:0:1::j_id14:handle:img:collapsed']" )
    WebElementFacade lineModification;

    @FindBy(id="pbGf5a1f4f3_2d5ecc_2d4e4a_2d8654_2d6459a01c3953:_viewRoot:j_id4:j_id10:j_id11:0:1:18::j_id17")
    WebElementFacade contractAssignment;

    //----------------------------
    @FindBy(id ="PlansChangePreForm:msisdnField:msisdn" )
    WebElementFacade phoneNumber;

    @FindBy(id ="PlansChangePreForm:reasonField:reason" )
    WebElementFacade reasonChange ;

    @FindBy(id ="PlansChangePreForm:userField:user" )
    WebElementFacade vendedor ;

    @FindBy(id ="PlansChangePreForm:combo1:selectOneListbox01" )
    WebElementFacade motivo;

    @FindBy(xpath ="/html/body/form/table/tbody/tr/td[2]/div[1]/div[2]/div[4]/div/span[1]/select/option[7]" )
    WebElementFacade motivo1;

    @FindBy(id ="PlansChangePreForm:combo2:selectOneListbox02" )
    WebElementFacade reasonCause ;

    @FindBy(xpath ="/html/body/form/table/tbody/tr/td[2]/div[1]/div[2]/div[5]/div/span[1]/select/option[2]" )
    WebElementFacade reasonCause1;

    @FindBy(id ="PlansChangePreForm:combo3:selectOneListbox03" )
    WebElementFacade detail;

    @FindBy(xpath ="/html/body/form/table/tbody/tr/td[2]/div[1]/div[2]/span[1]/div/div/span[1]/select/option[3]" )
    WebElementFacade detail1;

    @FindBy(id ="PlansChangePreForm:panelPrincipal_body" )
    WebElementFacade preForm;

    @FindBy(id="PlansChangePreForm:planField:planField")
    WebElementFacade plan;

    @FindBy(xpath ="/html/body/form/table/tbody/tr/td[1]/div[1]/div[2]/div[1]/div/span[1]/select/option[2]" )
    WebElementFacade planPre;

    @FindBy (id ="PlansChangePreForm:bntPlanChange")
    WebElementFacade btnChangePlan;


    @FindBy(xpath = "/html/body/form/table/tbody/tr/td[1]/span[1]/ul")
    WebElementFacade mensajes;

    public WebElementFacade getMensajes() {
        return mensajes;
    }


    public WebElementFacade getPostSale() {
        return postSale;
    }

    public WebElementFacade getTransaction() {
        return transaction;
    }

    public WebElementFacade getLineModification() {
        return lineModification;
    }

    public WebElementFacade getContractAssignment() {
        return contractAssignment;
    }

    public WebElementFacade getPhoneNumber() {
        return phoneNumber;
    }

    public WebElementFacade getReasonChange() {
        return reasonChange;
    }

    public WebElementFacade getVendedor() {
        return vendedor;
    }

    public WebElementFacade getMotivo() {
        return motivo;
    }

    public WebElementFacade getMotivo1() {
        return motivo1;
    }

    public WebElementFacade getReasonCause() {
        return reasonCause;
    }

    public WebElementFacade getReasonCause1() {
        return reasonCause1;
    }

    public WebElementFacade getDetail() {
        return detail;
    }

    public WebElementFacade getDetail1() {
        return detail1;
    }

    public WebElementFacade getPreForm() {
        return preForm;
    }

    public WebElementFacade getPlan() {
        return plan;
    }

    public WebElementFacade getPlanPre() {
        return planPre;
    }

    public WebElementFacade getBtnChangePlan() {
        return btnChangePlan;
    }
}


