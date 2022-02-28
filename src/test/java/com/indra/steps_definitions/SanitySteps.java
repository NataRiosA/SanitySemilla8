package com.indra.steps_definitions;

import com.indra.actions.*;
import com.indra.models.DataExcelModels;
import com.indra.models.LoginEposModels;
import com.indra.models.LoginPortalCRMModels;
import com.indra.models.WindexModels;
import com.jcraft.jsch.JSchException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import java.awt.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;

public class SanitySteps{
    @Managed
    WebDriver driver;

    DataExcelModels dataExcelModels = new DataExcelModels();
    ResourceEnlistmentActions enlistment = new ResourceEnlistmentActions();
    LoginEposPageActions loginPageAction = new LoginEposPageActions(driver);
    MerchandiseEntryAction merchandiseEntryAction = new MerchandiseEntryAction(driver);
    InventoryAllocationActions inventoryAllocationActions = new InventoryAllocationActions(driver);
    LoginPortalCRMActions loginPortalCRMActions = new LoginPortalCRMActions(driver);
    InventoryConfirmActions activationAction = new InventoryConfirmActions();
    PrepaidActivationActions prepaidActivationActions = new PrepaidActivationActions(driver);
    CesionPortalCRMActions cesionActions = new CesionPortalCRMActions(driver);
    CesionPortalPosCRMActions cesionActions1 = new CesionPortalPosCRMActions(driver);
    int Activation =0;
    ControlActivationActions controlActivationActions = new ControlActivationActions(driver);

    AvangerActivationActions avangerActions = new AvangerActivationActions(driver);

//-----------<Primer escenario>----------------
    @Given("^Se ejecutan procedimientos en bd y soapUi$")
    public void seEjecutanProcedimientosEnBdYSoapUi() throws SQLException {
        enlistment.executeAllProcedures();
    }

    @When("^Se ingresa a la plataforma epos para cargue de inventario$")
    public void seIngresaALaPlataformaEposParaCargueDeInventario() {
        driver.get(dataExcelModels.getUrlEpos());
        loginPageAction.clickOnLogin(dataExcelModels);
    }

    @Then("^Se ingresa a entrada masiva de mercancia$")
    public void seIngresaAEntradaMasivaDeMercancia() {
        merchandiseEntryAction.loadMerchandise();
    }

    @Then("^Se completa datos para cargar mercancia$")
    public void seCompletaDatosParaCargarMercancia() throws InterruptedException {
        merchandiseEntryAction.merchandiseEntry();
        merchandiseEntryAction.merchandiseEntryInventory();
        Thread.sleep(2000);
        loginPageAction.leave();
    }

    //-----------<Segundo escenario>----------------

    @When("^Se ingresa a cargue de inventario$")
    public void seIngresaACargueDeInventario() throws InterruptedException {
        inventoryAllocationActions.loadInventory();
        Thread.sleep(2000);
        inventoryAllocationActions.leaveSesion();
    }

    @Then("^Deberia poder realizar el cargue de inventario$")
    public void deberiaPoderRealizarElCargueDeInventario() {
    }

    //-----------<Tercer escenario>----------------

    @Given("^se ingresa a la plataforma epos windex$")
    public void seIngresaALaPlataformaEposWindex() throws IOException, InterruptedException, AWTException {
        Activation= activationAction.executeStepsActivation();
    }

    @Then("^se deberia poder ver mensaje de confimacion exitosa$")
    public void seDeberiaPoderVerMensajeDeConfimacionExitosa() {
        assertThat("finaliza la confirmacion de inventario",Activation, Matchers.is(1));
    }

    //-----------<Cuarto escenario>----------------

    @Given("^Se ingresa al portal CRM para activacion$")
    public void seIngresaAlPortalCRMParaActivacion() {
        driver.get(dataExcelModels.getUrlCRM());
        loginPortalCRMActions.clickOnLogin(dataExcelModels);
    }

