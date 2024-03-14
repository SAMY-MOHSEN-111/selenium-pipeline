package demo;

import org.example.actions.BrowserConfiguration;
import org.example.actions.Screenshot;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Test3 {
    private RemoteWebDriver driver;
    @BeforeClass
    @Parameters({"browser"})
    public void setup(String browser) throws MalformedURLException {
        var url = new URL("http://localhost:4444/wd/hub");
        var options = BrowserConfiguration.getBrowser(browser);
        driver = new RemoteWebDriver(url, (Capabilities) options);
    }

    @Test
    public void takeScreenshotOfFacebookPageTest() throws IOException {
        driver.get("https://www.facebook.com");
        Screenshot.takeScreenshot(driver);
        driver.close();
    }

    @Test
    public void takeScreenshotOfGoogle() throws IOException {
        driver.get("https://www.google.com");
        Screenshot.takeScreenshot(driver);
        driver.close();
    }

    @Test
    public void takeScreenshotOfWiki() throws IOException {
        driver.get("https://www.wikipedia.org");
        Screenshot.takeScreenshot(driver);
        driver.close();
    }

    @Test
    public void takeScreenshotOfX() throws IOException {
        driver.get("https://www.x.org");
        Screenshot.takeScreenshot(driver);
        driver.close();
    }
}

