package SeliniumExceptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExceptionDemo {
    public static void main(String[] args) {
            WebDriverManager.chromedriver().setup();
            WebDriver driver=new ChromeDriver();
            driver.get("http://omayo.blogspot.com/");
            WebElement element=driver.findElement(By.xpath("//div/textarea[@id=\"ta1\"]"));
        JavascriptExecutor javascriptExecutor=(JavascriptExecutor) driver;
        javascriptExecutor.executeScript("Arguments[0].value='madhu';",element);
        }
    }

