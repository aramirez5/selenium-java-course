package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {

    protected static WebDriver driver;
    private static WebDriverWait wait;
    private static Actions action;

    static {
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();

        chromeOptions.addArguments("--no-sandbox");
        chromeOptions.addArguments("--disable-gpu");
        chromeOptions.addArguments("--disable-dev-shm-usage");

        // * Uncomment to full screen browser
        // chromeOptions.addArguments("start-maximized");

        // * Uncomment to enable headless mode
        chromeOptions.addArguments("--headless");

        // * Uncomment to get local webdriver
        // System.setProperty("webdriver.chrome.driver", "C:/selenium/chromedriver.exe");
        
        driver = new ChromeDriver(chromeOptions);
        wait = new WebDriverWait(driver, 20);
    }

    public BasePage(WebDriver driver) {
        BasePage.driver = driver;
        wait = new WebDriverWait(driver, 20);
    }

    public static void navigateTo(String url){
        driver.get(url);
    }

    public static void closeBrowser(){
        driver.quit();
    }

    private WebElement find(String locator){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }

    public void clickElement(String locator){
        find(locator).click();
    }

    public void write(String locator, String textToWrite){
        find(locator).clear();
        find(locator).sendKeys(textToWrite);
    }

    public void selectFromDropdownByValue(String locator, String valueToSelect){
        Select dropdown = new Select (find(locator));

        dropdown.selectByValue(valueToSelect);
    }

    public void selectFromDropdownByIndex(String locator, int valueToSelect){
        Select dropdown = new Select (find(locator));

        dropdown.selectByIndex(valueToSelect);
    }

    public void selectFromDropdownByText(String locator, String valueToSelect){
        Select dropdown = new Select (find(locator));

        dropdown.selectByVisibleText(valueToSelect);
    }

    public void hoverOverElement(String locator){
        action.moveToElement(find(locator));
    }

    public void doubleClick(String locator){
        action.doubleClick(find(locator));
    }

    public void rightClick(String locator){
        action.contextClick(find(locator));
    }

    public String getValueFromTable(String locator, int row, int column){
        String cellINeed = locator + "/table/tbody/tr["+row+"]/td["+column+"]";

        return find(cellINeed).getText();
    }

    public void setValueInTable(String locator, int row, int column, String stringToSend){
        String cellToFill = locator + "/table/tbody/tr["+row+"]/td["+column+"]";

        find(cellToFill).sendKeys(stringToSend);
    }

    public void switchToIframe(int frameIndex){
        driver.switchTo().parentFrame();
    }

    public void dismissAlert(){
        driver.switchTo().alert().dismiss();
    }

    public String textFromElement(String locator){
        return find(locator).getText();
    }

    public boolean elementIsDisplayed(String locator){
        return find(locator).isDisplayed();
    }
    
    public boolean elementIsSelected(String locator){
        return find(locator).isSelected();
    }

    public List<WebElement> bringMeAllElements(String locator){
        return driver.findElements(By.className(locator));
    }

    public void goToLinkText(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }

    public void clickAndGoToElement(String locator){
        WebElement element = driver.findElement(By.cssSelector(locator));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(locator))).click();
    }

    public int dropdownSize(String locator){
        Select dropdown = new Select (find(locator));
        List<WebElement> dropdownOptions = dropdown.getOptions();
        return dropdownOptions.size();
    }
}
