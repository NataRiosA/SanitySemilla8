package com.indra.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;

public class CambioPrePosPage extends PageObject {
    public CambioPrePosPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//a[@class='TabIcon DefaultPageIcon'][contains(.,'Postventa')]")
    WebElementFacade postSale;

    @FindBy(xpath = "//img[@id='pbGf5a1f4f3_2d5ecc_2d4e4a_2d8654_2d6459a01c3953:_viewRoot:j_id4:j_id10:j_id11:0::j_id12:handle:img:collapsed']")
    WebElementFacade transaction;

    @FindBy(xpath = "//img[@id='pbGf5a1f4f3_2d5ecc_2d4e4a_2d8654_2d6459a01c3953:_viewRoot:j_id4:j_id10:j_id11:0:1::j_id14:handle:img:collapsed']")
    WebElementFacade lineModification;

    @FindBy(id = "pbGf5a1f4f3_2d5ecc_2d4e4a_2d8654_2d6459a01c3953:_viewRoot:j_id4:j_id10:j_id11:0:1:4::j_id17")
    WebElementFacade contractAssignment;

    //----------------------------
    @FindBy(xpath = "//*[@id='PlanschangeForm:msisdnField:msisdn']")
    WebElementFacade phoneNumber;

    @FindBy(xpath = "//*[@id='PlanschangeForm:reasonField:reason']")
    WebElementFacade reasonChange;

    @FindBy(xpath = "//*[@id='PlanschangeForm:userField:user']")
    WebElementFacade vendedor;

    @FindBy(xpath = "//*[@id='PlanschangeForm:InfoTelefono:clientInfoTelefono']")
    WebElementFacade msisdn;

    @FindBy(xpath = "//*[@id='PlanschangeForm:clientInfoMail:clientInfoMail']")
    WebElementFacade mail;

    @FindBy(xpath = "//*[@id='PlanschangeForm:InfoDireccion:clientInfoDireccion']")
    WebElementFacade direccion;

    @FindBy(xpath = "/html/body/div[1]/form/table/tbody/tr[1]/td[1]/div[1]/div[2]/table[5]/tbody/tr/td[1]/div/div/span[1]/select")
    WebElementFacade deparment;

    @FindBy(xpath = "/html/body/div[1]/form/table/tbody/tr[1]/td[1]/div[1]/div[2]/table[5]/tbody/tr/td[1]/div/div/span[1]/select/option[10]")
    WebElementFacade deparment1;

    @FindBy(xpath = "/html/body/div[1]/form/table/tbody/tr[1]/td[1]/div[1]/div[2]/table[5]/tbody/tr/td[2]/div/div/span[1]/select")
    WebElementFacade city;

    @FindBy(xpath = "/html/body/div[1]/form/table/tbody/tr[1]/td[1]/div[1]/div[2]/table[5]/tbody/tr/td[2]/div/div/span[1]/select/option[9]")
    WebElementFacade city1;

    @FindBy(xpath = "//*[@id='PlanschangeForm:InfoTipoFactura:billType:0']")
    WebElementFacade factura;

    @FindBy(xpath = "//*[@id='PlanschangeForm:InfoContenidoFactura:billContent:0']")
    WebElementFacade facturaReducida;


    @FindBy(xpath = "//*[@id='PlanschangeForm:bntPlanChange']")
    WebElementFacade btnChangePlan;

    @FindBy(xpath = "/html/body/div[1]/form/table/tbody/tr[2]/td/span[1]/ul")
    WebElementFacade mensajes;

    @FindBy(xpath = "//*[@id='PlanschangeForm:InfoAnnualRenewal:decisionField']")
    WebElementFacade renovar;

    @FindBy(xpath = "/html/body/div[1]/form/table/tbody/tr[2]/td/div[3]/div[2]/table/tbody/tr/td/div/div/span[1]/select/option[3]")
    WebElementFacade renovar1;

    @FindBy(xpath = "/html/body/div[1]/form/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td")
    WebElementFacade clic;



    @FindBy(xpath = "//a[@class='TabIcon DefaultPageIcon'][contains(.,'Consultas')]")
    WebElementFacade consultas;

    @FindBy(xpath = "//*[@id='pbGc323725e_2d6efe_2d4037_2d9f93_2d1bc06edfa941:_viewRoot:j_id4:j_id10:j_id11:50::j_id12:handle:img:expanded']")
    WebElementFacade consult;

    @FindBy(xpath = "//*[@id='pbGc323725e_2d6efe_2d4037_2d9f93_2d1bc06edfa941:_viewRoot:j_id4:j_id10:j_id11:50:51::j_id14:handle:img:expanded']")
    WebElementFacade caja;

    @FindBy(xpath = "//*[@id='pbGc323725e_2d6efe_2d4037_2d9f93_2d1bc06edfa941:_viewRoot:j_id4:j_id10:j_id11:50:51:55::j_id17']")
    WebElementFacade pago;

    @FindBy(xpath = "//*[@id='Order:identificacionField:idCliente']")
    WebElementFacade ccVendor;

    @FindBy(id = "//*[@id='Order:cmdConsultar']")
    WebElementFacade searchButton;

    public WebElementFacade getClic() {
        return clic;
    }

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

    public WebElementFacade getMsisdn() {
        return msisdn;
    }

    public WebElementFacade getMail() {
        return mail;
    }

    public WebElementFacade getDireccion() {
        return direccion;
    }

    public WebElementFacade getDeparment() {
        return deparment;
    }

    public WebElementFacade getDeparment1() {
        return deparment1;
    }

    public WebElementFacade getCity() {
        return city;
    }

    public WebElementFacade getCity1() {
        return city1;
    }

    public WebElementFacade getFactura() {
        return factura;
    }

    public WebElementFacade getFacturaReducida() {
        return facturaReducida;
    }

    public WebElementFacade getBtnChangePlan() {
        return btnChangePlan;
    }

    public WebElementFacade getRenovar() {
        return renovar;
    }

    public WebElementFacade getRenovar1() {
        return renovar1;
    }

    public WebElementFacade getConsult() {
        return consult;
    }

    public WebElementFacade getCaja() {
        return caja;
    }


    public WebElementFacade getPago() {
        return pago;
    }

    public WebElementFacade getCcVendor() {
        return ccVendor;
    }

    public WebElementFacade getSearchButton() {
        return searchButton;
    }

    public WebElementFacade getConsultas(){
        return consultas;
    }

}