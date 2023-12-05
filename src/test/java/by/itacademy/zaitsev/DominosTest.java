package by.itacademy.zaitsev;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DominosTest {

    @Test
    public void testWithFunctionalDominos() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://dominos.by/pizza");

        DominosPage pizza = new DominosPage(driver);
        pizza.clickCheckBoxVerify();
        Thread.sleep(5000);
        pizza.clickButtonPizzaSection();
        pizza.clickButtonOderPizza();
        pizza.clickButtonCheckBucket();
        Assertions.assertEquals("Диабло Карри", pizza.getOderVerification());
        Thread.sleep(2000);
        driver.quit();
    }
}
