import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssTest {

    @Test
    void test() {
        WebDriver driver = new ChromeDriver();

        driver.get(("https://opencart.abstracta.us/"));
        driver.findElement(By.cssSelector("a[href = 'https://opencart.abstracta.us:443/index.php?route=account/account']")).click();

        driver.findElement(By.cssSelector("a[href = 'https://opencart.abstracta.us:443/index.php?route=account/register']")).click();

        WebElement firstNameInp = driver.findElement(By.cssSelector("input#input-firstname"));
        firstNameInp.sendKeys("Odeta");

        WebElement lastNameInp = driver.findElement(By.cssSelector("input#input-lastname"));
        lastNameInp.sendKeys("DeLast");

        WebElement emailInp = driver.findElement(By.cssSelector("input#input-email"));
        emailInp.sendKeys("email@email.com");

        WebElement telephoneInp = driver.findElement(By.cssSelector("input#input-telephone"));
        telephoneInp.sendKeys("867798521");

        WebElement passwordInp = driver.findElement(By.cssSelector("input#input-password"));
        passwordInp.sendKeys("housemaid");

        WebElement confPsswordInp = driver.findElement(By.cssSelector("input#input-confirm"));
        confPsswordInp.sendKeys("housemaid");

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


//            driver.findElement(By.name("search")).sendKeys("MaxBook");
//            driver.findElement(By.className("btn-default")).click();
//            boolean Display = driver.findElement(By.id("button-search")).isDisplayed();
//            System.out.println("Element enabled is :" + Display);
//
//            System.out.println("Fields numbers: " + driver.findElements(By.name("search")).size());
//            driver.findElement(By.name("search")).clear();
//            driver.findElement(By.name("search")).sendKeys("Macbook");
//            driver.findElement(By.className("btn-default")).click();
//            Select sortBySelect = new Select(driver.findElement(By.id("input-sort")));
//            sortBySelect.selectByVisibleText("Price (High > Low)");
//            System.out.println("Selected option: "
//                    + new Select(driver.findElement(By.id("input-sort"))).getFirstSelectedOption().getText());
//
//

//            driver.quit();
    }
}


