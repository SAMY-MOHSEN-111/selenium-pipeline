package demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumPipelineTest {

    @Test
    public void openSeleniumAndNavigateToGoogle(){
        var chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless");

        WebDriverManager.chromedriver().setup();
        var driver =  new ChromeDriver(chromeOptions);
        driver.get("https://google.com");
        var element = driver.findElement(By.id("APjFqb"));
        Assert.assertTrue(element.isDisplayed());
        System.out.println("worked");
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
