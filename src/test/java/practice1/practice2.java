package practice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice2 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // driver.navigate().to() methodu
        driver.navigate().to("https://amazon.com/");
        driver.navigate().to("https://trendyol.com/");

        // Tekrar amazon sayfasına dönelim
        Thread.sleep(4000);
        driver.navigate().back();

        // Tekrar techproed sayfasına gidelim
        Thread.sleep(4000);
        driver.navigate().forward();

        // Techproed sayfasını yenileyelim
        Thread.sleep(4000);
        driver.navigate().refresh();

        // Son olarak sayfayı kapatınız
        driver.close();
    }
}
