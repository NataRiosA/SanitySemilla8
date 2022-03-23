package com.indra.actions;

import com.indra.models.ReconnectionPage;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

public class ReconnectionActions extends ReconnectionPage {
        public ReconnectionActions(WebDriver driver) {
        super(driver);
    }

    public void initialRute(){
        postSaleClick();
        transactionClick();
        lineModificationClick();
        lineModificationOptionCLick();
    }

    public void executeSuspentionOfLine(String MSISDN){
       switchToIframe();
       getNumberMobile().waitUntilPresent();
       writePhoneNumber(MSISDN);
       waitABit(1000);
       selectSuspentionService();
       writeJustification();
       getJustification().sendKeys(Keys.TAB,Keys.ENTER);
       //btnexecuteChangeClick();
       //waitABit(3000);

       Alert alert = getDriver().switchTo().alert();
        alert.accept();
        getDriver().switchTo().defaultContent();
        switchToIframe();

       getMessageOfResults().waitUntilPresent();
       waitABit(3000);
       MatcherAssert.assertThat("se presenta el mensaje",getMessageOfResults().isPresent(), Matchers.is(true));

    }

    public void postSaleClick(){
        getPostSale().click();
    }

    public void transactionClick(){
        getTransaction().click();
    }

    public void lineModificationClick(){
        getLineModification().click();
    }

    public void lineModificationOptionCLick(){
            getLineModificationOption().click();
    }

    public void switchToIframe(){
        WebElement iframe = getDriver().findElement(By.id("iframe"));
        getDriver().switchTo().frame(iframe);
    }

    public void writePhoneNumber(String phoneNumber){
            enter(phoneNumber).into(getNumberMobile());
            getNumberMobile().sendKeys(Keys.TAB);
    }

    public void selectSuspentionService(){
        Select dropDown = new Select(getDriver().findElement(By.className("selectOneListbox")));
        dropDown.selectByValue("AREST");
    }

    public void writeJustification(){
        getJustification().waitUntilPresent();
        enter("prueba suspencion de linea automatizada").into(getJustification());
    }

    public void btnexecuteChangeClick(){
        getBtnExecuteChange().click();
    }

    public void alertAcept(){
        Alert alert = getDriver().switchTo().alert();
        alert.accept();
    }

    public void consultSingleScreen(String msisdn){
        int cont=0;
        getDriver().switchTo().defaultContent();
        getConsult().click();
        getConsultPos().click();
        getConsultIntegral().click();
        getCosultaPantallaUnica().click();
        WebElement iframe = getDriver().findElement(By.id("iframe"));
        getDriver().switchTo().frame(iframe);
        enter(msisdn).into(getMsisdn2());
        getSearchButton().click();
        getGeneralCustomerInformation().waitUntilPresent();
        getLinkDetails().click();
        waitABit(1000);

        if(getPopUpDetails().isPresent()){

            WebElement sms = getDriver().findElement(By.id("j_id135:idDataTableProductosSiebel:0:j_id307"));
            WebElement data =getDriver().findElement(By.id("j_id135:idDataTableProductosSiebel:1:j_id307"));
            WebElement telefonia =getDriver().findElement(By.id("j_id135:idDataTableProductosSiebel:2:j_id307"));
            String smstx = sms.getText();
            String datatx = data.getText();
            String telefoniatx = telefonia.getText();
            if(smstx.equals("Suspendido Total") && datatx.equals("Suspendido Total") && telefoniatx.equals("Suspendido Total")){
                cont=1;
            }
        }

        MatcherAssert.assertThat("la linea esta activa",
                cont,Matchers.is(1) );
        getClosePopUp().click();
        getBtnClean().click();

        getDriver().switchTo().defaultContent();
    }

    public void consultSingleScreen2(String msisdn){
        int cont=0;
        getDriver().switchTo().defaultContent();
        getConsult().click();
        System.out.println("aca");
        WebElement iframe = getDriver().findElement(By.id("iframe"));
        getDriver().switchTo().frame(iframe);

        System.out.println("aca");
        enter(msisdn).into(getMsisdn2());
        getSearchButton().click();
        getGeneralCustomerInformation().waitUntilPresent();
        getLinkDetails().click();
        waitABit(1000);

        if(getPopUpDetails().isPresent()){

            WebElement sms = getDriver().findElement(By.id("j_id135:idDataTableProductosSiebel:0:j_id307"));
            WebElement data =getDriver().findElement(By.id("j_id135:idDataTableProductosSiebel:1:j_id307"));
            WebElement telefonia =getDriver().findElement(By.id("j_id135:idDataTableProductosSiebel:2:j_id307"));
            String smstx = sms.getText();
            String datatx = data.getText();
            String telefoniatx = telefonia.getText();

            if(smstx.equals("Activo") && datatx.equals("Activo") && telefoniatx.equals("Activo")){
                cont=1;
            }
        }

        MatcherAssert.assertThat("la linea esta Suspendida",
                cont,Matchers.is(1) );
        getClosePopUp().click();
        getBtnClean().click();

        getDriver().switchTo().defaultContent();
    }

}
