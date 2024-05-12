package class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImpicitWait {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        //        implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


        driver.get("https://syntaxprojects.com/synchronization-waits.php");
        //click the button and get the text
        WebElement button1=driver.findElement(By.xpath("//button[@id='show_text_synchronize']"));
        button1.click();
        WebElement textElement1=driver.findElement(By.xpath("//p[text()='Hello, this message appeared after you clicked the button']"));

        System.out.println(textElement1.getText());

        WebElement button2= driver.findElement(By.xpath("//*[@id='show_text_synchronize_02']"));
        button2.click();
        // click me and select male or female

        WebElement maleBt = driver.findElement(By.xpath("//input[@value='Male']"));
        maleBt.click();
    }
}