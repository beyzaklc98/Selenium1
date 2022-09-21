package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class C05_findelements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // Amazon sayfasına gidiniz
        driver.get("https://www.amazon.com");
        // Amazon sayfasındaki tag'ları input olanların sayısını yazdırınız
        List<WebElement> tag = driver.findElements(By.tagName("input"));
        System.out.println("input tag'inin sayisi = "+tag.size());

        System.out.println(driver.findElement(By.xpath("(//*[@class='a-color-base headline truncate-2line'])[1]")).getText());
    }
}