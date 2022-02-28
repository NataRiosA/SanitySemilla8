package com.indra.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;

public class CesionPortalCRMPage extends PageObject {
    public CesionPortalCRMPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//a[@class='TabIcon DefaultPageIcon'][contains(.,'Postventa')]")
    WebElementFacade postSale;

    @FindBy(xpath = "//img[@id='pbGf5a1f4f3_2d5ecc_2d4e4a_2d8654_2d6459a01c3953:_viewRoot:j_id4:j_id10:j_id11:0::j_id12:handle:img:collapsed']" )
    WebElementFacade transaction;

    @FindBy(xpath = "//img[@id='pbGf5a1f4f3_2d5ecc_2d4e4a_2d8654_2d6459a01c3953:_viewRoot:j_id4:j_id10:j_id11:0:1::j_id14:handle:img:collapsed']" )
    WebElementFacade lineModification;

    @FindBy(xpath = "//a[@id='pbGf5a1f4f3_2d5ecc_2d4e4a_2d8654_2d6459a01c3953:_viewRoot:j_id4:j_id10:j_id11:0:1:14::j_id17']")
    WebElementFacade contractAssignment;


    @FindBy(id ="cesionContratoForm:msisdnField:msisdn" )
    WebElementFacade phoneNumber;

    @FindBy(id ="cesionContratoForm:newIdField:newSubId" )
    WebElementFacade newSudId ;

    @FindBy(id ="cesionContratoForm:newIdField:consultar" )
    WebElementFacade btnConsultar;

    @FindBy(id ="cesionContratoForm:vendedorField:vendedor" )
    WebElementFacade vendedor ;

    @FindBy(id ="cesionContratoForm:motivoField:motivo" )
    WebElementFacade motivo;

    @FindBy(id ="cesionContratoForm:observacionField:observacion" )
    WebElementFacade observation ;

    @FindBy(id ="cesionContratoForm:deptoField:j_id202" )
    WebElementFacade deptoFacturacion;

    @FindBy(className ="cesionContratoForm:ciudadField:j_id216" )
    WebElementFacade ciudadFacturacion;

    @FindBy(id ="cesionContratoForm:direccionField:direccion" )
    WebElementFacade direccionFacturacion;

    @FindBy(className ="way_address_ui_1643749653064" )
    WebElementFacade viaLista ;

    @FindBy(xpath="(//div[@class='tigo_address_block_locate']//input)[1]")
    WebElementFacade callenumero;

    @FindBy(xpath ="(//div[@class='tigo_address_block_locate']//input)[2]" )
    WebElementFacade callenumero2;

    @FindBy(xpath ="//div[@class='tigo_address_separator_with']/following-sibling::input[1]" )
    WebElementFacade withAddress;

    @FindBy(xpath ="/html/body/div[4]/div/div[3]/div[1]/div" )
    WebElementFacade btnAceptar;

    @FindBy(id ="cesionContratoForm:correoField:correo" )
    WebElementFacade email;

    @FindBy(xpath ="//select[@name='cesionContratoForm:j_id256']" )
    WebElementFacade planLista;

    @FindBy(xpath = "//*[@id='cesionContratoForm:bntPlanChange']")
    WebElementFacade btnCambiarContrato;

    @FindBy(xpath = "//form[@id='cesionContratoForm']//table/tbody[1]/tr[1]/td[1]/span[1]/ul[1]/li[6]")
    WebElementFacade mensajes;

    @FindBy(id = "cesionContratoForm:claveField:clave")
    WebElementFacade claveAsesor;

    @FindBy(id="cesionContratoForm:j_id97:aseToken")
    WebElementFacade cajonClaveAsesor;


    public WebElementFacade getClaveAsesor() {
        return claveAsesor;
    }

    public WebElementFacade getCajonClaveAsesor() {
        return cajonClaveAsesor;
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



    public WebElementFacade getNewSudId() {
        return newSudId;
    }

    public WebElementFacade getBtnConsultar() {
        return btnConsultar;
    }

    public WebElementFacade getVendedor() {
        return vendedor;
    }

    public WebElementFacade getMotivo() {
        return motivo;
    }

    public WebElementFacade getObservation() {
        return observation;
    }

    public WebElementFacade getDeptoFacturacion() {
        return deptoFacturacion;
    }

    public WebElementFacade getCiudadFacturacion() {
        return ciudadFacturacion;
    }

    public WebElementFacade getDireccionFacturacion() {
        return direccionFacturacion;
    }

    public WebElementFacade getViaLista() {
        return viaLista;
    }

    public WebElementFacade getCallenumero() {
        return callenumero;
    }

    public WebElementFacade getCallenumero2() {
        return callenumero2;
    }

    public WebElementFacade getWithAddress() {
        return withAddress;
    }

    public WebElementFacade getBtnAceptar() {
        return btnAceptar;
    }

    public WebElementFacade getEmail() {
        return email;
    }

    public WebElementFacade getPlanLista() {
        return planLista;
    }

    public WebElementFacade getBtnCambiarContrato() {
        return btnCambiarContrato;
    }
}