package functionaltesting;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class FlightSearchTest {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.get("http://goibibo.com");
    }

    @Test
    public void testFlightSearch() {
        HomePage homePage = new HomePage(driver);
        homePage.enterSource("New York");
        homePage.enterDestination("London");
        homePage.selectDate("2025-03-10");
        homePage.selectPassengers(2);
        homePage.clickSearchButton();
        
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
