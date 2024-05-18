package class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionClass {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
//
        driver.manage().window().maximize();
         driver.get("https://syntaxprojects.com/simple_context_menu.php");
        //  find the hover button
        WebElement hoverBtn = driver.findElement(By.xpath("//button[text()='Hover me!']"));

        Actions action=new Actions(driver);
        action.moveToElement(hoverBtn).perform();

        Thread.sleep(2000);

        // locate right click

        WebElement rightClick=driver.findElement(By.xpath("//button[text()='Right Click!']"));

        action.contextClick(rightClick).perform();

        //draggable

        WebElement dragable = driver.findElement(By.id("draggable"));
        //        drop location
        WebElement dropLoc = driver.findElement(By.id("droppable"));

        action.clickAndHold(dragable).moveToElement(dropLoc).release().build().perform();

        //
       // action.dragAndDrop(dragable,dropLoc).perform();

    }
}
