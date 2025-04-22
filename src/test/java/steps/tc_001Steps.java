package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.tc_001Page;

public class tc_001Steps {
    WebDriver driver;
    tc_001Page page;

    @Given("El usuario está en la página de carga de documentos")
    public void usuarioEnPaginaCargaDocumentos() {
        page = new tc_001Page(driver);
        page.navegarPaginaCargaDocumentos();
    }

    @When("El usuario selecciona la opción 'cargar documentos'")
    public void usuarioSeleccionaOpcionCargarDocumentos() {
        page.seleccionarOpcionCargarDocumentos();
    }

    @Then("El sistema muestra opciones de 'carga única' y 'carga múltiple'")
    public void sistemaMuestraOpcionesCarga() {
        Assert.assertTrue(page.opcionesCargaDisponibles());
    }

    @When("El usuario elige 'carga en un solo archivo'")
    public void usuarioEligeCargaUnaArchivo() {
        page.elegirCargaUnaArchivo();
    }

    @Then("Se habilita un único recuadro para subir el archivo")
    public void habilitarUnicoRecuadro() {
        Assert.assertTrue(page.recuadroUnicoHabilitado());
    }

    @When("El usuario elige 'cargar documentos por separado'")
    public void usuarioEligeCargarDocumentosSeparado() {
        page.elegirCargarDocumentosSeparado();
    }

    @Then("Se muestran múltiples recuadros correspondientes a cada documento requerido")
    public void mostrarMultiplesRecuadros() {
        Assert.assertTrue(page.recuadrosMultiplesMostrados());
    }
}