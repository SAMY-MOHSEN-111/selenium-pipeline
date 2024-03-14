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
        var screenshotsFolder = System.getenv("SCREENSHOTS_PATH");

        var camera = (TakesScreenshot) driver;
        File screenshot = camera.getScreenshotAs(OutputType.FILE);
        var uuid = UUID.randomUUID();
        System.out.println("Screenshots folder: " + screenshotsFolder);
//        Files.move(screenshot.toPath(), new File("src/main/resources/screenshots/" + uuid + ".jpg").toPath());
//        var screenshotPath = screenshotsFolder + "/" + uuid + ".jpg";
        var screenshotPath = "/home/vsts/work/1/a/" + uuid + ".jpg";
        System.out.println("Screenshot path: " + screenshotPath);
        Files.move(screenshot.toPath(), new File(screenshotPath).toPath());
    }
}
