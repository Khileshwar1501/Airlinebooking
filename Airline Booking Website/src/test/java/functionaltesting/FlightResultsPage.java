package functionaltesting;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FlightResultsPage {
    WebDriver driver;
    By flightSelectButton = By.xpath("//button[contains(text(), 'Select Flight')]");
    By flightDetails = By.xpath("//div[@class='flight-details']");

    public FlightResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectFlight() {
        driver.findElement(flightSelectButton).click();
    }

    public String getFlightDetails() {
        return driver.findElement(flightDetails).getText();
    }
}
