package org.example.actions;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BrowserConfiguration {
    public static Object getBrowser(String browser) {
        switch (browser) {
            case "chrome":
                return new ChromeOptions();
            case "firefox":
                return new FirefoxOptions();
            case "edge":
                return new EdgeOptions();
        }
        return new ChromeOptions();
    }
}
