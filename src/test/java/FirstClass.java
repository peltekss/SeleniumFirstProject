import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {
    public static void main(String[] args) {
        //Set property
        System.setProperty("webdriver.chrome.driver","resources/driver/chromedriver.exe");//Bu işlem Selenium 4.6 sonrası gerekmez.

        //Driver objesi oluştur
        WebDriver driver = new ChromeDriver();

        //Driver methodlarını kulllan.
        driver.get("https://www.amazon.com");// get() methodu ile yeni bir sayfa yükleriz

        //Close browser
        driver.close(); // close() methodu ile son açılan pencere kapatılır.
        driver.quit(); // quit() methodu ile oturumda açılan tüm pencereler kapatılır.
    }
}
