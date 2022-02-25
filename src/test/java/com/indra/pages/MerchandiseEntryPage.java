package com.indra.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;

@DefaultUrl("http://10.69.60.77:8180/tigo-pos-web/logistica/entradaMasiva/index.jsf")
public class MerchandiseEntryPage extends PageObject {
    public MerchandiseEntryPage(WebDriver driver) {
            super(driver);
        }

    @FindBy(xpath = "//span[contains(@id,'formMenu:j_id20_span')]")
    WebElementFacade inventory;

    @FindBy(xpath = "//div[@id='formMenu:j_id27']")
    WebElementFacade MerchandiseEntry;

    @FindBy(xpath = "//span[contains(@id,'formMenu:j_id61:anchor')]")
    WebElementFacade massMerchandiseEntry;

    @FindBy(id = "form1:idCanal")
    WebElementFacade channel;

    @FindBy(xpath = "//*[@id='form1:idCanal']/option[5]")
    WebElementFacade storeChannel;

    @FindBy(id = "form1:idMotivo")
    WebElementFacade reason;

    @FindBy(xpath = "//*[@id='form1:idMotivo']/option[6]")
    WebElementFacade reasonMerchandiseEntry;

    @FindBy(id = "form1:idPdv")
    WebElementFacade pointSale;

    @FindBy(xpath = "//*[@id='form1:idPdv']/option[39]")
    WebElementFacade pointSaleStore;

    @FindBy(xpath = "/html/body[2]/form[1]/div/table/tbody/tr/td[2]/table/tbody/tr[1]/td[2]/span")
    WebElementFacade storeIndra;

    @FindBy(id = "form1:j_id_jsp_1849905534_57")
    WebElementFacade selectReason;

    @FindBy(xpath = "//input[contains(@id,'form1:j_id_jsp_1849905534_66')]")
    WebElementFacade bulkUploadItems;

    @FindBy(xpath = "//div[contains(@id,'fileUploadModalHeader')]")
    WebElementFacade window;

    @FindBy(xpath = "//input[contains(@id,'formload:uploadFile:file')]")
    WebElementFacade uploadFile;

    @FindBy(id = "formload:uploadFile:upload2")
    WebElementFacade uploadFile2;

    @FindBy(xpath = "/html/body[1]/div/div[2]/div[14]/table/tbody/tr[2]/td/form/div/div/div[2]/table/tbody/tr[2]/td/table/tbody/tr/td/span/span/div/div[2]/span")
    WebElementFacade compare;

    @FindBy(id = "formload:j_id_jsp_1106178179_23pc4")
    WebElementFacade upload;

    @FindBy(xpath = "/html/body[2]/form[2]/div/table[1]/tbody/tr/td/dl/dt/span[2]")
    WebElementFacade compare2;

    @FindBy (xpath= "//table[@id='form1:errorGrid']/tbody/tr/td/dl/dt/span[@class='rich-messages-label']")
    WebElementFacade ResultLoad;

    @FindBy(xpath = "(//table[@class='mystyle']/tbody/tr/td[2]/span)[1]")
    WebElementFacade puntoDeVenta;

    public WebElementFacade getPuntoDeVenta() {
        return puntoDeVenta;
    }

    public WebElementFacade getResultLoad() {
        return ResultLoad;
    }

    public WebElementFacade getInventory() {
        return inventory;
    }

    public WebElementFacade getMerchandiseEntry() {
        return MerchandiseEntry;
    }

    public WebElementFacade getMassMerchandiseEntry() {
        return massMerchandiseEntry;
    }

    public WebElementFacade getChannel() {
        return channel;
    }

    public WebElementFacade getStoreChannel() {
        return storeChannel;
    }

    public WebElementFacade getReason() {
        return reason;
    }

    public WebElementFacade getReasonMerchandiseEntry() {
        return reasonMerchandiseEntry;
    }

    public WebElementFacade getPointSale() {
        return pointSale;
    }

    public WebElementFacade getPointSaleStore() {
        return pointSaleStore;
    }

    public WebElementFacade getStoreIndra() {
        return storeIndra;
    }

    public WebElementFacade getSelectReason() {
        return selectReason;
    }

    public WebElementFacade getBulkUploadItems() {
        return bulkUploadItems;
    }

    public WebElementFacade getWindow() {
        return window;
    }

    public WebElementFacade getUploadFile() {
        return uploadFile;
    }

    public WebElementFacade getUploadFile2() {
        return uploadFile2;
    }

    public WebElementFacade getCompare() {
        return compare;
    }

    public WebElementFacade getUpload() {
        return upload;
    }

    public WebElementFacade getCompare2() {
        return compare2;
    }
}
