package homework1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework4 {

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
        WebDriver driver=new ChromeDriver();
        //Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın
        //(verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        driver.get("https://www.youtube.com");
        String actualTitle= driver.getTitle();
        String pageTitle="youtube";
        if(actualTitle.equals(pageTitle)){
            System.out.println("Title testing PASSED");
        } else System.out.println("Actual Title:" + driver.getTitle());

        //Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa doğru
        //URL'yi yazdırın.
        String actualUrl= driver.getCurrentUrl();
        String url="youtube";
        String result=actualUrl.contains(url)? "PASSED" : driver.getCurrentUrl();
        System.out.println("Actual URL: " + result);

        // Daha sonra Amazon sayfasina gidin https://www.amazon.com/
        driver.navigate().to("https://www.amazon.com");
        Thread.sleep(3000);

        //Youtube sayfasina geri donun
        //6. Sayfayi yenileyin
        //7. Amazon sayfasina donun
        //Sayfayi tamsayfa yapin
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.manage().window().fullscreen();
        Thread.sleep(3000);

        // Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın, Yoksa
        //doğru başlığı(Actual Title) yazdırın.
        String amazonTitle= driver.getTitle();
        String anaTitle="Amazon";
        String result1=amazonTitle.contains(anaTitle)? "PASSED" : driver.getTitle();
        System.out.println("Actual Title: " + result1);

        //Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru
        //URL'yi yazdırın
        //11.Sayfayi kapatin
        String actualUrl2=driver.getCurrentUrl();
        String pageUrl="https://www.amazon.com/";
        if (actualUrl2.contains(pageUrl)){
            System.out.println("Passed");
        } else System.out.println(driver.getCurrentUrl());
        driver.close();
    }
}