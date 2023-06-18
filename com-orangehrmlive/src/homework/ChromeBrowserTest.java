package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {

    public static void main(String[] args) throws InterruptedException {

        String baseUrl = "https://opensource-demo.orangehrmlive.com/";

        //1. Setup Chrome browser
        WebDriver driver = new ChromeDriver();

        //2. Open URL
        driver.get(baseUrl);

        //Maximise browser
        driver.manage().window().maximize();

        //We give Implicit wait to Driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //3. Print the title of the page
        System.out.println("Page Title is : " + driver.getTitle());

        //4. Print the current url
        System.out.println("Current URL is : " + driver.getCurrentUrl());

        //5. Print the page source
        System.out.print("Page source is : " + driver.getPageSource());

        //6. Enter the username to username field
        //Find the Username Field Element
        WebElement usernameField = driver.findElement(By.name("username"));

        //Type the username to the username field element
        usernameField.sendKeys("Divaish");

        //7. Enter the password to password field
        //Find the Password Field Element
        WebElement passwordField = driver.findElement(By.name("password"));

        //Type the password to the password field element
        passwordField.sendKeys("123Divyedh@");

        Thread.sleep(2000);

        //Close The Browser
        driver.close();

    }
}
