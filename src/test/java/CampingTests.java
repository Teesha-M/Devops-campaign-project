import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CampingTests {

    @Test
    public void testHomePageLoads() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://localhost:3000");
        Assert.assertTrue(driver.getTitle() != null);

        driver.quit();
    }

    @Test
    public void testStartPlanningButton() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://localhost:3000");
        driver.findElement(By.tagName("button")).click();

        Assert.assertTrue(driver.getPageSource().contains("State"));

        driver.quit();
    }

    @Test
    public void testChecklistPage() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://localhost:3000/checklist");

        Assert.assertTrue(driver.getPageSource().contains("Checklist"));

        driver.quit();
    }

    @Test
    public void testNavigationWorks() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://localhost:3000");

        String url = driver.getCurrentUrl();
        Assert.assertTrue(url.contains("localhost"));

        driver.quit();
    }
}