package com.indra.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;

public class SuspentionPage extends PageObject {
    public SuspentionPage(WebDriver driver) {
        super(driver);
    }
    //j_id135:j_id184 --> link detalles
    //j_id135:j_id294 --> pop ud detalles
    //iceDatTblCol1  -->  nombre y estado

    @FindBy(id ="j_id135:j_id188" )
    WebElementFacade linkDetails;

    @FindBy(xpath="//div[@id='j_id135:j_id298']//table/tbody[1]/tr[1]/td[1]" )
    WebElementFacade popUpDetails;

    @FindBy(id ="iceDatTblCol1" )
    WebElementFacade resumeDetails;

    @FindBy(id="j_id135:modalPnlCloseProducts")
    WebElementFacade closePopUp;

    @FindBy(id="j_id15:j_id28")
    WebElementFacade btnClean;

    @FindBy(xpath = "//a[@class='TabIcon DefaultPageIcon'][contains(.,'Postventa')]")
    WebElementFacade postSale;

    @FindBy(xpath = "//img[@id='pbGf5a1f4f3_2d5ecc_2d4e4a_2d8654_2d6459a01c3953:_viewRoot:j_id4:j_id10:j_id11:0::j_id12:handle:img:collapsed']" )
    WebElementFacade transaction;

    @FindBy(xpath = "//img[@id='pbGf5a1f4f3_2d5ecc_2d4e4a_2d8654_2d6459a01c3953:_viewRoot:j_id4:j_id10:j_id11:0:1::j_id14:handle:img:collapsed']" )
    WebElementFacade lineModification;

    @FindBy(id ="pbGf5a1f4f3_2d5ecc_2d4e4a_2d8654_2d6459a01c3953:_viewRoot:j_id4:j_id10:j_id11:0:1:2::j_id17" )
    WebElementFacade lineModificationOption;


    @FindBy(id="ServicesForm:msisdn")
    WebElementFacade numberMobile;

    @FindBy(className="selectOneListbox")
    WebElementFacade service;

    //Reconectar suspensi¿¿n temporal
    // value AREST

    @FindBy(id = "ServicesForm:reason")
    WebElementFacade justification;

    @FindBy(xpath = "//div[@class='actionButtons']//table/tbody[1]/tr[1]/td[1]/input[1]")
    WebElementFacade btnExecuteChange;

    @FindBy (xpath = "//form[@id='ServicesForm']//table/tbody[1]/tr[1]/td[1]/div[1]/div[1]/ul[1]/li[2]")
    WebElementFacade messageOfResults;



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





    public WebElementFacade getPostSale() {
        return postSale;
    }

    public WebElementFacade getTransaction() {
        return transaction;
    }

    public WebElementFacade getLineModification() {
        return lineModification;
    }

    public WebElementFacade getLineModificationOption() {
        return lineModificationOption;
    }

    public WebElementFacade getNumberMobile() {
        return numberMobile;
    }

    public WebElementFacade getService() {
        return service;
    }

    public WebElementFacade getJustification() {
        return justification;
    }

    public WebElementFacade getBtnExecuteChange() {
        return btnExecuteChange;
    }

    public WebElementFacade getMessageOfResults() {
        return messageOfResults;
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

    public WebElementFacade getLinkDetails() {
        return linkDetails;
    }

    public WebElementFacade getPopUpDetails() {
        return popUpDetails;
    }

    public WebElementFacade getResumeDetails() {
        return resumeDetails;
    }

    public WebElementFacade getClosePopUp() {
        return closePopUp;
    }

    public WebElementFacade getBtnClean() {
        return btnClean;
    }
}
