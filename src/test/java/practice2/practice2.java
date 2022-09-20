package practice2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class practice2 {

    public static void main(String[] args) throws InterruptedException {

        /*
       Yeni bir class olusturun (TekrarTesti)
       2. Youtube web sayfasına gidin ve sayfa başlığının "youtube" olup olmadığını doğrulayın
          (verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
       3. Sayfa URL'sinin "youtube" içerip içermediğini (contains) doğrulayın, içermiyorsa doğru URL'yi yazdırın.
       4. Daha sonra Amazon sayfasina gidin https://www.amazon.com/
       5. Youtube sayfasina geri donun
       6. Sayfayi yenileyin
       7. Amazon sayfasina donun
       8. Sayfayi tamsayfa yapin
       9. Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın, Yoksa doğru başlığı(Actual Title) yazdırın.
      10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru URL'yi yazdırın
      11.Sayfayi kapatin
      */

      System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // 2. Youtube web sayfasına gidin ve sayfa başlığının "youtube" olup olmadığını doğrulayın
        //    (verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        driver.get("https://www.youtube.com");
        String actualTitle= driver.getTitle();
        String expectedTitle = "youtube";
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title testing PASSED");
        }else System.out.println("Actual Title "+driver.getTitle());

        // 3. Sayfa URL'sinin "youtube" içerip içermediğini (contains) doğrulayın, içermiyorsa doğru URL'yi yazdırın.
        String actualUrl = driver.getCurrentUrl();
        String url= "youtube";
        if(actualUrl.contains(url)) {
            System.out.println("PASSED");
        }else System.out.println("Actual URL "+driver.getCurrentUrl());

        // 4. Daha sonra Amazon sayfasina gidin https://www.amazon.com/
        driver.navigate().to("https://www.amazon.com");
        Thread.sleep(2000);

        // 5. Youtube sayfasina geri donun
        driver.navigate().back();
        Thread.sleep(2000);

        // 6. Sayfayi yenileyin
        driver.navigate().refresh();
        Thread.sleep(2000);

        // 7. Amazon sayfasina donun
        driver.navigate().forward();
        Thread.sleep(2000);

        // 8. Sayfayi tamsayfa yapin
        driver.manage().window().maximize();
        Thread.sleep(2000);

        // 9. Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın, Yoksa doğru başlığı(Actual Title) yazdırın.
        String amazonTitle = driver.getTitle();
        String anaTitle = "Amazon";
        if(amazonTitle.contains(anaTitle)){
            System.out.println("PASSED");
        }else System.out.println("Actual Title "+driver.getTitle());

        // 10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru URL'yi yazdırın
        String sayfaUrl = driver.getCurrentUrl();
        String beklenenUrl = "https://www.amazon.com/";
        String result = sayfaUrl.equals(beklenenUrl) ? "PASSED" : driver.getCurrentUrl();
        System.out.println(result);

        // 11.Sayfayi kapatin
        driver.quit();


    }
}
