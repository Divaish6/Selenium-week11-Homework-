package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowserTest {

    static String browser = "Firefox";
    static String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        // 1. Setup browser
        if (browser.equalsIgnoreCase("Chrome"))
        {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox"))
        {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge"))
        {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong Browser name");
        }
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

        //6. Enter the email to email field
        //Find the Email Field element
        WebElement emailField = driver.findElement(By.name("Email"));

        //Type the email address to the email field element
        emailField.sendKeys("Divaish@gmail.com");

        //7. Enter the password to password field
        //Find the Password Field Element
        WebElement passwordField = driver.findElement(By.id("Password"));

        //Type the Password to the password field element
        passwordField.sendKeys("123Divyedh@");

        //hold screen 2sec
        Thread.sleep(2000);

        //8.Close The Browser
        driver.close();
    }
}
