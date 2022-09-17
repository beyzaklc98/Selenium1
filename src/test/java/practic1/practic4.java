package practic1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practic4 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Youtube ana sayfasina gidelim . https://www.youtube.com/
        Thread.sleep(2000);
        driver.navigate().to("https://www.youtube.com/");

        // Amazon soyfasina gidelim. https://www.amazon.com/
        Thread.sleep(2000);
        driver.get("https://www.amazon.com/");

        // Tekrar YouTube'sayfasina donelim
        Thread.sleep(2000);
        driver.navigate().back();

        // Yeniden Amazon sayfasina gidelim
        Thread.sleep(2000);
        driver.navigate().forward();

        // Sayfayi Refresh(yenile) yapalim
        Thread.sleep(2000);
        driver.navigate().refresh();

        // Sayfayi kapatalim / Tum sayfalari kapatalim
        driver.quit();


    }
}
