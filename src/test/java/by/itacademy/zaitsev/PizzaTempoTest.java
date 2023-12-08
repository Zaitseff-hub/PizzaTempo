package by.itacademy.zaitsev;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PizzaTempoTest extends BaseTest {

    WebDriver driver = new ChromeDriver();
    @BeforeEach
    public void loadingWebSite() {
        driver.get("https://www.pizzatempo.by/");
    }

    @Test
    public void testWithOrderPizza() throws InterruptedException {
        PizzaTempoPage pizza = new PizzaTempoPage(driver);
        pizza.clickButtonPizzaSection();
        pizza.clickButtonOrder();
        Thread.sleep(2000);
        pizza.clickButtonConfirmOrder();
        Thread.sleep(4000);
        pizza.clickButtonBucket();
        Thread.sleep(2000);
        Assertions.assertEquals("Пицца \"Аппетитная\" (21см)", pizza.getOrderVerification());
        Thread.sleep(2000);
    }

    @Test
    public void testWithOrderDrink() throws InterruptedException {
        PizzaTempoPage pizza = new PizzaTempoPage(driver);
        pizza.clickButtonSectionDrinks();
        pizza.clickButtonOrderDrink();
        Thread.sleep(4000);
        pizza.clickButtonBucket();
        Thread.sleep(2000);
        Assertions.assertEquals("Вода мин. Бонаква среднегазированая 1л", pizza.getOrderVerificationDrink());
        Thread.sleep(2000);
    }
}
