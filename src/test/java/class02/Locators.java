package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/");

       WebElement email= driver.findElement(By.id("email"));

       email.sendKeys("drewyt@yahoo.com");

       WebElement password=driver.findElement(By.name("pass"));

       password.sendKeys("1223456789");
       WebElement button=driver.findElement(By.name("login"));
      // button.click();
        WebElement createAccount= driver.findElement(By.linkText("Create new account"));
        createAccount.click();

    }
}
