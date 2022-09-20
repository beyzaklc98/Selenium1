package practice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice3 {

    public static void main(String[] args) {

       System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.manage().window().fullscreen();

        // Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://amazon.com/");

        // Sayfa basligini(title) yazdirin
        System.out.println(driver.getTitle());

        // Sayfa basliginin "Amazon" icerdigini test edin
        String actualTitle = driver.getTitle();
        String istenenTitle = "amazon";
        if(actualTitle.contains(istenenTitle)){
            System.out.println("Title testi PASSED");
        }else System.out.println("Title testi FAILED");

        // Sayfa adresini(url) yazdirin
        System.out.println(driver.getCurrentUrl());

        // Sayfa url'inin "amazon" icerdigini test edin.
        String actualUrl= driver.getCurrentUrl();
        String istenenUrl = "amazon";
        if(actualUrl.contains(istenenUrl)){
            System.out.println("Url testi PASSED");
        }else System.out.println("URL testi FAILED");

        // Sayfa handle degerini yazdirin
        System.out.println(driver.getWindowHandle());

        // Sayfa HTML kodlarinda "Gateway" kelimesi gectigini test edin
        String htmlKod = driver.getPageSource();
        String istenenHtmlKod = "Gateway";
        if(htmlKod.contains(istenenHtmlKod)){
            System.out.println("Html test PASSED");
        }else System.out.println("Html test FAILED");

        // Sayfayi kapatin.
        driver.close();
    }
}
