package demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumPipelineTest {

    @Test
    public void openSeleniumAndNavigateToGoogle(){
        WebDriverManager.chromedriver().setup();
        var driver =  new ChromeDriver();
        driver.get("https://google.com");
        var element = driver.findElement(By.id("APjFqb"));
        Assert.assertTrue(element.isDisplayed());
        driver.close();
    }
}
