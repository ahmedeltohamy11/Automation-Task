import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2Scenario1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1");
        driver.manage().window().maximize();
        do {
            driver.findElement(By.xpath("//*[@id=\"routeSlider\"]/div/a[2]/span[1]")).click();
        }
        while(!driver.findElement(By.xpath("//*[@id=\"routeSlider\"]/div/div[2]/div/div/ul/li[1]/a")).isDisplayed());

        driver.findElement(By.xpath("//*[@id=\"routeSlider\"]/div/div[2]/div/div/ul/li[1]/a")).click();
        System.out.println("found element");
            driver.findElement(By.xpath("//*[@id=\"routeSlider\"]/div/div[2]/div/div/ul/li[1]/a")).click();
            System.out.println("clicked on route");

        driver.findElement(By.id("txtJourneyDate")).click();
        System.out.println("clicked on calendar");
        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[5]/a")).click();
        System.out.println("selected date");
        do {
            driver.findElement(By.id("corover-close-btn")).click();
        }
        while(driver.findElement(By.id("corover-cb-widget")).isDisplayed());

        driver.findElement(By.xpath("//*[@id=\"bookingsForm\"]/div[1]/div/div[2]/div[3]/button")).click();
        do {
            driver.findElement(By.id("corover-close-btn")).click();
        }
        while(driver.findElement(By.id("corover-cb-widget")).isDisplayed());
        driver.findElement(By.xpath("//*[@id=\"SrvcSelectBtnForward0\"]")).click();
        driver.findElement(By.id("Forward2")).click();
        driver.findElement(By.id("Forwardboarding-tab")).click();
        driver.findElement(By.id("Forward-1467469338690")).click();
        driver.findElement(By.id("Forwarddroping-tab")).click();
        driver.findElement(By.id("Forward-1467467616730")).click();
        driver.findElement(By.id("Forwardprofile-tab")).click();
        driver.findElement(By.id("mobileNo")).click();
        driver.findElement(By.id("mobileNo")).sendKeys("6789125987");
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).sendKeys("test@test.com");
        driver.findElement(By.id("passengerNameForward0")).click();
        driver.findElement(By.id("passengerNameForward0")).sendKeys("hamo");
        driver.findElement(By.id("genderCodeIdForward0")).click();
        driver.findElement(By.xpath("//*[@id=\"genderCodeIdForward0\"]/option[2]")).click();
        driver.findElement(By.id("passengerAgeForward0")).click();
        driver.findElement(By.id("passengerAgeForward0")).sendKeys("22");
        driver.findElement(By.id("concessionIdsForward0")).click();
        driver.findElement(By.xpath("//*[@id=\"concessionIdsForward0\"]/option[2]")).click();
        driver.findElement(By.id("termsChk")).click();
        driver.findElement(By.id("PgBtn")).click();

    }
}
