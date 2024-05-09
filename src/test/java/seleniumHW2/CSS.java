package seleniumHW2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/cssSelector.php");

        // find the username text box
        WebElement inputBox = driver.findElement(By.cssSelector("input[id='profileID']"));
        inputBox.sendKeys("hello");

        //        find the profile box
        WebElement profileBox = driver.findElement(By.cssSelector("input#profileBox"));
        profileBox.sendKeys("abracadabra");
//        feedback1
        WebElement feedbackBox1 = driver.findElement(By.cssSelector("input.form-control.feedbackBox1"));
        feedbackBox1.sendKeys("the website is too slow jenny");

        //        feedback2
        WebElement feedbackBox2 = driver.findElement(By.cssSelector("input.form-control.feedbackBox2"));
        feedbackBox2.sendKeys("the website is too slow ");

        //email
        WebElement email = driver.findElement(By.cssSelector("input[name='email']"));
        email.sendKeys("draft@gmail.com");
//        coursetopic
        WebElement courseTopic = driver.findElement(By.cssSelector("input[name*='contentInput']"));
        courseTopic.sendKeys("selenium");

        //               introtoADVANCEDCSS
        WebElement intro = driver.findElement(By.cssSelector("input[name^='IntroInput']"));
        intro.sendKeys("easy");

        // ends-with
        WebElement conclusion = driver.findElement(By.cssSelector("input[name$='Input']"));
        conclusion.sendKeys("welldone");
}
}
