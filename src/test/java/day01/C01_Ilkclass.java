package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_Ilkclass {

    public static void main(String[] args) {

        /*
        En temel haliyle bir otomasyon yapmak için
        Class'ımıza otomasyon için gerekli olan webdriver'in yerini göstermemiz gerekir
        Bunun için java kutuphanesinde System.setProperty() method'unu kullanırız
        Ve method'un içine ilk olarak driver :  webdriver.chrome.driver
        İkinci olarak onun fiziki yolunu kopyalarız
        */


        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // Buraya kadar manuel olarak bir sayfa actık
        // WebDriver interface oldugu icin ondan obje olusturamıyoruz

        // Burada sonra gidecegimiz yolu yazarız
        // String olarak gidecegimiz yolu getirmesini soyluyoruz
        // variable ismi driver oldugu icin driver uzerinden gidilen yolu yazdık
        driver.get("https://www.Amazon.com");

        System.out.println("Actual Title: " + driver.getTitle()); // Gidilen sitenin baslıgını yazdırır (String olarak)
                                                                  // İcindeki sayfanın baslıgını yazdırır

        System.out.println("Actual Url:  = " + driver.getCurrentUrl()); // Gidilen sayfanın Url'ini getirir
        System.out.println(driver.getPageSource());
    }
}
