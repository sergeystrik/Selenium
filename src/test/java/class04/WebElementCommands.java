package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://syntaxprojects.com/selenium_commands_selector.php");
        WebElement textBox=driver.findElement(By.xpath("//input[@id='textInput']"));
        textBox.clear();
        textBox.sendKeys("abracadabra");

        // check if the radio button is enabled
        //if yes click on it
        // confirm if it is selected
        WebElement rb1 = driver.findElement(By.xpath("//input[@value='option1']"));
        boolean selectionState = rb1.isSelected();
        if(!selectionState){
            rb1.click();
        }
//        confirmation
        System.out.println("the radio button is selected "+ rb1.isSelected());


        WebElement rb2 = driver.findElement(By.xpath("//input[@value='option2']"));


        System.out.println(rb2.isEnabled());

        WebElement rb3 = driver.findElement(By.xpath("//input[@value='option3']"));

        System.out.println("the status of display tof radio button3 is "+rb3.isDisplayed());


        //get text from web element
        WebElement text=driver.findElement(By.xpath("//div[@id='textElement']"));

        System.out.println(text.getText());


        //        get the attribute value
        WebElement attribute = driver.findElement(By.xpath("//div[@id='attributeElement']"));
        System.out.println(attribute.getAttribute("data-custom-attribute"));



    }
}
