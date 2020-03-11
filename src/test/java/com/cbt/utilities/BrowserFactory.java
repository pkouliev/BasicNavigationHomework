package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserFactory {


    public static WebDriver getDriver(String browserName) {


        switch (browserName) {
            case "chrome":
                WebDriverManager.chromedriver().version("79.0").setup();
                return new ChromeDriver();

                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    return new FirefoxDriver();

                    case "safari":
                        return new SafariDriver();

                        case "edge":
                            return null;

                            default:
                                throw new WebDriverException("No browser specified");
        }
    }
}

