package com.indra.actions;

import com.indra.pages.PagoEquiposPage;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.openqa.selenium.*;

public class PagoEquiposActions extends PagoEquiposPage {


    public PagoEquiposActions(WebDriver driver) {
        super(driver);
    }



    public void rutaInicial(){
        switchToDefaultContent();

        clickModuloConsultas();
        clickTrasaccionCaja();
        clickTrasaccionCajaSub();
        clickModuloDePagos();

    }

    public void pagarEquipo(String identificacion, String numeroCelular){
        switchToFrame();
        getIdentificacion().waitUntilPresent();
        ingresaNumeroIdentificacion(identificacion);
        clickConsultar();
        waitABit(200);

        switchToDefaultContent();
        WebElement toque = getDriver().findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div/div/div[2]/div/div/div/div/div/div/div[1]/div[3]/div/div/div/div/div/div/div/div[1]/div[2]/div/div/div/div/div/div/table/tbody/tr/td[1]/form/div/div/div/div/div[2]"));
        toque.click();
        switchToFrame();

        getTextoTelefono().waitUntilVisible();
        if(getTextoTelefono().getText().equals(numeroCelular)) {

            switchToDefaultContent();

            scrollDown("10");
            switchToFrame();

            clickEnElTextoTelefeno();

            getRadioButtomEfectivo().waitUntilPresent();
            scrollDown("840");
            switchToDefaultContent();
            scrollDown("840");
            switchToFrame();
            seleccionaRadioButtonEfectivo();
            ingresarValorEquipo();

            clickBotonPagar();
            clickBotonPagoTotal();
            getBillPaymentmessage().waitUntilPresent();

            System.out.println("***********************************************************************************");
            System.out.println(getMessages().getText());
            System.out.println("***********************************************************************************");

            MatcherAssert.assertThat("la factura se paga de manera correcta"
                    , getMessages().getText()
                    , Matchers.containsString("Factura Electronica generada correctamente"));


        }
        else{
            System.out.println("El numero de telefono"+numeroCelular+"no coincide con el que se debe pagar");
        }
    }

    public void clickModuloConsultas(){

        getConsultas().click();

    }

    public void clickTrasaccionCaja(){
        getTrasaccionCaja().click();
    }

    public void clickTrasaccionCajaSub(){
        getTransaccionCajaSub().click();
    }

    public  void clickModuloDePagos(){
        getModuloPagosControl().click();
    }


    public void ingresaNumeroIdentificacion(String identificacion){
        enter(identificacion).into(getIdentificacion());
    }

    public void clickConsultar(){
        getBtnConsultar().click();
    }

    public void clickEnElTextoTelefeno(){
        getTextoTelefono().click();
    }

    public void seleccionaRadioButtonEfectivo(){
        getRadioButtomEfectivo().click();
    }

    public void ingresarValorEquipo(){
        String valor = getValorAPagar().getValue();
        getValorRecibido().clear();
        waitABit(200);
        enter(valor, Keys.TAB).into(getValorRecibido());
    }

    public void clickBotonPagar(){
        getBtnPagar().click();
    }

    public void clickBotonPagoTotal(){
        getBtnPagarTotal().click();
    }

    public void switchToFrame(){
        WebElement iframe = getDriver().findElement(By.id("iframe"));
        getDriver().switchTo().frame(iframe);
    }
    public void switchToDefaultContent(){
        getDriver().switchTo().defaultContent();
    }
    public void scrollDown(String cantidadPixeles){
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,"+cantidadPixeles+")");
        js.executeScript("window.scrollBy(0,"+cantidadPixeles+")");
    }

}
