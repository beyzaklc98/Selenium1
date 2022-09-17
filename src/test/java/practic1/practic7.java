package practic1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class practic7 {

    public static void main(String[] args) throws InterruptedException {
        
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        Thread.sleep(5000);
        driver.get("https://techproeducation.com/");
        driver.close();



    }
}
