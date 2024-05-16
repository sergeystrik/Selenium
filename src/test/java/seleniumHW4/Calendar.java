package seleniumHW4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class Calendar {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("Hum@nhrm123");
        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
        driver.findElement(By.id("menu_leave_viewLeaveModule")).click();

        WebElement month= driver.findElement(By.xpath("//input[@id='calFromDate']"));
        month.click();
        Select selectMonthFrom = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
        selectMonthFrom.selectByValue("4");
        Select selectYearFrom = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
        selectYearFrom.selectByValue("1979");
        List<WebElement> daysFrom = driver.findElements(By.xpath("//a[@class='ui-state-default']"));
        for (WebElement dayFrom : daysFrom) {
            if (dayFrom.getText().equals("1")) {
                dayFrom.click();
                break;
            }


        }

    }

    }

