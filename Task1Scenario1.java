import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Task1Scenario1 {
public static void main(String[] args) throws InterruptedException {
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();

    driver.get("https://www.amazon.eg/?&tag=egtxabkgode-21&ref=pd_sl_7p2aq4fe2v_e&adgrpid=152488092398&hvpone=&hvptwo=&hvadid=666798652278&hvpos=&hvnetw=g&hvrand=10106565369676045750&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1005390&hvtargid=kwd-10573980&hydadcr=334_2589534&language=en_AE");
    driver.manage().window().setSize(new Dimension(1024, 768));
    System.out.println("page opened successfully");

    driver.findElement(By.id("twotabsearchtextbox")).click();
    System.out.println("search clicked");

    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("car accessories");

    driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
    System.out.println("searching...");

    driver.findElement(By.xpath("//div[img[@data-image-index=\"1\"]]")).click();
    System.out.println("1st element clicked");
    

    driver.findElement(By.xpath("//span[@id=\"submit.add-to-cart\"]")).click();
    System.out.println("added to cart");

    driver.findElement(By.xpath("//span[@id=\"nav-cart-count\"]")).click();
    System.out.println("clicked on cart");

    assert driver.findElement(By.xpath(" //img[@src=\"https://m.media-amazon.com/images/I/81y21NVvEDL._AC_AA180_.jpg\" and @class=\"sc-product-image\"]")).isDisplayed();
    System.out.println("item added successfully");

    driver.close();
}
}