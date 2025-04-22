package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_001Page {
    private WebDriver driver;
    private By cargarDocumentosOpcion = By.id("cargarDocumentos");
    private By cargaUnaArchivoOpcion = By.id("cargaUnaArchivo");
    private By cargarDocumentosSeparadoOpcion = By.id("cargarDocumentosSeparado");
    private By recuadroUnico = By.id("recuadroUnico");
    private By recuadrosMultiples = By.className("recuadroMultiple");

    public tc_001Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navegarPaginaCargaDocumentos() {
        driver.get("https://www.ejemplo.com/cargaDocumentos");
    }

    public void seleccionarOpcionCargarDocumentos() {
        driver.findElement(cargarDocumentosOpcion).click();
    }

    public boolean opcionesCargaDisponibles() {
        return driver.findElement(cargaUnaArchivoOpcion).isDisplayed() &&
               driver.findElement(cargarDocumentosSeparadoOpcion).isDisplayed();
    }

    public void elegirCargaUnaArchivo() {
        driver.findElement(cargaUnaArchivoOpcion).click();
    }

    public boolean recuadroUnicoHabilitado() {
        return driver.findElement(recuadroUnico).isDisplayed();
    }

    public void elegirCargarDocumentosSeparado() {
        driver.findElement(cargarDocumentosSeparadoOpcion).click();
    }

    public boolean recuadrosMultiplesMostrados() {
        return driver.findElements(recuadrosMultiples).size() > 1;
    }
}