import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class XpathTest extends EmailGenerator {
    @Test
    @DisplayName("Login")
    void test() {
        WebDriver driver = new ChromeDriver();

        driver.get(("https://opencart.abstracta.us/"));

        driver.findElement(By
                        .xpath("//a[contains(@class, 'dropdown-toggle')]"))
                .click();

        driver.findElement(By.xpath("//a[text()='Register']"))
                .click();

        driver.findElement(By.xpath("//input[@id='input-firstname']"))
                .sendKeys("John");

        driver.findElement(By.xpath("//input[@id='input-lastname']"))
                .sendKeys("Buch");

        driver.findElement(By.xpath("//input[@id='input-email']"))
                .sendKeys(randomestring() + "@gmail.com");

        driver.findElement(By.xpath("//input[@id='input-telephone']"))
                .sendKeys("95645231");

        driver.findElement(By.xpath("//input[@id='input-password']"))
                .sendKeys("iodugsdmjgpso521");

        WebElement confirmPassword = driver
                .findElement(By.xpath("//input[@id='input-confirm']"));
        confirmPassword
                .sendKeys("iodugsdmjgpso521");

        WebElement yesSubscribe = driver.findElement(By.xpath("//input[@name='newsletter']"));
        yesSubscribe.click();

        WebElement privacyPolicyCheckbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        privacyPolicyCheckbox.click();

//        WebElement continueButton = driver.findElement(By.xpath("//input[@class='btn btn-primary']"));
//        continueButton.click();

        List<WebElement> inputsFields = driver.findElements(By.xpath("//input[contains(@class, 'form-control')]"));
        System.out.println("Number of Input fields: " + inputsFields.size());

        List<WebElement> personalInformationFields = driver.findElements(By.xpath("//div[@id='content']//input[@class='form-control']"));
        System.out.println("Number of personal information fields: " + personalInformationFields.size());

        List<WebElement> personalAccountFields = driver.findElements(By.xpath("//*[@id='account']//input[@class='form-control']"));
        System.out.println("Number of account information fields: " + personalAccountFields.size());

        List<WebElement> numberOfFieldsClassFormControl = driver.findElements(By.xpath("//*[contains(@class, 'form-control')]"));
        System.out.println("Number of fields of class \"form-control\": " + numberOfFieldsClassFormControl.size());

//        driver.quit();
    }
}
