package homework2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class homework3 {

    public static void main(String[] args) throws InterruptedException {

        /*
1.  Tarayıcıyı başlatın
2. 'http://automationexercise.com' url'sine gidin
3.  Ana sayfanın başarılı bir şekilde görünür olduğunu doğrulayın(Ana sayfanın başarıyla görüldüğünü doğrulayın)
4. 'Kayıt Ol / Giriş Yap' düğmesine tıklayın
5. 'Yeni Kullanıcı Kaydı'nı doğrulayın! görünür
6.  Adı ve e-posta adresini girin
7. 'Kaydol' düğmesini tıklayın
8. 'HESAP BİLGİLERİNİ GİRİN' ifadesinin görünür olduğunu doğrulayın
9.  Doldurma ayrıntıları: Unvan, Ad, E-posta, Şifre, Doğum tarihi
10.'Bültenimize kaydolun!' onay kutusunu seçin.
11.'Ortaklarımızdan özel teklifler alın!' onay kutusunu seçin.
12. Doldurma ayrıntıları: Ad, Soyadı, Şirket, Adres, Adres2, Ülke, Eyalet, Şehir, Posta Kodu, Cep Numarası
13.'Hesap Oluştur düğmesini' tıklayın
14.'HESAP OLUŞTURULDU!' görünür
15.'Devam' düğmesini tıklayın
16.'Kullanıcı adı olarak oturum açıldı' ifadesinin görünür olduğunu doğrulayın
17.'Hesabı Sil' düğmesini tıklayın
18.'HESAP SİLİNDİ!' görünür ve 'Devam' düğmesini tıklayın
 */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //'http://automationexercise.com' url'sine git
        driver.get("http://automationexercise.com");

        //Ana sayfanın başarılı bir şekilde görünür olduğunu doğrulayın
        WebElement home = driver.findElement(By.xpath("//*[text()=' Home']"));
        System.out.println("Anasayfa displeyed test "+home.isDisplayed());

        //'Kayıt Ol / Giriş Yap' düğmesine tıklayın
        WebElement signUpLogin = driver.findElement(By.xpath("//*[text()=' Signup / Login']"));
        signUpLogin.click();
        Thread.sleep(2000);

        //'Yeni Kullanıcı Kaydı'nı gorunur oldugunu doğrulayın!
        WebElement newUserSignUp=driver.findElement(By.xpath("//*[text()='New User Signup!']"));
        System.out.println("new user sing up displayed test "+newUserSignUp.isDisplayed());

        // Adı ve e-posta adresini girin
        WebElement name = driver.findElement(By.xpath("//*[@type='text']"));
        name.sendKeys("beyza");
        Thread.sleep(2000);

        WebElement eposta= driver.findElement(By.xpath("//*[@data-qa='signup-email']"));
        eposta.sendKeys("beyzaklc@gmail.com");
        Thread.sleep(2000);

        //'Kaydol' düğmesini tıklayın
        WebElement signUp =driver.findElement(By.xpath("//*[text()='Signup']"));
        signUp.click();
        Thread.sleep(2000);

        //'HESAP BİLGİLERİNİ GİRİN' ifadesinin görünür olduğunu doğrulayın
        WebElement enterAccountInformation = driver.findElement(By.xpath("//*[text()='Enter Account Information']"));
        System.out.println("Enter Account Information displayed test "+enterAccountInformation.isDisplayed());

        // Doldurma ayrıntıları: Unvan, Ad, E-posta, Şifre, Doğum tarihi
        WebElement title = driver.findElement(By.xpath("//*[text()='Title']"));
        Thread.sleep(2000);

        // password
        WebElement password = driver.findElement(By.xpath("//*[@id='password']"));
        password.sendKeys("12345678");
        Thread.sleep(2000);

        // day
        WebElement day = driver.findElement(By.xpath("//*[@id='days']"));
        day.sendKeys("2");
        Thread.sleep(2000);

        // month
        WebElement month =driver.findElement(By.xpath("//*[@id='months']"));
        month.sendKeys("December");
        Thread.sleep(2000);

        // year
        WebElement year = driver.findElement(By.xpath("//*[@id='years']"));
        year.sendKeys("2022");
        Thread.sleep(2000);

        //'Bültenimize kaydolun!' onay kutusunu seçin.
        //driver.findElement(By.linkText("Sign up for our newsletter!")).click();
        //Thread.sleep(2000);

        //'Ortaklarımızdan özel teklifler alın!' onay kutusunu seçin.
        //driver.findElement(By.linkText("Receive special offers from our partners!")).click();
        //Thread.sleep(2000);

        // Doldurma ayrıntıları: Ad, Soyadı, Şirket, Adres, Adres2, Ülke, Eyalet, Şehir, Posta Kodu, Cep Numarası

        // First name
        driver.findElement(By.xpath("//*[@name='first_name']")).sendKeys("Beyza");
        Thread.sleep(2000);

        // Last name
        driver.findElement(By.xpath("//*[@id='last_name']")).sendKeys("Kılıç");
        Thread.sleep(2000);

        // Company
        driver.findElement(By.xpath("//*[@id='company']")).sendKeys("x");
        Thread.sleep(2000);

        // Address(Street address, P.O. Box, Company name, etc.)
        driver.findElement(By.xpath("//*[@id='address1']")).sendKeys("Techproeducation company");
        Thread.sleep(2000);

        // Country
        driver.findElement(By.xpath("//*[@id='country']")).sendKeys("Canada");

        // State
        driver.findElement(By.xpath("//*[@id='state']")).sendKeys("TC");

        // City
        driver.findElement(By.xpath("//*[@id='city']")).sendKeys("EDMONTON");

        // Zipcode
        driver.findElement(By.xpath("//*[@id='zipcode']")).sendKeys("C0A");

        // Mobile Number
        driver.findElement(By.xpath("//*[@id='mobile_number']")).sendKeys("+1-780");

        //'Hesap Oluştur düğmesini' tıklayın    //*[text()='Create Account']
        driver.findElement(By.xpath("(//*[text()='Create Account']")).click();


        //'HESAP OLUŞTURULDU!' görünür    //*[text()='Account Created!']
        WebElement created = driver.findElement(By.xpath("//*[text()='Account Created!']"));
        System.out.println("Hesap Olusturuldu TEST -> " + created.isDisplayed());

        //'Devam' düğmesini tıklayın  //*[text()='Continue']
        driver.findElement(By.xpath("//*[text()='Continue']")).click();

        //'Kullanıcı adı olarak oturum açıldı' ifadesinin görünür olduğunu doğrulayın
        String expectedLoggedIn =driver.findElement(By.linkText(" Logged in as ")).getText();
        System.out.println(expectedLoggedIn);
        WebElement expextedLog = driver.findElement(By.xpath("//*[text()=' Logged in as ']"));
        System.out.println(" Kullanici adi ile giris yapildi -> " + expextedLog.isDisplayed());

        // 'Hesabı Sil' düğmesini tıklayın
        //driver.findElement(By.xpath("(//*[@style='color:brown;'])[2]")).click();

        // 'HESAP SİLİNDİ!' görünür ve 'Devam' düğmesini tıklayın














    }
}
