package by.itacademy.zaitsev;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class DominosPage {
    private WebDriver driver;

    public DominosPage(WebDriver driver) {
        this.driver = driver;
    }

    public static String checkBoxVerify = "//*[@id=\"challenge-stage\"]/div/label/input";
    public static String buttonPizzaSection = "//*[@id=\"app-root\"]/div/div[1]/div[2]/div[2]/div/div/div/div/div/div[1]/div/ul/li[1]/a/span";
    public static String buttonOderPizza = "//*[@id=\"app-root\"]/div/div[1]/div[2]/div[6]/div/div/div[1]/div/div[6]/div[2]/button";
    public static String buttonCheckBucket = "//*[@id=\"app-root\"]/div/div[1]/div[2]/div[2]/div/div/div/div/div/div[3]/div/button";
    public static String oderVerification = "//*[@id=\"app-root\"]/div/div[1]/div[2]/div[2]/div/div/div/div/div/div[3]/div/div/div[2]/div/div/div/div/div[1]";

    public void clickCheckBoxVerify() {
    try {
        if (driver.findElement(By.xpath(checkBoxVerify)).isDisplayed()); {
            driver.findElement(By.xpath(checkBoxVerify)).click(); }
    } catch (NoSuchElementException e) {
            System.out.println("Popup is not displayed");
        }

    }
    public void clickButtonPizzaSection() {driver.findElement(By.xpath(buttonPizzaSection)).click();}
    public void clickButtonOderPizza() {driver.findElement(By.xpath(buttonOderPizza)).click();}
    public void clickButtonCheckBucket() {driver.findElement(By.xpath(buttonCheckBucket)).click();}
    public String getOderVerification() {return driver.findElement(By.xpath(oderVerification)).getText();};


}