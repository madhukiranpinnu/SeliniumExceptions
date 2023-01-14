package SeliniumExceptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementClickInterCeptedExceptionDemo {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://omayo.blogspot.com/");
        driver.findElement(By.id("blogsmenu")).click();
        driver.findElement(By.linkText("http://www.Selenium143.blogspot.com")).click();
    }
}
