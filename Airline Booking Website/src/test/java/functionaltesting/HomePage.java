package functionaltesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    
    By sourceInput = By.id("source");
    By destinationInput = By.id("destination");
    By dateInput = By.id("date");
    By passengersInput = By.id("passengers");
    By searchButton = By.id("searchButton");

    
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

   
    public void enterSource(String source) {
        driver.findElement(sourceInput).sendKeys(source);
    }

    public void enterDestination(String destination) {
        driver.findElement(destinationInput).sendKeys(destination);
    }

    public void selectDate(String date) {
        driver.findElement(dateInput).sendKeys(date);
    }

    public void selectPassengers(int passengers) {
        driver.findElement(passengersInput).sendKeys(String.valueOf(passengers));
    }

    public void clickSearchButton() {
        driver.findElement(searchButton).click();
    }
}