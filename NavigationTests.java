package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import com.cbt.utilities.TimeUtility;
import org.openqa.selenium.WebDriver;

import java.util.Scanner;

public class NavigationTests {

    public static void main(String[] args) {

        System.out.println("Enter browser name:");

        Scanner scanner = new Scanner(System.in);
        String browserName = scanner.next();
        scanner.close();


        WebDriver driver = BrowserFactory.getDriver(browserName);

        System.out.println("===================================================================");

        System.out.println("TEST CASE");
        System.out.println("Step 1: Open browser");
        System.out.println(browserName + " opened");
        TimeUtility.wait(2);

        System.out.println("======================================================================");

        System.out.println("Step 2: Go to website https://google.com");
        driver.get("https://google.com");
        System.out.println("Google website opened");
        TimeUtility.wait(2);

        System.out.println("======================================================================");

        System.out.println("Step 3: Save the title in a string variable");
        String googleTitle = driver.getTitle();
        System.out.println("Website Title is " + googleTitle);
        TimeUtility.wait(2);

        System.out.println("======================================================================");

        System.out.println("Step 4: Go to website https://etsy.com");
        driver.navigate().to("https://etsy.com");
        System.out.println("Etsy website opened");
        TimeUtility.wait(2);

        System.out.println("======================================================================");

        System.out.println("Step 5: Save the title in a string variable");
        String etsyTitle = driver.getTitle();
        System.out.println("Website Title is " + etsyTitle);
        TimeUtility.wait(2);

        System.out.println("======================================================================");

        System.out.println("Step 6: Navigate back to previous page");
        driver.navigate().back();
        System.out.println("Navigated back");
        TimeUtility.wait(2);

        System.out.println("======================================================================");

        System.out.println("Step 7: Verify that title is same is in Step 3");
        StringUtility.verifyEquals(googleTitle, driver.getTitle());
        TimeUtility.wait(2);

        System.out.println("======================================================================");

        System.out.println("Step 8: Navigate forward to previous page");
        driver.navigate().forward();
        System.out.println("Navigated forward");
        TimeUtility.wait(2);

        System.out.println("======================================================================");

        System.out.println("Step 9: Verify that title is same is in Step 5");
        StringUtility.verifyEquals(etsyTitle, driver.getTitle());
        TimeUtility.wait(2);

        System.out.println("======================================================================");



        driver.quit();




    }
}
