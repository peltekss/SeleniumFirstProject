import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_BrowserCommands {
/*
→Create main method
→Create chrome driver
→Open google home page:https://www.google.com
→Get Title on page
→Get Current URLon page
→Close/Quit the browser
*/
    public static void main(String[] args) {
//→Create chrome driver
        WebDriver driver = new ChromeDriver();

        //→Open google home page:https://www.google.com
        driver.get("https://www.google.com");

        //→Get Title on page
        String title = driver.getTitle();
        System.out.println("title = " + title);

        //→Get Current URLon page
        String url = driver.getCurrentUrl();
        System.out.println("url = " + url);

        //→Close/Quit the browser
        driver.close();
        driver.quit();



    }
}
