package demo;

import org.example.actions.Screenshot;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.URL;

public class SeleniumTest {
    @Test
    public void takeScreenshotOfGooglePageTest() throws IOException {
        var url = new URL("http://localhost:4444/wd/hub");
        var chromeOptions = new ChromeOptions();
//        chromeOptions.addArguments("--headless");
        var driver = new RemoteWebDriver(url, chromeOptions);
        driver.get("https://www.facebook.com");
        Screenshot.takeScreenshot(driver);
//        driver.quit();
    }
}
