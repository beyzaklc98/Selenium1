package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class C05_findelements {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com");

        // Amazon sayfasindaki tag'lari link(a) olanlarin sayisini yazdiriniz *
        List<WebElement> tag = driver.findElements(By.tagName("a"));
        System.out.println("A tag'inin sayisi : " + tag.size());

        // Amazon sayfasindaki tag'lari input olanlarin sayisini yazdiriniz
        List<WebElement> tag2 = driver.findElements(By.tagName("input"));
        System.out.println("input tag'inin sayisi : " + tag2.size());
        System.out.println(driver.findElement(By.xpath("(//*[@class='a-color-base headline truncate-2line'])[1]")).getText());
    }
}
