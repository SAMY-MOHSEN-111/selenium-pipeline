//package demo;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.By;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.remote.RemoteWebDriver;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//import java.net.MalformedURLException;
//import java.net.URL;
//
//public class SeleniumPipelineTest {
//
//    @Test
//    public void openSeleniumAndNavigateToGoogle() throws MalformedURLException {
//        var url = new URL("http://localhost:4444/wd/hub");
//        var chromeOptions = new ChromeOptions();
////        chromeOptions.addArguments("--headless");
//
//        var driver = new RemoteWebDriver(url, chromeOptions);
//
//        driver.get("https://google.com");
//        var element = driver.findElement(By.id("APjFqb"));
//        Assert.assertTrue(element.isDisplayed());
//        System.out.println("worked");
//        System.out.println(driver.getTitle());
////        driver.quit();
//    }
//}

/*
  docker network create grid
        docker run -d -p 4442-4444:4442-4444 --net grid --name selenium-hub selenium/hub:4.18.1-20240224
        docker run -d --net grid -e SE_EVENT_BUS_HOST=selenium-hub \
          --shm-size="2g" \
          -e SE_EVENT_BUS_PUBLISH_PORT=4442 \
          -e SE_EVENT_BUS_SUBSCRIBE_PORT=4443 \
          selenium/node-chrome:4.18.1-20240224
        docker run -d --net grid -e SE_EVENT_BUS_HOST=selenium-hub \
          --shm-size="2g" \
          -e SE_EVENT_BUS_PUBLISH_PORT=4442 \
          -e SE_EVENT_BUS_SUBSCRIBE_PORT=4443 \
          selenium/node-edge:4.18.1-20240224
        docker run -d --net grid -e SE_EVENT_BUS_HOST=selenium-hub \
          --shm-size="2g" \
          -e SE_EVENT_BUS_PUBLISH_PORT=4442 \
          -e SE_EVENT_BUS_SUBSCRIBE_PORT=4443 \
          selenium/node-firefox:4.18.1-20240224
*/