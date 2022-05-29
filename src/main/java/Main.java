

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raven\\Desktop\\QA\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.kupujemprodajem.com/");
        WebElement button =  driver.findElement(By.xpath("//div[@class='kpBoxCloseButton']"));
        button.click();
        driver.findElement(By.xpath("//input[@id='searchKeywordsInput']")).sendKeys("iphone 13" + "\n");

        Thread.sleep(15000);
        driver.findElement(By.className("adName")).click();

        Thread.sleep(10000);
        String manualTesting =  "iPhone 13, iPhone 12, iPhone 11 - NOVO!";
        WebElement automaticTesting =  driver.findElement(By.className("oglas-title"));

        if(manualTesting.equals(automaticTesting)){
            System.out.println("Test je prosao");
        }else{
            System.out.println("Test nije prosao");
        }

    }
}
