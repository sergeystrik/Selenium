package class10;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jsExecutor {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://syntaxprojects.com/simple_context_menu.php");

        WebElement hoverBtn = driver.findElement(By.xpath("//button[text()='Hover me!']"));

        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0]. setAttribute('style', 'background: blue; border: 2px solid yellow;');",hoverBtn); WebElement rightClickBtn = driver.findElement(By.xpath("//button[@id='show_context_menu']"));
        String jsScript = "var evt = document.createEvent('MouseEvents');"
                + "evt.initMouseEvent('contextmenu', true, true, window, 1, 0, 0, 0, 0, false, false, false, false, 2, null);"
                + "arguments[0].dispatchEvent(evt);";
        js.executeScript(jsScript,rightClickBtn);

        js.executeScript("window.scrollBy(0,10000");
        js.executeScript("window.scrollBy(0,-10000");

    }
}
