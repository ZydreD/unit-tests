import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

import static org.openqa.selenium.By.*;

public class WaitTest {
    WebDriver driver;

    @BeforeEach
    public void setDriver() {
        driver = new ChromeDriver();
        driver.get("https://testpages.herokuapp.com/styled/progress-bars-sync.html");
    }

    @AfterEach
    public void tearDown(){
        driver.quit();

    }

    @Test
    @DisplayName("Task 1")
    void testTask1() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions
                .attributeContains(driver
                                .findElement(cssSelector("#progressbar0")),
                        "value",
                        "100"));
    }

    @Test
    @DisplayName("Task 2")
    void testTask2() {

        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.attributeToBe(driver
                        .findElement(cssSelector("#progressbar1")), "value", "100"));
    }

    @Test
    @DisplayName("Task 3")
    void testTask3() {

        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(5));
        new WebDriverWait(driver, Duration.ofSeconds(5));
        wait3.until(d -> driver.findElement(By.cssSelector("#progressbar2"))
                .getAttribute("value").equals("100"));
    }

    @Test
    @DisplayName("Task Stoppped")
    void testTaskStopped() {
        driver = new ChromeDriver();
        driver.get("https://testpages.herokuapp.com/styled/progress-bars-sync.html");

        Wait<WebDriver> waitStopped = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofMillis(300))
                .ignoring(Exception.class);
        waitStopped.until(d -> driver.findElement(By.xpath("//p[contains(.,'Stopped')]")).isDisplayed());
    }

}

