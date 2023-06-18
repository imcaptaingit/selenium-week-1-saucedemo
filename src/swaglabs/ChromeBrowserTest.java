package swaglabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTest {

    public static void main(String[] args) {

        //Setup Chrome Browser
        WebDriver driver = new ChromeDriver();

        //Open URL
        driver.get("https://www.saucedemo.com/");

        //Print the title of the page
        System.out.println("Title of the page is :" + driver.getTitle());

        //Print the Current URL
        System.out.println("Current URL is : " + driver.getCurrentUrl());

        //Print the page Source
        System.out.println("The page source is : " + driver.getPageSource());

        //Enter email in the email field
        WebElement email = driver.findElement(By.name("user-name"));
        email.sendKeys("Iamsarvat@googly.com");

        //Enter Password in the password field
        WebElement pass = driver.findElement(By.name("password"));
        pass.sendKeys("iamboss");

        //Close the browser
        driver.close();


    }


}
