package com.indra.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;

public class PortabilityPrepaidPage extends PageObject {
    public PortabilityPrepaidPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//a[@class='TabIcon DefaultPageIcon'][contains(.,'Venta')]")
    WebElementFacade venta;

    @FindBy(xpath = "//img[contains(@id,'pbG1dfca009_2d52ed_2d45cd_2da543_2d6660573bef81:_viewRoot:j_id4:j_id10:j_id11:0::j_id12:handle:img:collapsed')]")
    WebElementFacade  activacion;

    @FindBy(xpath = "//img[contains(@id,'pbG1dfca009_2d52ed_2d45cd_2da543_2d6660573bef81:_viewRoot:j_id4:j_id10:j_id11:0:29::j_id14:handle:img:collapsed')]")
    WebElementFacade  pagoAplazos;

    @FindBy(xpath = "//a[contains(@id,'pbG1dfca009_2d52ed_2d45cd_2da543_2d6660573bef81:_viewRoot:j_id4:j_id10:j_id11:0:29:31::j_id17')]")
    WebElementFacade  activador;

    @FindBy(xpath = "//span[contains(@class,'rf-sel-btn-arrow')]")
    WebElementFacade  listaDesplegable;

    @FindBy(xpath = "//div[@id='formIndex:j_idt13Item2']")
    WebElementFacade  portabilidadPrepago;

    @FindBy(xpath = "//input[@id='ActivacionesForm:idVendedor']")
    WebElementFacade  idAsesor;

    @FindBy(xpath = "//span[@class='rf-sel-btn-arrow']")
    WebElementFacade  listaTipoIdentificacion;

    @FindBy(xpath = "//div[@id='ActivacionesForm:idTipoDocItem0']")
    WebElementFacade  TipoCC;

    @FindBy(xpath = "//input[@id='ActivacionesForm:cedulaCliente']")
    WebElementFacade  numIdentificacion;

    @FindBy(xpath = "//input[@id='ActivacionesForm:idExpedicion']")
    WebElementFacade  anioExpedicion;

    @FindBy(xpath = "//input[@id='ActivacionesForm:btnContinuar']")
    WebElementFacade  btncontinuar;

    @FindBy(xpath = "(//span[@class='rf-sel-btn-arrow'])[2]")
    WebElementFacade  listaDesplegableTipoTelefonia;

    @FindBy(xpath = "//div[@id='ActivacionesForm:portationTelTypeItem1']")
    WebElementFacade  tipoPrepago;

    @FindBy(xpath = "//input[@id='ActivacionesForm:portationPin']")
    WebElementFacade  inputNip;

    @FindBy(xpath = "//input[@id='ActivacionesForm:portationMsisdn']")
    WebElementFacade  inputMsisdnAportar;

    @FindBy(xpath = "//input[@id='ActivacionesForm:idImsi']")
    WebElementFacade  inputImsi;

    @FindBy(xpath = "//input[@id='ActivacionesForm:idMsisdn']")
    WebElementFacade  inputMsisdn;

    @FindBy(xpath = "(//span[@class='rf-sel-btn-arrow'])[4]")
    WebElementFacade  listaDesplegableTipoVenta;

    @FindBy(xpath = "//div[@id='ActivacionesForm:tipoVentaItem0']")
    WebElementFacade  tipoSimSola;

    @FindBy(xpath = "//input[@id='ActivacionesForm:idEsFechaCalendarizada']")
    WebElementFacade  checkFechaCalendarizada;

    @FindBy(xpath = "//img[@id='ActivacionesForm:fechaActivacionPortabilidadPopupButton']")
    WebElementFacade inputcalendario;

    @FindBy(xpath = "//input[@id='ActivacionesForm:btnContinuarActivacionVenta']")
    WebElementFacade bntContinuar;


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


    @FindBy(xpath = "//a[@class='TabIcon DefaultPageIcon'][contains(.,'Preventa')]")
    WebElementFacade  preventa;

    @FindBy(xpath = "//img[contains(@id,'pbGac4fa497_2d8304_2d4e12_2d8e75_2d0ee02636d5e8:_viewRoot:j_id4:j_id10:j_id11:106::j_id12:handle:img:collapsed')]")
    WebElementFacade  portabilidadNumerica;

    @FindBy(xpath = "//img[contains(@id,'pbGac4fa497_2d8304_2d4e12_2d8e75_2d0ee02636d5e8:_viewRoot:j_id4:j_id10:j_id11:106:107::j_id14:handle:img:collapsed')]")
    WebElementFacade  solicitudes;

    @FindBy(xpath = "//a[@id='pbGac4fa497_2d8304_2d4e12_2d8e75_2d0ee02636d5e8:_viewRoot:j_id4:j_id10:j_id11:106:107:108::j_id17']")
    WebElementFacade  solicitudDeNIP;

    @FindBy(xpath = "//input[contains(@id,'id26')][@name='frmSlctdPin:j_id20:0:j_id26']")
    WebElementFacade  numero;

