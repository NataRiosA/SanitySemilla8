package com.indra.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;


@DefaultUrl("http://10.69.60.85:8280/portal/CRMPortal/Venta")
public class PortabilityPostActivationPage extends PageObject{

    public PortabilityPostActivationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@class='TabIcon DefaultPageIcon'][contains(.,'Consultas')]")
    WebElementFacade consult;

    @FindBy(xpath = "//img[contains(@id,'pbGc323725e_2d6efe_2d4037_2d9f93_2d1bc06edfa941:_viewRoot:j_id4:j_id10:j_id11:13::j_id12:handle:img:collapsed')]")
    WebElementFacade consultPos;

    @FindBy(xpath = "//img[contains(@id,'pbGc323725e_2d6efe_2d4037_2d9f93_2d1bc06edfa941:_viewRoot:j_id4:j_id10:j_id11:13:14::j_id14:handle:img:collapsed')]")
    WebElementFacade consultIntegral;

    @FindBy(xpath = "//a[@href='#'][contains(@id,'id17')][contains(.,'Nueva Pantalla Unica Clientes')]")
    WebElementFacade cosultaPantallaUnica;

    @FindBy(id = "j_id15:j_id26")
    WebElementFacade msisdn2;

    @FindBy(id = "j_id15:j_id27")
    WebElementFacade searchButton;

    @FindBy (id = "j_id15:j_id29")
    WebElementFacade generalCustomerInformation;

    @FindBy (id = "j_id373:menu:j_id374:j_id422:j_id425:out")
    WebElementFacade hlr;

    @FindBy (xpath = "/html/body/div/div/div[4]/div/form/div[2]/div[11]/a/span")
    WebElementFacade hlrImpre;

    //------------------solicitud nip-----------------

    @FindBy (xpath = "/html/body/div[2]/div[2]/div/div/div/div/div/div/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div/ul/li[1]/span/a")
    WebElementFacade preventa;

    @FindBy (xpath = "//*[@id='pbGac4fa497_2d8304_2d4e12_2d8e75_2d0ee02636d5e8:_viewRoot:j_id4:j_id10:j_id11:106::j_id12:handle:img:collapsed']")
    WebElementFacade portabilidadNumerica;

    @FindBy (xpath = "//*[@id='pbGac4fa497_2d8304_2d4e12_2d8e75_2d0ee02636d5e8:_viewRoot:j_id4:j_id10:j_id11:106:107::j_id14:handle:img:collapsed']")
    WebElementFacade solicitudes;

    @FindBy (id = "pbGac4fa497_2d8304_2d4e12_2d8e75_2d0ee02636d5e8:_viewRoot:j_id4:j_id10:j_id11:106:107:108::j_id17")
    WebElementFacade solicitudNip;

    @FindBy (id = "frmSlctdPin:j_id20:0:j_id26")
    WebElementFacade inputMsisdn;

    @FindBy (id = "frmSlctdPin:j_id20:j_id40")
    WebElementFacade btnSolicitar;

    @FindBy (id = "frmSlctdPin:j_id42")
    WebElementFacade message;

    //-----------------------------

    @FindBy(xpath = "//a[@class='TabIcon DefaultPageIcon'][contains(.,'Venta')]")
    WebElementFacade sale;

    @FindBy(xpath = "//img[contains(@id,'pbG1dfca009_2d52ed_2d45cd_2da543_2d6660573bef81:_viewRoot:j_id4:j_id10:j_id11:0::j_id12:handle:img:collapsed')]")
    WebElementFacade dropdownActivation;

    @FindBy(xpath = "//img[contains(@id,'pbG1dfca009_2d52ed_2d45cd_2da543_2d6660573bef81:_viewRoot:j_id4:j_id10:j_id11:0:29::j_id14:handle:img:collapsed')]")
    WebElementFacade dropdownPay;

    @FindBy(xpath = "//a[contains(@id,'pbG1dfca009_2d52ed_2d45cd_2da543_2d6660573bef81:_viewRoot:j_id4:j_id10:j_id11:0:29:31::j_id17')]")
    WebElementFacade activator;

    @FindBy(xpath = "/html/body/form/div/div[2]/table/tbody/tr/td[2]/div/div/div[1]/span/span/span")
    WebElementFacade dropdownActivator;

    @FindBy(xpath = "//div[@id='formIndex:j_idt13Item3']")
    WebElementFacade portabilityPospaid;

    @FindBy(id = "ActivacionesForm:idVendedor")
    WebElementFacade vendor;

    @FindBy(id = "ActivacionesForm:idTipoDocButton")
    WebElementFacade buttonId;

    @FindBy(xpath = "//div[contains(@id,'ActivacionesForm:idTipoDocItem0')]")
    WebElementFacade documentType;

    @FindBy(xpath = "//input[contains(@id,'ActivacionesForm:cedulaCliente')]")
    WebElementFacade documentCC;

    @FindBy(id = "ActivacionesForm:idExpedicion")
    WebElementFacade documentExpedicion;

    @FindBy(id = "ActivacionesForm:btnContinuar")
    WebElementFacade btnContinue;

    //-----------------------------------------

    @FindBy (xpath = "//*[@id='ActivacionesForm:portationTelTypeButton']")
    WebElementFacade typeTel;

    @FindBy (xpath = "//*[@id='ActivacionesForm:portationTelTypeItem0']")
    WebElementFacade pospago;

    @FindBy(id = "ActivacionesForm:portationPin")
    WebElementFacade nip;

    @FindBy(id = "ActivacionesForm:portationOwnerButton")
    WebElementFacade typeSol;

    @FindBy(id = "ActivacionesForm:portationOwnerItem0")
    WebElementFacade typeSol1;

    @FindBy(xpath = "//*[@id='ActivacionesForm:portationMsisdn']")
    WebElementFacade msisdnPort;

    @FindBy(xpath = "//input[@id='ActivacionesForm:idEsFechaCalendarizada']")
    WebElementFacade  checkFechaCalendarizada;

    @FindBy(xpath = "//img[@id='ActivacionesForm:fechaActivacionPortabilidadPopupButton']")
    WebElementFacade inputcalendario;

    @FindBy(id = "ActivacionesForm:idImsi")
    WebElementFacade msi;

    @FindBy(id = "ActivacionesForm:idMsisdn")
    WebElementFacade msisdn;

    @FindBy(id = "ActivacionesForm:tipoVentaButton")
    WebElementFacade simSola;

    @FindBy(id = "ActivacionesForm:tipoVentaItem0")
    WebElementFacade simSola1;

    @FindBy(id = "ActivacionesForm:tipoPlanButton")
    WebElementFacade plan;

    @FindBy(xpath = "//div[text()='740 - Pospago 5.2']")
    WebElementFacade planType;

    @FindBy(id = "ActivacionesForm:btnContinuarActivacionVenta")
    WebElementFacade btnContinuar;



    @FindBy(xpath = "//input[contains(@id,'ActivacionesForm:idBarrio')]")
    WebElementFacade district;

    @FindBy(id = "ActivacionesForm:idDepartamentoButton")
    WebElementFacade dropdownDeparment;

    @FindBy(xpath = "//div[contains(@id,'ActivacionesForm:idDepartamentoItem26')]")
    WebElementFacade deparment;

    @FindBy(id = "ActivacionesForm:idCiudadButton")
    WebElementFacade dropdownCity;

    @FindBy(xpath = "//div[contains(@id,'ActivacionesForm:idCiudadItem10')]")
    WebElementFacade city;

    @FindBy(xpath = "//input[@id='ActivacionesForm:idTelefono']")
    WebElementFacade phone;

    @FindBy(xpath = "//input[contains(@id,'ActivacionesForm:idTelefonoAlterno')]")
    WebElementFacade alternatePhone;

    @FindBy(xpath = "//input[contains(@id,'ActivacionesForm:idEmail')]")
    WebElementFacade mail;

    @FindBy(xpath = "//img[contains(@id,'ActivacionesForm:idFechaPopupButton')]")
    WebElementFacade date;

    @FindBy(xpath = "/html/body/form[1]/div/div/div[6]/div[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/td[5]/div/div/div/table[1]/tbody/tr[1]/td/table/tbody/tr/td[3]/div")
    WebElementFacade chooseDate;

    @FindBy(id = "ActivacionesForm:idFechaDateEditorLayoutM9")
    WebElementFacade month;

    @FindBy(xpath = "/html/body/form[1]/div/div/div[6]/div[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/td[5]/div/div/div/table[2]/tbody/tr/td/div/table/tbody/tr[1]/td[3]/div")
    WebElementFacade chooseYear;

    @FindBy(id = "ActivacionesForm:idFechaDateEditorLayoutY1")
    WebElementFacade year;

    @FindBy(id = "ActivacionesForm:idFechaDateEditorButtonOk")
    WebElementFacade dateOk;

    @FindBy(id = "ActivacionesForm:idFechaDayCell17")
    WebElementFacade day;

    @FindBy(xpath = "//input[contains(@id,'ActivacionesForm:idTipofactura:1')]")
    WebElementFacade electronicBill;

    @FindBy(xpath = "//input[contains(@id,'ActivacionesForm:btnContinuarActivacionDemografica')]")
    WebElementFacade continueDemo;

    @FindBy(xpath = "//input[contains(@id,'ActivacionesForm:btnContinuarActivacionClausulas')]")
    WebElementFacade continueSale;

    @FindBy(xpath = "//*[@id='popupConfirmacionDatos:confirmarDatos']")
    WebElementFacade confirm;

    @FindBy (className = "rf-cp-lbl-exp")
    WebElementFacade ActivationDetails;

    public WebElementFacade getContinueSale() {
        return continueSale;
    }

    public WebElementFacade getSimSola1() {
        return simSola1;
    }

    public WebElementFacade getConfirm() {
        return confirm;
    }

    public WebElementFacade getActivationDetails() {
        return ActivationDetails;
    }

    public WebElementFacade getConsult() {
        return consult;
    }

    public WebElementFacade getConsultPos() {
        return consultPos;
    }

    public WebElementFacade getConsultIntegral() {
        return consultIntegral;
    }

    public WebElementFacade getCosultaPantallaUnica() {
        return cosultaPantallaUnica;
    }

    public WebElementFacade getMsisdn2() {
        return msisdn2;
    }

    public WebElementFacade getSearchButton() {
        return searchButton;
    }

    public WebElementFacade getGeneralCustomerInformation() {
        return generalCustomerInformation;
    }

    public WebElementFacade getPreventa() {
        return preventa;
    }

    public WebElementFacade getPortabilidadNumerica() {
        return portabilidadNumerica;
    }

    public WebElementFacade getSolicitudes() {
        return solicitudes;
    }

    public WebElementFacade getSolicitudNip() {
        return solicitudNip;
    }

    public WebElementFacade getInputMsisdn() {
        return inputMsisdn;
    }

    public WebElementFacade getBtnSolicitar() {
        return btnSolicitar;
    }

    public WebElementFacade getSale() {
        return sale;
    }

    public WebElementFacade getDropdownActivation() {
        return dropdownActivation;
    }

    public WebElementFacade getDropdownPay() {
        return dropdownPay;
    }

    public WebElementFacade getActivator() {
        return activator;
    }

    public WebElementFacade getDropdownActivator() {
        return dropdownActivator;
    }

    public WebElementFacade getPortabilityPospaid() {
        return portabilityPospaid;
    }

    public WebElementFacade getVendor() {
        return vendor;
    }

    public WebElementFacade getButtonId() {
        return buttonId;
    }

    public WebElementFacade getDocumentType() {
        return documentType;
    }

    public WebElementFacade getDocumentCC() {
        return documentCC;
    }

    public WebElementFacade getDocumentExpedicion() {
        return documentExpedicion;
    }

    public WebElementFacade getBtnContinue() {
        return btnContinue;
    }

    public WebElementFacade getTypeTel() {
        return typeTel;
    }

    public WebElementFacade getPospago() {
        return pospago;
    }

    public WebElementFacade getNip() {
        return nip;
    }

    public WebElementFacade getTypeSol() {
        return typeSol;
    }

    public WebElementFacade getTypeSol1() {
        return typeSol1;
    }

    public WebElementFacade getMsisdnPort() {
        return msisdnPort;
    }

    public WebElementFacade getCheckFechaCalendarizada() {
        return checkFechaCalendarizada;
    }

    public WebElementFacade getInputcalendario() {
        return inputcalendario;
    }

    public WebElementFacade getMsi() {
        return msi;
    }

    public WebElementFacade getMsisdn() {
        return msisdn;
    }

    public WebElementFacade getSimSola() {
        return simSola;
    }

    public WebElementFacade getPlan() {
        return plan;
    }

    public WebElementFacade getPlanType() {
        return planType;
    }

    public WebElementFacade getBtnContinuar() {
        return btnContinuar;
    }

    public WebElementFacade getHlr() {
        return hlr;
    }

    public WebElementFacade getHlrImpre() {
        return hlrImpre;
    }

    public WebElementFacade getMessage() {
        return message;
    }

    public WebElementFacade getDistrict() {
        return district;
    }

    public WebElementFacade getDropdownDeparment() {
        return dropdownDeparment;
    }

    public WebElementFacade getDeparment() {
        return deparment;
    }

    public WebElementFacade getDropdownCity() {
        return dropdownCity;
    }

    public WebElementFacade getCity() {
        return city;
    }

    public WebElementFacade getPhone() {
        return phone;
    }

    public WebElementFacade getAlternatePhone() {
        return alternatePhone;
    }

    public WebElementFacade getMail() {
        return mail;
    }

    public WebElementFacade getDate() {
        return date;
    }

    public WebElementFacade getChooseDate() {
        return chooseDate;
    }

    public WebElementFacade getMonth() {
        return month;
    }

    public WebElementFacade getChooseYear() {
        return chooseYear;
    }

    public WebElementFacade getYear() {
        return year;
    }

    public WebElementFacade getDateOk() {
        return dateOk;
    }

    public WebElementFacade getDay() {
        return day;
    }

    public WebElementFacade getElectronicBill() {
        return electronicBill;
    }

    public WebElementFacade getContinueDemo() {
        return continueDemo;
    }

}
