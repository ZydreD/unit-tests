import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CssTest extends EmailGenerator {

    @Test
    @DisplayName("Login")
    void test() {
        WebDriver driver = new EdgeDriver();

        driver.get(("https://opencart.abstracta.us/"));
        driver.findElement(By
                .cssSelector("a[href = 'https://opencart.abstracta.us:443/index.php?route=account/account']"))
                .click();

        driver.findElement(By
                .cssSelector("a[href = 'https://opencart.abstracta.us:443/index.php?route=account/register']"))
                .click();

        WebElement firstNameInp = driver.findElement(By.cssSelector("input#input-firstname"));
        firstNameInp.sendKeys("Odeta");

        WebElement lastNameInp = driver.findElement(By.cssSelector("input#input-lastname"));
        lastNameInp.sendKeys("DeLast");

        WebElement emailInp = driver.findElement(By.cssSelector("input#input-email"));
        emailInp.sendKeys(randomestring()+"@gmail.com");

        WebElement telephoneInp = driver.findElement(By.cssSelector("input#input-telephone"));
        telephoneInp.sendKeys("867798521");

        WebElement passwordInp = driver.findElement(By.cssSelector("input#input-password"));
        passwordInp.sendKeys("housemaid");

        WebElement confPasswordInp = driver.findElement(By.cssSelector("input#input-confirm"));
        confPasswordInp.sendKeys("housemaid");

        WebElement subscribe = driver.findElement(By.cssSelector("input[name='newsletter'][value='1']"));
        subscribe.click();

        WebElement rulesConfirmation = driver.findElement(By.cssSelector("input[name='agree']"));
        rulesConfirmation.click();

        WebElement continueButton = driver.findElement(By.cssSelector("input[value='Continue']"));
        continueButton.click();

        System.out.println("Number of input fields: "
                + driver.findElements(By.cssSelector("input.form-control")).size());

        System.out.println("Number of personal information fieds: "
                + driver.findElements(By.cssSelector("#account input.form-control")).size());

        System.out.println("Number of elements with class 'form-control': "
                + driver.findElements(By.cssSelector(".form-control")).size());



//            driver.quit();
    }
}


