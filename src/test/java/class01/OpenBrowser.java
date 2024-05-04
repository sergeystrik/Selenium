package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
       // driver.get("https://syntaxprojects.com/");

        driver.get("https://www.facebook.com/");

       driver.manage().window().maximize();
        //driver.manage().window().fullscreen();
        String title=driver.getTitle();
        System.out.println("the title of the webpage is"+title);

        Thread.sleep(4000);
        driver.quit();


    }
}
