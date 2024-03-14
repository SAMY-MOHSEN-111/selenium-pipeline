package org.example.actions;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.UUID;

public class Screenshot {
    public static void takeScreenshot(WebDriver driver) throws IOException {
        var camera = (TakesScreenshot) driver;
        File screenshot = camera.getScreenshotAs(OutputType.FILE);
        var uuid = UUID.randomUUID();
        var screenshotsFolder = System.getenv("SCREENSHOTSPATH");
//        Files.move(screenshot.toPath(), new File("src/main/resources/screenshots/" + uuid + ".jpg").toPath());
        var screenshotPath = screenshotsFolder + "/" + uuid + ".jpg";
        System.out.println(screenshotPath);
        Files.move(screenshot.toPath(), new File(screenshotPath).toPath());
    }
}