    @FindBy(xpath = "//input[contains(@id,'frmSlctdPin:j_id20:j_id40')]")
    WebElementFacade  btnSolicitar;


    @FindBy (id = "j_id373:menu:j_id374:j_id422:j_id425:out")
    WebElementFacade hlr;

    @FindBy (xpath = "/html/body/div/div/div[4]/div/form/div[2]/div[11]/a/span")
    WebElementFacade hlrImpre;

    @FindBy(id = "ActivacionesForm:btnContinuarTarifas")
    WebElementFacade continueTarife;

    @FindBy(xpath = "(//span[@class='rf-sel-btn-arrow'])[5]")
    WebElementFacade paymentDepar;

    @FindBy(xpath = "//div[@id='ActivacionesForm:idDepartamentoItem5']")
    WebElementFacade deparment;

    @FindBy(xpath = "(//span[@class='rf-sel-btn-arrow'])[6]")
    WebElementFacade paymentCity;

    @FindBy(xpath = "//div[@id='ActivacionesForm:idCiudadItem1']")
    WebElementFacade city;

    @FindBy(xpath = "//input[contains(@id,'ActivacionesForm:btnValidarDireccion')]")
    WebElementFacade validate;

    @FindBy(xpath = "//input[@id='ActivacionesForm:idTelefono']")
    WebElementFacade phone;

    @FindBy(xpath = "//input[@id='ActivacionesForm:btnContinuarActivacionDemografica']")
    WebElementFacade continueActivationDemo;

    @FindBy(xpath = "//input[contains(@id,'popupConfirmacionDatos:confirmarDatos')]")
    WebElementFacade confirm;

    @FindBy (className = "rf-cp-lbl-exp")
    WebElementFacade ActivationDetails;



    public WebElementFacade getPreventa() {
        return preventa;
    }

    public WebElementFacade getPortabilidadNumerica() {
        return portabilidadNumerica;
    }

    public WebElementFacade getSolicitudes() {
        return solicitudes;
    }

    public WebElementFacade getSolicitudDeNIP() {
        return solicitudDeNIP;
    }

    public WebElementFacade getNumero() {
        return numero;
    }

    public WebElementFacade getBtnSolicitar() {
        return btnSolicitar;
    }

    public WebElementFacade getVenta() {
        return venta;
    }

    public WebElementFacade getActivacion() {
        return activacion;
    }

    public WebElementFacade getPagoAplazos() {
        return pagoAplazos;
    }

    public WebElementFacade getActivador() {
        return activador;
    }

    public WebElementFacade getListaDesplegable() {
        return listaDesplegable;
    }

    public WebElementFacade getPortabilidadPrepago() {
        return portabilidadPrepago;
    }

    public WebElementFacade getIdAsesor() {
        return idAsesor;
    }

    public WebElementFacade getListaTipoIdentificacion() {
        return listaTipoIdentificacion;
    }

    public WebElementFacade getTipoCC() {
        return TipoCC;
    }

    public WebElementFacade getNumIdentificacion() {
        return numIdentificacion;
    }

    public WebElementFacade getAnioExpedicion() {
        return anioExpedicion;
    }

    public WebElementFacade getBtncontinuar() {
        return btncontinuar;
    }

    public WebElementFacade getListaDesplegableTipoTelefonia() {
        return listaDesplegableTipoTelefonia;
    }

    public WebElementFacade getTipoPrepago() {
        return tipoPrepago;
    }

    public WebElementFacade getInputNip() {
        return inputNip;
    }

    public WebElementFacade getInputMsisdnAportar() {
        return inputMsisdnAportar;
    }

    public WebElementFacade getInputImsi() {
        return inputImsi;
    }

    public WebElementFacade getInputMsisdn() {
        return inputMsisdn;
    }

    public WebElementFacade getListaDesplegableTipoVenta() {
        return listaDesplegableTipoVenta;
    }

    public WebElementFacade getTipoSimSola() {
        return tipoSimSola;
    }

    public WebElementFacade getCheckFechaCalendarizada() {
        return checkFechaCalendarizada;
    }

    public WebElementFacade getInputcalendario() {
        return inputcalendario;
    }

    public WebElementFacade getBntContinuar() {
        return bntContinuar;
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


    public WebElementFacade getHlr() {
        return hlr;
    }

    public WebElementFacade getHlrImpre() {
        return hlrImpre;
    }

    public WebElementFacade getContinueTarife() {
        return continueTarife;
    }


    public WebElementFacade getPaymentDepar() {
        return paymentDepar;
    }

    public WebElementFacade getDeparment() {
        return deparment;
    }

    public WebElementFacade getPaymentCity() {
        return paymentCity;
    }

    public WebElementFacade getCity() {
        return city;
    }

    public WebElementFacade getValidate() {
        return validate;
    }

    public WebElementFacade getPhone() {
        return phone;
    }

    public WebElementFacade getContinueActivationDemo() {
        return continueActivationDemo;
    }

    public WebElementFacade getConfirm() {
        return confirm;
    }

    public WebElementFacade getActivationDetails() {
        return ActivationDetails;
    }
}
