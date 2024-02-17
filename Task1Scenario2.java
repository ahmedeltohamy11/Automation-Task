import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Task1Scenario2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.eg/?&tag=egtxabkgode-21&ref=pd_sl_7p2aq4fe2v_e&adgrpid=152488092398&hvpone=&hvptwo=&hvadid=666798652278&hvpos=&hvnetw=g&hvrand=10106565369676045750&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1005390&hvtargid=kwd-10573980&hydadcr=334_2589534&language=en_AE");

        driver.manage().window().setSize(new Dimension(1024, 768));
        System.out.println("page opened successfully");

        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[1]")).click();
        System.out.println("Today's Deals opened successfully");

        driver.findElement(By.xpath("//*[@id=\"grid-main-container\"]/div[2]/span[6]/ul/li[2]/div/a")).click();
        System.out.println("10% Off or more opened successfully");

        driver.findElement(By.xpath("//*[@id=\"grid-main-container\"]/div[2]/span[3]/ul/li[9]/label/input")).click();
        System.out.println("Electronics selected successfully");

        driver.findElement(By.xpath("//*[@id=\"grid-main-container\"]/div[3]/div/div[8]/div/div/a/div/div/img")).click();
        System.out.println("item type selected successfully");

        driver.findElement(By.xpath("//*[@id=\"octopus-dlp-asin-stream\"]/ul/li[1]/span/div/div[1]/a/img")).click();
        System.out.println("item selected successfully");

        driver.findElement(By.id("addToCart_feature_div")).click();
        System.out.println("item added to cart successfully");

        driver.close();
    }
}