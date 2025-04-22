package steps;

import org.openqa.selenium.WebDriver;
import pages.tc_010Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.assertTrue;

public class tc_010Steps {
    WebDriver driver;
    tc_010Page page;

    @Given("el usuario ha iniciado sesión en el sistema")
    public void el_usuario_ha_iniciado_sesión_en_el_sistema() {
        page = new tc_010Page(driver);
        page.loginToSystem();
    }

    @When("el usuario completa la carga y procesamiento de documentos")
    public void el_usuario_completa_la_carga_y_procesamiento_de_documentos() {
        page.uploadAndProcessDocuments();
    }

    @Then("el sistema genera el 'Slip de salida'")
    public void el_sistema_genera_el_slip_de_salida() {
        assertTrue(page.isSlipGenerated());
    }

    @Then("guarda los documentos originales en el historial de la solicitud")
    public void guarda_los_documentos_originales_en_el_historial_de_la_solicitud() {
        assertTrue(page.areOriginalDocumentsStored());
    }

    @Then("guarda los datos extraídos en el historial de la solicitud")
    public void guarda_los_datos_extraidos_en_el_historial_de_la_solicitud() {
        assertTrue(page.areExtractedDataStored());
    }
}