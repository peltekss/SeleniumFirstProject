import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Task02 {
    /*
     Open google home page https://www.google.com/
     Wait for 3 seconds
     Go to the https://www.youtube.com/
     Get the title and URL of the page
     Check if the title contains the word "YouTube" print console "Title contains YouTube" or "Title does not contain YouTube"
     Check if the URL contains the word "youtube" print console "URL contains youtube" or "URL does not contain youtube"

     Then go to https://www.instagram.com/
     Get the title and check if it contains the word "Instagram" and print "Title contains Instagram" or "Title does not contain Instagram"
     Navigate Back to the previous webpage
     Refresh the page
     Navigate to forward
     Wait for 3 seconds
     Close the browser
*/
    public static void main(String[] args) throws InterruptedException {
//        Open google home page https://www.google.com/
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

//        Wait for 3 seconds
        Thread.sleep(3000);

//        Go to the https://www.youtube.com/
        driver.get("https://www.youtube.com/");

//        Get the title and URL of the page
        String title = driver.getTitle();
        System.out.println("YouTube = " + title);
        String url = driver.getCurrentUrl();
        System.out.println("url = " + url);

//        Check if the title contains the word "YouTube" print console "Title contains YouTube" or "Title does not contain YouTube"
        if (title.contains("YouTube")) {
            System.out.println("Title contains YouTube");
        } else {
            System.out.println("Title does not contain YouTube");
        }

//        Check if the URL contains the word "youtube" print console "URL contains youtube" or "URL does not contain youtube"
        if (url.contains("youtube")) {
            System.out.println("URL contains youtube");
        } else {
            System.out.println("URL does not contain youtube");
        }

//        Then go to https://www.instagram.com/
        driver.get("https://www.instagram.com/");

//        Get the title and check if it contains the word "Instagram" and print "Title contains Instagram" or "Title does not contain Instagram"
        title = driver.getTitle();
        if (title.contains("Instagram")) {
            System.out.println("Title contains Instagram");
        } else {
            System.out.println("Title does not contain Instagram");
        }

//        Navigate Back to the previous webpage
        driver.navigate().back();

//        Refresh the page
        driver.navigate().refresh();

//        Navigate to forward
        driver.navigate().forward();

//        Wait for 3 seconds
        Thread.sleep(3000);

//        Get the title and check if it contains the word "Instagram" and print "Title contains Instagram" or "Title does not contain Instagram"
        title = driver.getTitle();
        if (title.contains("Instagram")) {
            System.out.println("Title contains Instagram");
        } else {
            System.out.println("Title does not contain Instagram");
        }

//        Navigate Back to the previous webpage
        driver.navigate().back();

//        Refresh the page
        driver.navigate().refresh();

//        Navigate to forward
        driver.navigate().forward();

//        Wait for 3 seconds
        Thread.sleep(3000);

//        Close the browser
        driver.quit();

    }
}
