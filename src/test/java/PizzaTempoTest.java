import by.itacademy.zaitsev.PizzaTempoPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PizzaTempoTest {
    @Test
    public void testWithFunctional() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.pizzatempo.by/menu/pizza.html");
        PizzaTempoPage pizza = new PizzaTempoPage(driver);
        pizza.clickButtonPizzaSection();
        pizza.clickButtonOrder();
        pizza.clickButtonConfirmOrder();
        Thread.sleep(2000);
        pizza.clickButtonBucket();
        Thread.sleep(2000);
        Assertions.assertEquals("Пицца с курицей грибами и песто (26см)", pizza.getOrderVerification());
        Thread.sleep(2000);
        driver.quit();
    }

}
