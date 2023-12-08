package by.itacademy.zaitsev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TerraPizzaPage {
    public WebDriver driver;
    public TerraPizzaPage(WebDriver driver) {
        this.driver = driver;
    }
    public static String closeButtonCookies = "/html/body/div[6]/div/button";
    public static String buttonMenu = "/html/body/div[2]/div[1]/div[1]/div[2]/ul/li[1]/a";
    public static String buttonPizzaSection = "/html/body/div[3]/div[1]/div/div/div/div[3]/div/div[1]/div/div/div[9]/a";
    public static String buttonOderPizza = "//*[@id=\"menu-card-356\"]/div[3]/div[3]/div[2]/div[2]/button";
    public static String buttonBarSection = "/html/body/div[3]/div[1]/div/div/div/div[3]/div/div[1]/div/div/div[15]/a";
    public static String buttonOderDrink = "//*[@id=\"menu-card-2219\"]/div[3]/div[3]/div/div[2]/button";
    public static String buttonCheckBucket = "/html/body/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]";
    public String oderVerificationPizza = "//*[@id=\"basket-el-0\"]/div[2]/div[1]/div[1]";
    public String oderVerificationDrink = "//*[@id=\"basket-el-0\"]/div[2]/div[1]/div[1]";

    public void clickCloseButtonCookies() {driver.findElement(By.xpath(closeButtonCookies)).click();};
    public void clickButtonMenu() {driver.findElement(By.xpath(buttonMenu)).click();};
    public void clickPizzaSection() {driver.findElement(By.xpath(buttonPizzaSection)).click();};
    public void clickButtonOderPizza() {driver.findElement(By.xpath(buttonOderPizza)).click();};
    public void clickButtonBarSection() {driver.findElement(By.xpath(buttonBarSection)).click();};
    public void clickButtonOderDrink() {driver.findElement(By.xpath(buttonOderDrink)).click();};
    public void clickButtonCheckBucket() {driver.findElement(By.xpath(buttonCheckBucket)).click();};
    public String getOderVerificationPizza() {return driver.findElement(By.xpath(oderVerificationPizza)).getText();};
    public String getOderVerificationDrink() {return driver.findElement(By.xpath(oderVerificationDrink)).getText();};
}
