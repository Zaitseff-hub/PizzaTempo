package by.itacademy.zaitsev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PizzaTempoPage {
    private WebDriver driver;

    public PizzaTempoPage(WebDriver driver) {this.driver = driver;};
    public static String buttonPizzaSection = "/html/body/div[1]/div[3]/ul/li[1]/a";
    public static String buttonOrderLocator = "//*[@class='order-btn']";
    public static String buttonConfirmOrderLocator = "//*[@id=\"order_pizza_popup\"]/div[2]/div[2]/div[2]/div[1]/div[3]/div[4]/button";
    public static String buttonBucketLocator = "//*[@class='bs-price-col']";
    public static String orderVerificationLocator = "//*[@id=\"basket_expand\"]/table/tbody/tr[1]/td[2]/div[1]";

    public void clickButtonPizzaSection() {driver.findElement(By.xpath(buttonPizzaSection)).click();}
    public void clickButtonOrder() {driver.findElement(By.xpath(buttonOrderLocator)).click();}
    public void clickButtonConfirmOrder() {driver.findElement(By.xpath(buttonConfirmOrderLocator)).click();}
    public void clickButtonBucket() {driver.findElement(By.xpath(buttonBucketLocator)).click();}
    public String getOrderVerification() {return driver.findElement(By.xpath(orderVerificationLocator)).getText();};
    }

