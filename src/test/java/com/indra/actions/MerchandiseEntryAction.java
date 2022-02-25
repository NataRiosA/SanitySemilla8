package com.indra.actions;

import com.indra.pages.MerchandiseEntryPage;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.DefaultUrl;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MerchandiseEntryAction extends MerchandiseEntryPage {
    public MerchandiseEntryAction(WebDriver driver) {
        super(driver);
    }

    public void loadMerchandise(){
        Actions actions = new Actions(getDriver());
        WebElement we = getDriver().findElement(By.id("formMenu:j_id20_span"));
        actions.moveToElement(we).build().perform();
        WebElement a = getDriver().findElement(By.xpath("//div[@id='formMenu:j_id27']"));
        actions.moveToElement(a).build().perform();
        getMassMerchandiseEntry().click();
    }

    public void merchandiseEntry() throws InterruptedException {
        getChannel().click();
        Select channelDropDown = new Select(getDriver().findElement(By.id("form1:idCanal")));
        channelDropDown.selectByValue("4");
        //getStoreChannel().click();
        getReason().click();
        //Thread.sleep(2000);
        Select reasonDropDown = new Select(getDriver().findElement(By.id("form1:idMotivo")));
        reasonDropDown.selectByValue("266");
        //getReasonMerchandiseEntry().click();
        getPointSale().click();
        Select pointSaleDropDown = new Select(getDriver().findElement(By.id("form1:idPdv")));
        pointSaleDropDown.selectByVisibleText(getPuntoDeVenta().getText());//selectByValue("865");
        //getPointSaleStore().click();
        //compare();
        getSelectReason().click();
        Thread.sleep(1000);
    }

    public void merchandiseEntryInventory() throws InterruptedException {
        getBulkUploadItems().waitUntilClickable();
        Thread.sleep(1000);
        getBulkUploadItems().click();
        Actions actions = new Actions(getDriver());
        WebElement we = getDriver().findElement(By.xpath("//input[contains(@id,'formload:uploadFile:file')]"));
        we.sendKeys("C:\\SanitySemilla4\\src\\test\\resources\\config_data\\Mercanncia.csv");
        //actions.moveToElement(we).build().perform();
        getUploadFile2().click();
        //compareM();
        Thread.sleep(2000);
        getUpload().click();
        getResultLoad().waitUntilPresent();

        MatcherAssert.assertThat("la carga de mercancia fue exitosa",
                getResultLoad().getText(),Matchers.containsString("Carga Masiva Efectuada Exitosamente"));
    }
}
