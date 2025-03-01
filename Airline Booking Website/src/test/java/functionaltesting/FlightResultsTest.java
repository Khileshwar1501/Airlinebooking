package functionaltesting;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import dev.failsafe.internal.util.Assert;

public class FlightResultsTest {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.get("http://goibibo.com");
    }

    @Test
    public void testFlightSelection() {
        HomePage homePage = new HomePage(driver);
        homePage.enterSource("New York");
        homePage.enterDestination("London");
        homePage.selectDate("2025-03-10");
        homePage.selectPassengers(2);
        homePage.clickSearchButton();

        FlightResultsPage resultsPage = new FlightResultsPage(driver);
        resultsPage.selectFlight();
        @SuppressWarnings("unused")
		String flightDetails = resultsPage.getFlightDetails();
        
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}

