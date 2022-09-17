package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_ManageMethodlari {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com");

        //Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("Pencere konumu = "+driver.manage().window().getPosition()); // Açılan browser'ın konumu verir
        System.out.println("Pencere olculeri = "+driver.manage().window().getSize()); // Açılan browser'ın olcülerini verir

        //Sayfayi simge durumuna getirin
        driver.manage().window().minimize(); // Pencereyi simge durumuna getirir

        //simge durumunda 3 saniye bekleyip sayfayi maximize yapin
        Thread.sleep(3000);
        driver.manage().window().maximize();

        //Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
        System.out.println("Yeni Pencere konumu = "+driver.manage().window().getPosition());
        System.out.println("Yeni Pencere olculeri = "+driver.manage().window().getSize());

        //Sayfayi fullscreen yapin
        Thread.sleep(3000);
        driver.manage().window().fullscreen();

        //Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
        System.out.println("Fullscreen Pencere konumu = "+driver.manage().window().getPosition());
        System.out.println("Fullscreen Pencere olculeri = "+driver.manage().window().getSize());

        //Sayfayi kapatin
        Thread.sleep(3000);
        driver.close();
    }
}