    @When("^Se hace activacion de una linea en prepago$")
    public void seHaceActivacionDeUnaLineaEnPrepago(){
        prepaidActivationActions.initialRute();
        prepaidActivationActions.customerInformation(dataExcelModels.getVendedorPrepago()
                , dataExcelModels.getCedulaClientePrepago());
        prepaidActivationActions.activationInformation(dataExcelModels.getMsisdnPrepago(),dataExcelModels.getMsiPrepago());
        prepaidActivationActions.demographicInformation();
    }

    @Then("^Se deberia ver en pantalla unica la linea activa en prepago$")
    public void seDeberiaVerEnPantallaUnicaLaLineaActivaEnPrepago() {
        prepaidActivationActions.consultSingleScreen(dataExcelModels.getMsisdnPrepago());
    }

    //-----------<Quinto escenario>----------------

    @When("^Se hace activacion de una linea nintendo$")
    public void seHaceActivacionDeUnaLineaNintendo() throws InterruptedException {
        controlActivationActions.initialRute();
        controlActivationActions.customerInformation(dataExcelModels.getVendedorPostpago()
                , dataExcelModels.getCedulaClientePostpago());
        controlActivationActions.activationInformation(dataExcelModels.getMsisdnPostpago(),dataExcelModels.getMsiPostpago());
        controlActivationActions.demographicInformation();
    }

    @Then("^Se deberia ver en pantalla unica la linea activa nintendo$")
    public void seDeberiaVerEnPantallaUnicaLaLineaActivaNintendo() {
        controlActivationActions.consultSingleScreen(dataExcelModels.getMsisdnPostpago());
    }

    //-----------<Sexto escenario>----------------

    @When("^Se hace la cesion de contrato de una linea pre a pos$")
    public void seHaceLaCesionDeContratoDeUnaLineaPreAPos() throws InterruptedException, AWTException, JSchException {
        cesionActions.initialRute();
        cesionActions.executeContractAssignment(dataExcelModels.getMsisdnPrepago(),dataExcelModels.getCedulaClientePrepago());
    }

    @Then("^Se deberia ver en pantalla unica la linea cedida pre$")
    public void seDeberiaVerEnPantallaUnicaLaLineaCedidaPre() {
        prepaidActivationActions.consultSingleScreen2(dataExcelModels.getMsisdnPrepago());
    }

    //-----------<Septimo escenario>----------------

    @When("^Se hace la cesion de contrato de una linea pos a pre$")
    public void seHaceLaCesionDeContratoDeUnaLineaPosAPre() throws InterruptedException, AWTException, JSchException {
        cesionActions1.initialRute();
        cesionActions1.executeContractAssignment(dataExcelModels.getMsisdnPostpago(),dataExcelModels.getCedulaClientePostpago(),"540");
    }

    @Then("^Se deberia ver en pantalla unica la linea cedida pos$")
    public void seDeberiaVerEnPantallaUnicaLaLineaCedidaPos() {
        prepaidActivationActions.consultSingleScreen2(dataExcelModels.getMsisdnPostpago());
    }

    //-----------<Octavo escenario>----------------

   @When("^Se hace activacion de una linea avanger$")
    public void seHaceActivacionDeUnaLineaAvanger() throws InterruptedException {
       avangerActions.initialRute();
       avangerActions.customerInformation(dataExcelModels.getVendedorPostpago()
                , dataExcelModels.getCedulaClienteAvanger());
       avangerActions.activationInformation(dataExcelModels.getMsisdnAvanger(),dataExcelModels.getMsiAvanger());
       avangerActions.demographicInformation();
    }

    @Then("^Se deberia ver en pantalla unica la linea activa avanger$")
    public void seDeberiaVerEnPantallaUnicaLaLineaActivaAvanger() {
        avangerActions.consultSingleScreen(dataExcelModels.getMsisdnAvanger());
    }
}



