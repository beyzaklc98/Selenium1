package practic2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class practic1 {

    public static void main(String[] args) throws InterruptedException {

         /*
        1.Yeni bir class olusturalim (Homework)
        2.ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) "facebook"
          oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
        3.Sayfa URL'inin "facebook" kelimesi icerdigini dogrulayin, icermiyorsa "actual" URL'i yazdirin.
        4.https://www.walmart.com/ sayfasina gidin.
        5. Sayfa basliginin "Walmart.com" icerdigini dogrulayin.
        6. Tekrar "facebook" sayfasina donun
        7. Sayfayi yenileyin
        8. Sayfayi tam sayfa (maximize) yapin
        9.Browser'i kapatin
        */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        //  2.ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) "facebook"
        //    oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
        driver.get("https://www.facebook.com");
        String actualTitle = driver.getTitle();
        String title = "facebook";
        if (actualTitle.equals(title)) {
            System.out.println("Actual title PASSED");
        }else System.out.println("Actual Title "+driver.getTitle());

        //  3.Sayfa URL'inin "facebook" kelimesi icerdigini dogrulayin, icermiyorsa "actual" URL'i yazdirin.
        String actualUrl = driver.getCurrentUrl();
        String url = "facebook";
        if(actualUrl.contains(url)) {
            System.out.println("PASSED");
        }else System.out.println("Actual URL "+driver.getCurrentUrl());

        //  4.https://www.walmart.com/ sayfasina gidin.
        driver.navigate().to("https://www.walmart.com/");

        //  5. Sayfa basliginin "Walmart.com" icerdigini dogrulayin.
        String actualTitle2 = driver.getTitle();
        String title2 = "Walmart.com";
        if(actualTitle2.contains(title2)) {
            System.out.println("PASSED");
        }else System.out.println("Actual Title "+driver.getTitle());

        //  6. Tekrar "facebook" sayfasina donun
        driver.navigate().back();
        Thread.sleep(2000);

        //  7. Sayfayi yenileyin
        driver.navigate().refresh();

        //  8. Sayfayi tam sayfa (maximize) yapin
        driver.manage().window().minimize();

        //  9.Browser'i kapatin
        driver.quit();
    }
}
