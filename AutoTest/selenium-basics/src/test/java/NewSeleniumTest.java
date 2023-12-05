import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NewSeleniumTest {
    @Test
    void test() {
        WebDriver driver = new ChromeDriver();

        driver.get(("https://opencart.abstracta.us/"));
        driver.findElement(By.name("search")).sendKeys("MaxBook");
        driver.findElement(By.className("btn-default")).click();
        boolean Display = driver.findElement(By.id("button-search")).isDisplayed();
        System.out.println("Element enabled is :" + Display);

        System.out.println("Fields numbers: " + driver.findElements(By.name("search")).size());
        driver.findElement(By.name("search")).clear();
        driver.findElement(By.name("search")).sendKeys("Macbook");
        driver.findElement(By.className("btn-default")).click();
        Select sortBySelect = new Select(driver.findElement(By.id("input-sort")));
        sortBySelect.selectByVisibleText("Price (High > Low)");
        System.out.println("Selected option: "
                + new Select(driver.findElement(By.id("input-sort"))).getFirstSelectedOption().getText());



        driver.quit();
    }
}
