package seleniumHW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/input-form-locator.php");

        //Thread.sleep(2000);

        WebElement firstName=driver.findElement(By.name("first_name"));
        firstName.sendKeys("Will");

        WebElement lastName=driver.findElement(By.name("last_name"));
        lastName.sendKeys("Smith");

        WebElement email=driver.findElement(By.name("email"));
        email.sendKeys("will.smith@gmail.com");

        Thread.sleep(2000);

        WebElement submit =driver.findElement(By.id("submit_button"));
        submit.click();

        Thread.sleep(2000);

        WebElement clickHere =driver.findElement(By.linkText("Click Here."));
        clickHere.click();

        Thread.sleep(2000);

        WebElement link =driver.findElement(By.linkText("Link"));
        link.click();
    }
    }

