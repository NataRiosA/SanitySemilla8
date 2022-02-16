package com.indra.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
@DefaultUrl("http://10.69.60.77:8180/tigo-pos-web-ii/asignacion/asignacion.jsf")
public class InventoryAllocationPage extends PageObject {

    public InventoryAllocationPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "form1:panelSeleccion_header")
    WebElementFacade inventoryTitle;

    @FindBy(id = "formMenu:j_id21:anchor")
    WebElementFacade inventoryAllocation;

    @FindBy(id = "formMenu:j_id38:anchor")
    WebElementFacade subInventoryAllocation;

    @FindBy(xpath = "(//table[@class='mystyle']/tbody/tr/td[2]/span)[1]")
    WebElementFacade puntoDeVenta;

    @FindBy(xpath = "(//table[@class='mystyle']/tbody/tr/td[2]/span)[2]")
    WebElementFacade Usuario;

    @FindBy(xpath="//input[@id='form1:cedula']")
    WebElementFacade vendedor;
    @FindBy(xpath = "//select[@id='form1:tipoProd']")
    WebElementFacade tipoProducto;

    @FindBy(xpath = "//div[@id='form1:panelBusqueda_body']/input[@class='boton1']")
    WebElementFacade btnAgregarProductos;

    @FindBy(xpath ="//input[@id='form1:selectArticuloscomboboxField']")
    WebElementFacade inputArticule;

    @FindBy(id = "form1:j_id_jsp_345971159_11pc4")
    WebElementFacade btnSeleccionar;

    @FindBy(id = "form1:dataList")
    WebElementFacade tableCargaMasiva;

    @FindBy (xpath ="//a[@id='form1:dataList:0:link1']/img[@alt='Carga Masiva']")
    WebElementFacade btnCargaMasiva;

    @FindBy(id = "formUpload:upload:file")
    WebElement btnCargarArchivo;

    @FindBy(xpath = "//*[@id='formUpload:j_id_jsp_1482417417_216']")
    WebElementFacade btnAccept;

    @FindBy(id = "form1:j_id_jsp_1482417417_167")
    WebElementFacade btnAcceptInventory;

    @FindBy(id = "menu:formMenu:j_id33:anchor")
    WebElementFacade btnLeave;

    @FindBy(id = "form1:cabezoteGrid")
    WebElementFacade messageAllocationInventory;

    public WebElementFacade getMessageAllocationInventory() {
        return messageAllocationInventory;
    }

    public WebElementFacade getBtnLeave() {
        return btnLeave;
    }

    public WebElement getBtnCargarArchivo() {
        return btnCargarArchivo;
    }

    public WebElementFacade getTableCargaMasiva() {
        return tableCargaMasiva;
    }

    public WebElementFacade getBtnCargaMasiva() {
        return btnCargaMasiva;
    }

    public WebElementFacade getBtnSeleccionar() {
        return btnSeleccionar;
    }

    public WebElementFacade getInputArticule() {
        return inputArticule;
    }

    public WebElementFacade getBtnAgregarProductos() {
        return btnAgregarProductos;
    }

    public WebElementFacade getPuntoDeVenta() {
        return puntoDeVenta;
    }

    public WebElementFacade getUsuario() {
        return Usuario;
    }

    public WebElementFacade getVendedor() {
        return vendedor;
    }

    public WebElementFacade getTipoProducto() {
        return tipoProducto;
    }

    public WebElementFacade getInventoryTitle() {
        return inventoryTitle;
    }

    public WebElementFacade getInventoryAllocation() {
        return inventoryAllocation;
    }

    public WebElementFacade getSubInventoryAllocation() {
        return subInventoryAllocation;
    }

    public WebElementFacade getBtnAccept() {
        return btnAccept;
    }

    public WebElementFacade getBtnAcceptInventory(){
        return btnAcceptInventory;
    }
}