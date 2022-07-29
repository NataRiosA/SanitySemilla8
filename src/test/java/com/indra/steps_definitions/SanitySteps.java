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
    CambioPosPreActions cambioPosPreActions = new CambioPosPreActions(driver);
    AvangerActivationActions avangerActions = new AvangerActivationActions(driver);
    CambioPrePosActions cambioPrePosActions = new CambioPrePosActions(driver);
    SuspentionActions suspentionActions = new SuspentionActions(driver);
    ReconnectionActions reconnectionActions = new ReconnectionActions(driver);
    PortabilityPrepaidActions portabilityPrepaidActions = new PortabilityPrepaidActions(driver);
    PortabilityPostActivationActions portabilityPostActivationActions = new PortabilityPostActivationActions(driver);

    CesionNitaNitActions cesionNit = new CesionNitaNitActions(driver);

    ControlActivationNitActions controlActivationNitActions = new ControlActivationNitActions(driver);
    PagoEquiposActions pagoEquiposActions = new PagoEquiposActions(driver);
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

        //legalizacion del pedido
        pagoEquiposActions.rutaInicial();
        pagoEquiposActions.pagarEquipo(dataExcelModels.getCedulaClientePrepago(),dataExcelModels.getMsisdnPrepago());
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

        //legalizacion del pedido
        pagoEquiposActions.rutaInicial();
        pagoEquiposActions.pagarEquipo(dataExcelModels.getCedulaClientePostpago(),dataExcelModels.getMsisdnPostpago());
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
        //legalizacion del pedido
        pagoEquiposActions.rutaInicial();
        pagoEquiposActions.pagarEquipo(dataExcelModels.getCedulaClientePostpago(),dataExcelModels.getMsisdnPrepago());
    }

    //-----------<Septimo escenario>----------------

    @When("^Se hace la cesion de contrato de una linea pos a pre$")
    public void seHaceLaCesionDeContratoDeUnaLineaPosAPre() throws InterruptedException, AWTException, JSchException {
        cesionActions1.initialRute();
        cesionActions1.executeContractAssignment(dataExcelModels.getMsisdnPostpago(),dataExcelModels.getCedulaClientePostpago(),"1208");
    }

    @Then("^Se deberia ver en pantalla unica la linea cedida pos$")
    public void seDeberiaVerEnPantallaUnicaLaLineaCedidaPos() {
        prepaidActivationActions.consultSingleScreen2(dataExcelModels.getMsisdnPostpago());

        //legalizacion del pedido
        pagoEquiposActions.rutaInicial();
        pagoEquiposActions.pagarEquipo(dataExcelModels.getCedulaClientePrepago(),dataExcelModels.getMsisdnPostpago());
    }

    //-----------<Octavo escenario>----------------

   @When("^Se hace activacion de una linea avanger$")
    public void seHaceActivacionDeUnaLineaAvanger() throws InterruptedException {
       avangerActions.initialRute();
       avangerActions.customerInformation(dataExcelModels.getVendedorPostpago()
                , dataExcelModels.getCedulaClienteAvanger());
       avangerActions.activationInformation(dataExcelModels.getMsisdnAvanger(),dataExcelModels.getMsiAvanger(), "1208");
       avangerActions.demographicInformation();
    }

    @Then("^Se deberia ver en pantalla unica la linea activa avanger$")
    public void seDeberiaVerEnPantallaUnicaLaLineaActivaAvanger() {
        avangerActions.consultSingleScreen(dataExcelModels.getMsisdnAvanger());

        //legalizacion del pedido
        pagoEquiposActions.rutaInicial();
        pagoEquiposActions.pagarEquipo(dataExcelModels.getCedulaClienteAvanger(),dataExcelModels.getMsisdnAvanger());
    }

    //-----------<Noveno escenario>----------------

    @When("^Se hace el cambio plan de pos a pre$")
    public void seHaceElCambioPlanDePosAPre() throws InterruptedException, AWTException {
        cambioPosPreActions.initialRute();
        cambioPosPreActions.executeContractAssignment(dataExcelModels.getMsisdnPostpago(),dataExcelModels.getCedulaClienteAvanger());
    }

    @Then("^Se deberia ver en pantalla unica la linea en plan pos$")
    public void seDeberiaVerEnPantallaUnicaLaLineaEnPlanPos() {
        cambioPosPreActions.waitUntilExecuteChange(60000);
        prepaidActivationActions.consultSingleScreen(dataExcelModels.getMsisdnPostpago());
        //legalizacion del pedido
        pagoEquiposActions.rutaInicial();
        pagoEquiposActions.pagarEquipo(dataExcelModels.getCedulaClienteAvanger(),dataExcelModels.getMsisdnPostpago());

    }

    //-----------<Decimo escenario>----------------

    @When("^Se hace el cambio plan de pre a pos$")
    public void seHaceElCambioPlanDePreAPos() throws InterruptedException, AWTException, JSchException {
        cambioPrePosActions.initialRute();
        cambioPrePosActions.executeContractAssignment(dataExcelModels.getMsisdnPostpago(),dataExcelModels.getVendedorPostpago());
    }

    @Then("^Se deberia ver en pantalla unica la linea en plan pre$")
    public void seDeberiaVerEnPantallaUnicaLaLineaEnPlanPre() {
        cambioPrePosActions.waitUntilExecuteChange(60000);
        prepaidActivationActions.consultSingleScreen2(dataExcelModels.getMsisdnPostpago());
        //legalizacion del pedido
        pagoEquiposActions.rutaInicial();
        pagoEquiposActions.pagarEquipo(dataExcelModels.getCedulaClienteAvanger(),dataExcelModels.getMsisdnPostpago());

    }

    //-----------<Once escenario>----------------

    @When("^Se ejecuta la suspension de la linea$")
    public void seEjecutaLaSuspensionDeLaLinea() {

        suspentionActions.consultSingleScreen(dataExcelModels.getMSISDN());
        suspentionActions.initialRute();
        suspentionActions.executeSuspentionOfLine(dataExcelModels.getMSISDN());//(dataExcelModels.getMsisdnPrepago());
    }


    @Then("^Se deberia ver en pantalla unica la linea en estado suspendida$")
    public void seDeberiaVerEnPantallaUnicaLaLineaEnEstadoSuspendida() {
        suspentionActions.consultSingleScreen2(dataExcelModels.getMSISDN());
    }

    //--------------<Doce escenario>---------------------

    @When("^Se ejecuta la reconexion de la linea$")
    public void seEjecutaLaReconexionDeLaLinea() {
        reconnectionActions.consultSingleScreen(dataExcelModels.getMSISDN());
        reconnectionActions.initialRute();
        reconnectionActions.executeSuspentionOfLine(dataExcelModels.getMSISDN());//(dataExcelModels.getMsisdnPrepago());
    }


    @Then("^Se deberia ver en pantalla unica la linea en estado reconectada$")
    public void seDeberiaVerEnPantallaUnicaLaLineaEnEstadoReconectada() {
        reconnectionActions.consultSingleScreen2(dataExcelModels.getMSISDN());
    }

    //--------------<Trece escenario>---------------------
    @When("^se hace la solicitud de portabilidad$")
    public void seHaceLaSolicitudDePortabilidad() throws SQLException {
        portabilityPostActivationActions.initialRute(dataExcelModels.getMsisdnPort());
    }

    @When("^se realiza la activacion de la linea a portar$")
    public void seRealizaLaActivacionDeLaLineaAPortar() throws SQLException {
          portabilityPostActivationActions.initialPortability();
          portabilityPostActivationActions.customerInformation(dataExcelModels.getVendedorPostpago()
              , dataExcelModels.getClientPort());
          portabilityPostActivationActions.activationPortability(dataExcelModels.getMsisdnPort(),dataExcelModels.getMsisdnPrepago(), dataExcelModels.getMsiPrepago());
          portabilityPostActivationActions.demographicInformation();
    }

    @Then("^Se deberia ver en pantalla unica la linea en estado activado$")
    public void seDeberiaVerEnPantallaUnicaLaLineaEnEstadoActivado() throws SQLException {
        portabilityPostActivationActions.waitUntilExecuteChange(60000);
        portabilityPostActivationActions.validateLineTemporal(dataExcelModels.getMsisdnForPorting2());
        //legalizacion del pedido
        pagoEquiposActions.rutaInicial();
        pagoEquiposActions.pagarEquipo(dataExcelModels.getClientPort(),dataExcelModels.getMsisdnForPorting2());
    }

    @When("^se ejecutan los procedimientos preventana$")
    public void seEjecutanLosProcedimientosPreventana() throws SQLException {
        portabilityPostActivationActions.preWindow();
    }

    @When("^se crea la ventana de portacion en SoapUi$")
    public void seCreaLaVentanaDePortacionEnSoapUi() throws SQLException {
        portabilityPostActivationActions.window();
    }

    @When("^se realiza la ejecucion de la shell de portacion$")
    public void seRealizaLaEjecucionDeLaShellDePortacion() throws Exception {
        portabilityPostActivationActions.adviserKeyGeneration();
    }

    @Then("^Se deberia ver en pantalla unica la linea en estado activado la linea portada$")
    public void seDeberiaVerEnPantallaUnicaLaLineaEnEstadoActivadoLaLineaPortada() throws SQLException {
        portabilityPostActivationActions.validateLineTemporal1(dataExcelModels.getMsisdnPort());
    }
    //--------------<Excenario catorce>---------------------


    @When("^se hace la solicitud de portabilidad prepago$")
    public void seHaceLaSolicitudDePortabilidadPrepago() throws SQLException {
        portabilityPrepaidActions.makePortabilityRequestAndDB(dataExcelModels.getMsisdnPort());
    }


    @When("^se realiza la activacion de la linea portada$")
    public void seRealizaLaActivacionDeLaLineaPortada() throws SQLException {
        portabilityPrepaidActions.initialRute();
        portabilityPrepaidActions.customerInformation(dataExcelModels.getVendedorPostpago()
                , dataExcelModels.getCedulaClienteAvanger());
        portabilityPrepaidActions.activationInformation(dataExcelModels.getMsisdnPort1(),dataExcelModels.getMsisdnForPorting(),dataExcelModels.getMsiForPorting());
        portabilityPrepaidActions.selectNextBusinessDayFromCalendar();
        portabilityPrepaidActions.demographicInformation();

    }

    @Then("^Se deberia ver en pantalla unica la linea prepago en estado activado$")
    public void seDeberiaVerEnPantallaUnicaLaLineaPrepagoEnEstadoActivado() throws SQLException {
        portabilityPrepaidActions.waitUntilExecuteChange(60000);

        portabilityPrepaidActions.validateLineTemporal("3043208091");
        //legalizacion del pedido
        pagoEquiposActions.rutaInicial();
        pagoEquiposActions.pagarEquipo(dataExcelModels.getCedulaClienteAvanger(),dataExcelModels.getMsisdnForPorting());

    }

    @Then("^se ejecutan los procedimientos preventana prepago$")
    public void seEjecutanLosProcedimientosPreventanaPrepago() throws SQLException {
        portabilityPrepaidActions.preWindow();
    }

    @Then("^se crea la ventana de portacion en SoapUi prepago$")
    public void seCreaLaVentanaDePortacionEnSoapUiPrepago() throws SQLException {
        portabilityPrepaidActions.window();
    }

    @Then("^Se deberia ver en pantalla unica la linea en estado activado la linea prepago portada$")
    public void seDeberiaVerEnPantallaUnicaLaLineaEnEstadoActivadoLaLineaPrepagoPortada() throws SQLException {
        portabilityPrepaidActions.validateLineTemporal1("1234567890");
    }

    //--------------<Escenario quince>---------------------

    @When("^Se hace activacion de una linea nintendo con nit$")
    public void seHaceActivacionDeUnaLineaNintendoConNit() throws InterruptedException {
        controlActivationNitActions.initialRute();
        controlActivationNitActions.customerInformation(dataExcelModels.getVendedorPostpago()
                , dataExcelModels.getCedulaClienteNinNit());
        controlActivationNitActions.activationInformation(dataExcelModels.getMsisdnNintendoNit(),dataExcelModels.getMsiNintendoNit(),"740");
        controlActivationNitActions.demographicInformation();
    }

    @Then("^Se deberia ver en pantalla unica la linea activa nintendo con nit$")
    public void seDeberiaVerEnPantallaUnicaLaLineaActivaNintendoConNit() {
        controlActivationNitActions.waitUntilExecuteChange(60000);
        controlActivationNitActions.consultSingleScreen(dataExcelModels.getMsisdnNintendoNit());
        //legalizacion del pedido
        pagoEquiposActions.rutaInicial();
        pagoEquiposActions.pagarEquipo(dataExcelModels.getCedulaClienteNinNit(),dataExcelModels.getMsisdnNintendoNit());

    }
    //--------------<Escenario dieciseis>---------------------

    @When("^Se hace la cesion de contrato de una linea nit a nit$")
    public void seHaceLaCesionDeContratoDeUnaLineaNitANit() throws JSchException, InterruptedException, AWTException {
        cesionNit.initialRute();
        cesionNit.executeContractAssignment(dataExcelModels.getMsisdnNintendoNit(),dataExcelModels.getClientNit(),"1210");
    }

    @Then("^Se deberia ver en pantalla unica la linea cedida con nit$")
    public void seDeberiaVerEnPantallaUnicaLaLineaCedidaConNit() {
        prepaidActivationActions.consultSingleScreen2(dataExcelModels.getMsisdnNintendoNit());
    }

}



