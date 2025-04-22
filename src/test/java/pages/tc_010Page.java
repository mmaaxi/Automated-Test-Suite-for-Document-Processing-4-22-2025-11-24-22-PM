package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_010Page {
    WebDriver driver;

    // Locators
    By loginButton = By.id("loginButton");
    By uploadButton = By.id("uploadButton");
    By processButton = By.id("processButton");
    By slipGeneratedMessage = By.id("slipGeneratedMessage");
    By originalDocumentsStoredMessage = By.id("originalDocumentsStoredMessage");
    By extractedDataStoredMessage = By.id("extractedDataStoredMessage");

    public tc_010Page(WebDriver driver) {
        this.driver = driver;
    }

    public void loginToSystem() {
        // Add logic to login
        driver.findElement(loginButton).click();
    }

    public void uploadAndProcessDocuments() {
        // Add logic to upload and process documents
        driver.findElement(uploadButton).click();
        driver.findElement(processButton).click();
    }

    public boolean isSlipGenerated() {
        // Validate slip generation
        return driver.findElement(slipGeneratedMessage).isDisplayed();
    }

    public boolean areOriginalDocumentsStored() {
        // Validate storage of original documents
        return driver.findElement(originalDocumentsStoredMessage).isDisplayed();
    }

    public boolean areExtractedDataStored() {
        // Validate storage of extracted data
        return driver.findElement(extractedDataStoredMessage).isDisplayed();
    }
}