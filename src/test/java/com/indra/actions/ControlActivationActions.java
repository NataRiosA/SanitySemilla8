package com.indra.actions;

import com.indra.pages.ControlActivationPage;
import com.indra.pages.PrepaidActivationPage;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ControlActivationActions extends ControlActivationPage {

    public ControlActivationActions(WebDriver driver) {
        super(driver);
    }

    public void initialRute(){
        getSale().click();
        getDropdownActivation().click();
        getDropdownPay().click();
        getActivator().click();
        waitABit(1300);
        WebElement iframe = getDriver().findElement(By.id("iframe"));
        getDriver().switchTo().frame(iframe);
        getDropdownActivator().waitUntilVisible();
        getDropdownActivator().click();
        getControl().click();
    }

    public void customerInformation(String vendedor,String cliente)  {

        enter(vendedor).into(getVendor());
        getButtonId().click();
        getDocumentType().click();
        enter(cliente).into(getDocumentCC());
        enter("2000").into(getDocumentExpedicion());
        waitABit(2000);
        getBtnContinue().click();
    }

    public void activationInformation(String msisdn,String imsi, String planNumber) throws InterruptedException {
        //enter("732111198172290").into(getImsi());
        //enter("3016875893").into(getMsisdn());
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        getAcceptRenew().click();
        getAcceptRenew1().click();
        enter(imsi).into(getImsi());
        enter(msisdn).into(getMsisdn());
        getTypeSale().click();
        getJustSim().click();
        //js.executeScript("window.scrollBy(0,820)");

        js.executeScript("window.scrollBy(-820,0)");
        getPlan().waitUntilPresent();
        getPlan().click();

        selectPlan(planNumber);
        getDriver().switchTo().defaultContent();

        js.executeScript("window.scrollBy(0,420)"); //Scroll vertically down by 1000 pixels
        WebElement iframe = getDriver().findElement(By.id("iframe"));
        getDriver().switchTo().frame(iframe);
        waitABit(500);
        WebElement continuar = getDriver().findElement(By.name("ActivacionesForm:btnContinuarActivacionVenta"));
        continuar.click();
    }

    public void selectPlan(String planNumber){
        List<WebElement> dropDownPlan= getDriver().findElements(By.className("rf-sel-opt"));

        for(WebElement a : dropDownPlan){
            if (a.getText().contains(planNumber)) {
                a.click();
                break;
            }
        }
    }

    public  void demographicInformation(){
        enter("Salazar londonio").into(getDistrict());
        getDropdownDeparment().click();
        getDeparment().click();
        getDropdownCity().click();
        getCity().click();
        enter("3222345678").into(getPhone());
        enter("3222345679").into(getAlternatePhone());
        enter("pruebaAutoma@gmail.com").into(getMail());
        getDate().click();
        getChooseDate().click();
        getMonth().click();
        getChooseYear().click();
        getChooseYear().click();
        getYear().click();
        getDateOk().click();
        getDay().click();
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,420)"); //Scroll vertically down by 1000 pixels
        getElectronicBill().click();
        getContinueDemo().click();
        getContinueSale().click();
        waitABit(2000);
        getConfirm().click();
        getActivationDetails().waitUntilPresent();
        WebElement title = getDriver().findElement(By.className("tituloPagina"));
        MatcherAssert.assertThat("La activacion fue exitosa",title.getText(), Matchers.equalTo("ACTIVACION EXITOSA"));
    }

    public void consultSingleScreen(String msisdn){
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
        WebElement plan = getDriver().findElement(By.id("j_id135:j_id161"));

        MatcherAssert.assertThat("el plan es pospago",
                plan.getText(),Matchers.containsString("Pospago 5.") );
    }

}