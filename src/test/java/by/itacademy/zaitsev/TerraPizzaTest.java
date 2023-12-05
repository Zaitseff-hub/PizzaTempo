package by.itacademy.zaitsev;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TerraPizzaTest {

    @Test
    public void testWithFunctionalTerraPizza() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://terrapizza.by/");

        TerraPizzaPage pizza = new TerraPizzaPage(driver);

        pizza.clickCloseButtonCookies();
        Thread.sleep(4000);
        pizza.clickButtonMenu();
        pizza.clickPizzaSection();
        pizza.clickButtonOderPizza();
        pizza.clickButtonBarSection();
        pizza.clickButtonOderDrink();
        pizza.clickButtonCheckBucket();
        Assertions.assertEquals("Пицца Венеция на тонком 32 см", pizza.getOderVerificationPizza());
        Assertions.assertEquals("Облепиховый чай", pizza.getOderVerificationDrink());
        Thread.sleep(2000);
        driver.quit();
    }

}
