import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_002Page {
    WebDriver driver;

    By uploadInput = By.id("file-upload");
    By uploadButton = By.id("upload-button");
    By filePreview = By.id("file-preview");

    public tc_002Page(WebDriver driver) {
        this.driver = driver;
    }

    public void uploadFile(String filePath) {
        WebElement uploadElement = driver.findElement(uploadInput);
        uploadElement.sendKeys(filePath);
        driver.findElement(uploadButton).click();
    }

    public boolean isFileUploaded() {
        // Logic to verify file upload
        return driver.findElement(filePreview).isDisplayed();
    }

    public boolean isFilePreviewDisplayed() {
        // Logic to verify file preview details are displayed
        WebElement preview = driver.findElement(filePreview);
        return preview.isDisplayed() && preview.getText().contains("validFile.pdf");
    }
}