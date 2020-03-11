package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification {

    public static void main(String[] args) {

        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/",
                "http://practice.cybertekschool.com/dropdown",
                "http://practice.cybertekschool.com/login");

        WebDriver driver = BrowserFactory.getDriver("chrome");

        String prefix = "http://practice.cybertekschool.com";

        driver.navigate().to(urls.get(0));
        String title1 = driver.getTitle();
        System.out.println(title1);

        TimeUtility.wait(2);



        driver.navigate().to(urls.get(1));
        String title2 = driver.getTitle();
        System.out.println(title2);

        TimeUtility.wait(2);

        driver.navigate().to(urls.get(2));
        String title3 = driver.getTitle();
        System.out.println(title3);

        if (title1.equals(title2) && title2.equals(title3)) {
            System.out.println("All the websites have the same title " + title1);
        } else {
            System.out.println("All the websites don't have the same title");
        }

        if (urls.get(0).startsWith(prefix) && urls.get(1).startsWith(prefix) && urls.get(2).startsWith(prefix)) {

            System.out.println("All URLs of all pages start with " + prefix);
        } else {
            System.out.println("All URLs of all pages don't start with " + prefix);
        }

        TimeUtility.wait(2);









        driver.quit();


    }
}
