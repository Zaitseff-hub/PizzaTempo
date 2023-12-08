package by.itacademy.zaitsev;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TerraPizzaTest extends BaseTest {

    @BeforeEach
    public void downloadWebSite() {
        driver.get("https://www.terrapizza.by");
    }

    @Test
    public void testWithOrderPizza() throws InterruptedException {
        TerraPizzaPage pizza = new TerraPizzaPage(driver);
        pizza.clickCloseButtonCookies();
        Thread.sleep(2000);
        pizza.clickButtonMenu();
        pizza.clickPizzaSection();
        Thread.sleep(4000);
        pizza.clickCloseButtonCookies();
        pizza.clickButtonOderPizza();
        Thread.sleep(2000);
        pizza.clickButtonCheckBucket();
        Assertions.assertEquals("Пицца Венеция на тонком 32 см", pizza.getOderVerificationPizza());
    }

    @Test
    public void testWithOrderDrinks() throws InterruptedException {
        TerraPizzaPage drink = new TerraPizzaPage(driver);
        drink.clickCloseButtonCookies();
        drink.clickButtonMenu();
        drink.clickCloseButtonCookies();
        drink.clickButtonBarSection();
        Thread.sleep(2000);
        drink.clickButtonOderDrink();
        Thread.sleep(4000);
        drink.clickButtonCheckBucket();
        Assertions.assertEquals("Облепиховый чай", drink.getOderVerificationDrink());
        Thread.sleep(2000);
    }
}