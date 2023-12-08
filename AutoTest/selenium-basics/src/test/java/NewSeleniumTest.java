import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static org.assertj.core.api.FactoryBasedNavigableListAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class NewSeleniumTest {
    @Test
    @DisplayName("Search options")
    void test() {
        WebDriver driver = new ChromeDriver();

        driver.get(("https://opencart.abstracta.us/"));

        driver.findElement(By.cssSelector(".form-control")).sendKeys("MaxBook");

        driver.findElement(By.cssSelector(".btn-default")).click();

        boolean display = driver.findElement(By.cssSelector("#button-search")).isDisplayed();
        System.out.println("Element enabled is :" + display);
        assertTrue(display);

        List<WebElement> fieldsNumber = driver.findElements(By.xpath("//input[contains(@class, 'form-control')]"));
        System.out.println("Fields numbers: "
                + fieldsNumber
                .size());
        Assertions.assertThat(fieldsNumber.size()).isEqualTo(2);

        driver.findElement(By.xpath("//input[contains(@class, 'form-control')]"))
                .clear();
        driver.findElement(By.xpath("//input[contains(@class, 'form-control')]"))
                .sendKeys("Macbook");
        driver.findElement(By.cssSelector(".btn-default")).click();
        Select sortBySelect = new Select(driver.findElement(By.cssSelector("#input-sort")));
        sortBySelect.selectByVisibleText("Price (High > Low)");
        System.out.println("Selected option: "
                + new Select(driver.findElement(By.cssSelector("#input-sort")))
                .getFirstSelectedOption().getText());
        assertEquals("Price (High > Low)", new Select(driver.findElement(By.cssSelector("#input-sort")))
                .getFirstSelectedOption().getText(),
                "Text is not correct, expected result is: \"Price(High > Low)\"");


        driver.quit();
    }
}
