package com.indra.actions;

import com.indra.pages.InventoryAllocationPage;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class InventoryAllocationActions extends InventoryAllocationPage {

    public InventoryAllocationActions(WebDriver driver) {
        super(driver);
    }

    public void loadInventory() throws InterruptedException {

        Actions actions = new Actions(getDriver());

        WebElement inventory = getDriver().findElement(By.id("formMenu:j_id19_span"));
        actions.moveToElement(inventory).build().perform();
        WebElement inventoryAllocation = getDriver().findElement(By.id("formMenu:j_id21"));
        actions.moveToElement(inventoryAllocation).build().perform();
        getSubInventoryAllocation().click();
        getDriver().navigate().refresh();

        //atcherAssert.assertThat("esta en el cargue de inventario",getInventoryTitle().getText(),
        //        Matchers.("Asignación de Mercancía Vendedor"));
        seller();
        Thread.sleep(2000);
        selectInventoryType();
        click_addProducts();
        selectArt();
        bulkLoad();
    }

    public void seller() throws InterruptedException {
        enter(getUsuario().getText().substring(2)).into(getVendedor());
        Thread.sleep(1000);
        getVendedor().sendKeys(Keys.ENTER);
    }

    public void selectInventoryType(){

        getTipoProducto().waitUntilClickable();
        getTipoProducto().click();
        Select dropDown = new Select(getDriver().findElement(By.xpath("//select[@id='form1:tipoProd']")));
        dropDown.selectByValue("19");
    }

    public void click_addProducts(){
        getBtnAgregarProductos().click();
    }

    public void selectArt() throws InterruptedException {
        getInputArticule().waitUntilEnabled();
        enter("3003324").into(getInputArticule());
        Thread.sleep(500);
        getInputArticule().sendKeys(Keys.ARROW_DOWN);
        getInputArticule().sendKeys(Keys.ENTER);
        getBtnSeleccionar().waitUntilClickable();
        getBtnSeleccionar().click();
    }

    public void bulkLoad() throws InterruptedException {
        getTableCargaMasiva().waitUntilPresent();

        MatcherAssert.assertThat("esta presente la carga masiva",
                getTableCargaMasiva().isPresent(), Matchers.is(true));
        getBtnCargaMasiva().click();
        Thread.sleep(1000);
        WebElement btnCargarArchivo = getDriver().findElement(By.id("formUpload:upload:file"));
        btnCargarArchivo.sendKeys("C:\\SanitySemilla4\\src\\test\\resources\\config_data\\Inventario.csv");
        Thread.sleep(2000);
        getBtnAccept().click();
        getBtnAcceptInventory().click();
        MatcherAssert.assertThat("Se presenta el message de cargue de inventario"
                ,getMessageAllocationInventory().isPresent(),Matchers.is(true));
    }

    public void leaveSesion(){
            Actions actions = new Actions(getDriver());
            WebElement leave = getDriver().findElement(By.id("menu:formMenu:j_id32_span"));
            actions.moveToElement(leave).build().perform();
            getBtnLeave().click();
    }

}