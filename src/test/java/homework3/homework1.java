package homework3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class homework1 {

    public static void main(String[] args) throws InterruptedException {

        /*
        1-https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        2- Add Element butonuna 10 kez basinız
        3- 10 kez Add element butonuna basıldığını test ediniz
        4 - Delete butonuna görünmeyene kadar basınız
        5- Delete butonunun görünmediğini test ediniz
        6- Sayfayı kapatınız
        */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // 1-https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        // 2- Add Element butonuna 10 kez basinız
        int sayac=0;
        for (int i = 0; i <10 ; i++) {
            WebElement addButon= driver.findElement(By.xpath("//*[@onclick='addElement()']"));
            addButon.click();
            sayac++;
            Thread.sleep(1000);
        }

        // 3- 10 kez Add element butonuna basıldığını test ediniz
        List<WebElement> addElements= driver.findElements(By.xpath("(//*[text()='Delete'])[1]"));
        if(addElements.size()==10){
            System.out.println("Add elementine 10 kez basıldı");
        }else System.out.println("Add testi FAILED");

        // 4 - Delete butonuna görünmeyene kadar basınız
        for (int i = 0; i <10 ; i++) {
            WebElement deleteButton = driver.findElement(By.xpath("(//*[@class='added-manually'])[1]"));
            deleteButton.click();
            sayac--;
            Thread.sleep(1000);
        }
        // 5- Delete butonunun görünmediğini test ediniz
        if(sayac==0){
            System.out.println("Delete testi PASSED");
        }else System.out.println("Delete testi FAILED");

        // 6- Sayfayı kapatınız
        driver.close();

    }
}
