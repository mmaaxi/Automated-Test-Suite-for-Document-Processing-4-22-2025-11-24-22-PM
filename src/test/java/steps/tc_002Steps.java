import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class tc_002Steps {
    WebDriver driver;
    tc_002Page page;

    public tc_002Steps() {
        driver = Hooks.getDriver();
        page = new tc_002Page(driver);
    }

    @Given("El usuario está en la página de carga de archivos")
    public void el_usuario_esta_en_la_página_de_carga_de_archivos() {
        driver.get("https://example.com/upload");
    }

    @When("El usuario selecciona un archivo PDF/DOCX menor a 50 MB")
    public void el_usuario_selecciona_un_archivo_pdf_docx_menor_a_50_mb() {
        page.uploadFile("path/to/validFile.pdf");
    }

    @Then("El archivo se carga correctamente")
    public void el_archivo_se_carga_correctamente() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        assertTrue(page.isFileUploaded());
    }

    @Then("Se muestra la vista previa con nombre, tamaño y tipo del archivo")
    public void se_muestra_la_vista_previa_con_nombre_tamaño_y_tipo_del_archivo() {
        assertTrue(page.isFilePreviewDisplayed());
    }
}