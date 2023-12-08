package by.itacademy.zaitsev;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TerraPizzaTest extends BaseTest{

    @Test
    public void testWithFunctionalTerraPizza() throws InterruptedException {

        driver.get("https://www.terrapizza.by");
        TerraPizzaPage pizza = new TerraPizzaPage(driver);
        pizza.clickCloseButtonCookies();
        Thread.sleep(4000);
        pizza.clickButtonMenu();
        pizza.clickPizzaSection();
        Thread.sleep(2000);
        pizza.clickCloseButtonCookies();
        pizza.clickButtonOderPizza();
        pizza.clickButtonBarSection();
        pizza.clickButtonOderDrink();
        pizza.clickButtonCheckBucket();
        Assertions.assertEquals("Пицца Венеция на тонком 32 см", pizza.getOderVerificationPizza());
        Assertions.assertEquals("Облепиховый чай", pizza.getOderVerificationDrink());
        Thread.sleep(2000);

    }
}
