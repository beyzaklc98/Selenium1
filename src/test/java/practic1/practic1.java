package practic1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practic1 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //1- Amazon sayfasına gidiniz
        driver.get("https://www.amazon.com");

        //2- Başlığın "Amazon" içerdiğini test ediniz
        String actualTitle=driver.getTitle();
        String istenenKelime = "amazon";
        if(actualTitle.contains(istenenKelime)){
            System.out.println("Title test PASSED");
        }else System.out.println("Title test FAILED");

        //3- Url'nin amazon icerdigini test ediniz
        String actualUrl =driver.getCurrentUrl();
        String arananKelime = "amazon";
        if(actualUrl.contains(arananKelime)){
            System.out.println("Url test PASSED");
        }else System.out.println("Url test FAILED");

        //4- Sayfayı kapatınız
        driver.close();
    }
}
