package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethodlari {

    public static void main(String[] args) {
        System.setProperty("webdriver.crome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        // Amazon sayfasına gidiniz
        driver.get("https://amazon.com");

        // Kaynak kodların icinde "Gateway" kelimesinin oldugunu test ediniz
        System.out.println(driver.getPageSource());
        String istenenKelime="Gateway";
        if (driver.getPageSource().contains(istenenKelime)){
            System.out.println("PageSourse testi PASSED");
        }else System.out.println("PageSourse testi FAILED");

        // driver.close(); // sayfayı calıtırdıktan sonra kapatır
    }
}
