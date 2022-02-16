package com.indra.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;


@DefaultUrl("http://10.69.60.85:8280/portal/CRMPortal/Venta")
public class ControlActivationPage extends PageObject{

    public ControlActivationPage(WebDriver driver) {
        super(driver);
    }

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

    @FindBy(id = "formIndex:j_idt13Item1")
    WebElementFacade control;

    @FindBy(id = "ActivacionesForm:idVendedor")
    WebElementFacade vendor;

    @FindBy(id = "ActivacionesForm:idTipoDocButton")
    WebElementFacade buttonId;

    @FindBy(xpath = "//div[contains(@id,'ActivacionesForm:idTipoDocItem0')]")
    WebElementFacade documentType;

    @FindBy(xpath = "//input[contains(@id,'ActivacionesForm:cedulaCliente')]")
    WebElementFacade documentCC;

    @FindBy(id = "ActivacionesForm:idFechaExp")
    WebElementFacade documentExpedicion;

    @FindBy(id = "ActivacionesForm:btnContinuar")
    WebElementFacade btnContinue;

    @FindBy(xpath = "//select[contains(@id,'ActivacionesForm:decisionField')]")
    WebElementFacade acceptRenew;

    @FindBy(xpath = "/html/body/form[1]/div/div/div[5]/div[2]/table[1]/tbody/tr/td[2]/div/div/select/option[2]")
    WebElementFacade acceptRenew1;

    @FindBy(xpath = "//input[contains(@id,'ActivacionesForm:idImsi')]")
    WebElementFacade imsi;

    @FindBy(xpath = "//input[contains(@id,'ActivacionesForm:idMsisdn')]")
    WebElementFacade msisdn;

    @FindBy(xpath = "(//span[contains(@class,'rf-sel-btn-arrow')])[2]")
    WebElementFacade typeSale;

    @FindBy(xpath = "//div[contains(@id,'ActivacionesForm:tipoVentaItem0')]")
    WebElementFacade justSim;

    @FindBy(xpath = "(//span[contains(@class,'rf-sel-btn-arrow')])[3]")
    WebElementFacade plan;

    @FindBy(xpath = "//div[contains(@id,'ActivacionesForm:tipoPlanItem321')]")
    WebElementFacade plan740;

    @FindBy(xpath = "//div[contains(@id,'ActivacionesForm:tipoPlanItem346')]")
    WebElementFacade plan1208;

    @FindBy(xpath = "//input[contains(@id,'ActivacionesForm:btnContinuarActivacionVenta')]")
    WebElementFacade continuee;

    @FindBy(xpath = "//input[contains(@id,'ActivacionesForm:idBarrio')]")
    WebElementFacade district;

    @FindBy(xpath = "(//span[contains(@class,'rf-sel-btn-arrow')])[4]")
    WebElementFacade dropdownDeparment;

    @FindBy(xpath = "//div[contains(@id,'ActivacionesForm:idDepartamentoItem26')]")
    WebElementFacade deparment;

    @FindBy(xpath = "(//span[contains(@class,'rf-sel-btn-arrow')])[5]")
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

    @FindBy(xpath = "//input[contains(@id,'popupConfirmacionDatos:confirmarDatos')]")
    WebElementFacade confirm;

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

    @FindBy (id = "j_id135:j_id138")
    WebElementFacade generalCustomerInformation;


    @FindBy (className = "rf-cp-lbl-exp")
    WebElementFacade ActivationDetails;

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

    public WebElementFacade getControl() {
        return control;
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

    public WebElementFacade getAcceptRenew() {
        return acceptRenew;
    }

    public WebElementFacade getImsi() {
        return imsi;
    }

    public WebElementFacade getMsisdn() {
        return msisdn;
    }

    public WebElementFacade getTypeSale() {
        return typeSale;
    }

    public WebElementFacade getJustSim() {
        return justSim;
    }

    public WebElementFacade getPlan() {
        return plan;
    }

    public WebElementFacade getPlan740() {
        return plan740;
    }

    public WebElementFacade getContinuee() {
        return continuee;
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

    public WebElementFacade getContinueSale() {
        return continueSale;
    }

    public WebElementFacade getConfirm() {
        return confirm;
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

    public  WebElementFacade getAcceptRenew1(){
        return acceptRenew1;
    }

    public  WebElementFacade getActivationDetails(){
        return ActivationDetails;
    }

    public WebElementFacade getPlan1208() {
        return plan1208;
    }
}