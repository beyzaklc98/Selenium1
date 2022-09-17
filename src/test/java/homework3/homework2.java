package homework3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class homework2 {

    public static void main(String[] args) throws InterruptedException {

        /*
       1-C01_TekrarTesti isimli bir class olusturun
       2 https://www.amazon.com/ adresine gidin
       3 Browseri tam sayfa yapin
       4 Sayfayi "refresh" yapin
       5 Sayfa basliginin "Spend less" ifadesi icerdigini test edin
       6 Gift Cards sekmesine basin
       7 Birthday butonuna basin
       8 Best Seller bolumunden ilk urunu tiklayin
       9 Gift card details'den 25 $'i secin
      10 Urun ucretinin 25$ oldugunu test edin
      11 Sayfayi kapatin
       */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // 2 https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/");

        // 3 Browseri tam sayfa yapin
        driver.manage().window().maximize();

        // 4 Sayfayi "refresh" yapin
        driver.navigate().refresh();

        // 5 Sayfa basliginin "Spend less" ifadesi icerdigini test edin *
        String actualTitle = driver.getTitle();
        String expectedTitle = "Spend less";
        if(actualTitle != expectedTitle) {
            System.out.println("Title test PASSED");
        }else System.out.println("Title testi FAILED");

        // 6 Gift Cards sekmesine basin
        WebElement giftCard= driver.findElement(By.xpath("(//*[text()='Gift Cards'])[1]"));
        giftCard.click();
        Thread.sleep(1000);

        // 7 Birthday butonuna basin
        WebElement birthday= driver.findElement(By.xpath("//*[@alt='Birthday gift cards']"));
        birthday.click();
        Thread.sleep(1000);

        // 8 Best Seller bolumunden ilk urunu tiklayin
        WebElement bestSeller = driver.findElement(By.xpath("(//*[@alt='Amazon.com eGift Card'])[1]"));
        bestSeller.click();
        Thread.sleep(1000);

        // 9 Gift card details'den 25 $'i secin
        WebElement giftCardDetail = driver.findElement(By.xpath("(//*[@id='gc-mini-picker-amount-1'])[1]"));
        giftCardDetail.click();
        Thread.sleep(1000);

        // 10 Urun ucretinin 25$ oldugunu test edin *
        if(giftCardDetail.getText().contains("25$")){
            System.out.println("Gift Card Detail Testi PASSED");
        }else System.out.println("Gift Card Detail Testi FAILED");

        // 11 Sayfayi kapatin
        driver.close();

    }
}
