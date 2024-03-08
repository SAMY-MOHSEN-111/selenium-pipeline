package demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class SeleniumPipelineTest {

    @Test
    public void openSeleniumAndNavigateToGoogle() throws MalformedURLException {
        var url = new URL("http://localhost:4444/wd/hub");
        var chromeOptions = new ChromeOptions();
//        chromeOptions.addArguments("--headless");

        var driver = new RemoteWebDriver(url, chromeOptions);

        driver.get("https://google.com");
        var element = driver.findElement(By.id("APjFqb"));
        Assert.assertTrue(element.isDisplayed());
        System.out.println("worked");
        System.out.println(driver.getTitle());
//        driver.quit();
    }
}
