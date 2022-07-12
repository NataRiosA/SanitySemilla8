package com.indra.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;


public class PagoEquiposPage extends PageObject {

    public PagoEquiposPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@class='TabIcon DefaultPageIcon'][contains(.,'Consultas')]")
    WebElementFacade consultas;

    @FindBy(xpath = "//img[@id='pbGc323725e_2d6efe_2d4037_2d9f93_2d1bc06edfa941:_viewRoot:j_id4:j_id10:j_id11:52::j_id12:handle:img:collapsed']")
    WebElementFacade trasaccionCaja;

    @FindBy(xpath = "//img[@id='pbGc323725e_2d6efe_2d4037_2d9f93_2d1bc06edfa941:_viewRoot:j_id4:j_id10:j_id11:52:53::j_id14:handle:img:collapsed']")
    WebElementFacade  transaccionCajaSub;

    @FindBy(xpath = "//a[contains(.,'Modulo de Pagos - control de precios')]")
    WebElementFacade  moduloPagosControl;



    @FindBy(id = "Order:identificacionField:idCliente")
    WebElementFacade identificacion;

    @FindBy(id = "Order:cmdConsultar")
    WebElementFacade btnConsultar;

    @FindBy(xpath = "//td[@id='Order:tableOrders:0:j_id35']/div[@class='extdt-cell-div']")//(id = "Order:tableOrders:1:j_id35")
    WebElementFacade textoTelefono;

    @FindBy(id = "Order:itemsTable:0:j_id96")
    WebElementFacade idItem;

    @FindBy(id="Order:radioFormaPagoC:0")
    WebElementFacade radioButtomEfectivo;

    @FindBy (id = "Order:valorAPagarEFField:valorAPagarEF")
    WebElementFacade valorAPagar;

    @FindBy(id = "Order:recibidoField:valorRecibido")
    WebElementFacade valorRecibido;

    @FindBy(id = "Order:cmdBtnPagar")
    WebElementFacade btnPagar;

    @FindBy(xpath = "//input[@value='Pagar']")//id = "btnPagarTotalFinal")
    WebElementFacade btnPagarTotal;

    @FindBy (xpath = "//ul[@class='message']")//"(//li[@class='infomsg'])[2]")
    WebElementFacade messages;

    @FindBy (xpath = "(//li[@class='infomsg'])[2]")
    WebElementFacade billPaymentmessage;

    public WebElementFacade getBillPaymentmessage() {
        return billPaymentmessage;
    }

    public WebElementFacade getMessages() {
        return messages;
    }

    public WebElementFacade getConsultas() {
        return consultas;
    }

    public WebElementFacade getTrasaccionCaja() {
        return trasaccionCaja;
    }

    public WebElementFacade getTransaccionCajaSub() {
        return transaccionCajaSub;
    }

    public WebElementFacade getModuloPagosControl() {
        return moduloPagosControl;
    }

    public WebElementFacade getIdentificacion() {
        return identificacion;
    }

    public WebElementFacade getBtnConsultar() {
        return btnConsultar;
    }

    public WebElementFacade getTextoTelefono() {
        return textoTelefono;
    }

    public WebElementFacade getIdItem() {
        return idItem;
    }

    public WebElementFacade getRadioButtomEfectivo() {
        return radioButtomEfectivo;
    }

    public WebElementFacade getValorAPagar() {
        return valorAPagar;
    }

    public WebElementFacade getValorRecibido() {
        return valorRecibido;
    }

    public WebElementFacade getBtnPagar() {
        return btnPagar;
    }

    public WebElementFacade getBtnPagarTotal() {
        return btnPagarTotal;
    }
}