package class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploadingAFile {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://syntaxprojects.com/upload-image.php");
        WebElement imageUpload = driver.findElement(By.xpath("//input[@id='image-file']"));
        imageUpload.sendKeys("C:\\Users\\ssiry\\OneDrive\\Pictures\\Screenshots\\Screenshot 2024-02-18 085542.jpg");


    }
}
