package by.itacademy.zaitsev;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    private String menuItemLocator = "//div[@class='mainmenu']/ul/li";

    @Test
    public void findMenuItem() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.pizzatempo.by/menu/pizza.html");

        String menuItemLocator = "//div[@class='mainmenu']/ul/li";
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        List<WebElement> menuItems = driver.findElements(By.xpath(menuItemLocator));
        List<String> menuItemsString = new ArrayList<>();

        for (int i = 0; i < menuItems.size(); i++) {
            menuItemsString.add(menuItems.get(i).getText());
        }
        List<String> expectedMenuItemsList = new ArrayList<>();
        expectedMenuItemsList.add("ПИЦЦА");
        expectedMenuItemsList.add("АКЦИИ");
        expectedMenuItemsList.add("БУРГЕРЫ, ЗАКУСКИ, ФРИ");
        expectedMenuItemsList.add("САЛАТЫ, СУПЫ, ХЛЕБ");
        expectedMenuItemsList.add("ГОРЯЧИЕ БЛЮДА");
        expectedMenuItemsList.add("НАПИТКИ");
        expectedMenuItemsList.add("ДЕСЕРТЫ");
        expectedMenuItemsList.add("ДЕТСКОЕ МЕНЮ");
        expectedMenuItemsList.add("ПРИБОРЫ");

        Assertions.assertEquals(expectedMenuItemsList, menuItemsString);
    }

}

