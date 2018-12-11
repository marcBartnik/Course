package basics;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.util.List;

@Ignore("You need to amend for your setup and operating system to use this e.g. did you install a ChromeDriver? Are you on Mac for SafariDriver?")
public class SwapiGUIFormUsageTest {
    private String chromeDriverPath = new File("..//core//src//main//resources//bin//chromedriver.exe").getAbsolutePath();
    private String ChromePath = System.setProperty("webdriver.chrome.driver", chromeDriverPath);
    private WebDriver driver = new ChromeDriver();


//    private WebDriver getDefaultDriver(){
//        HtmlUnitDriver driver;
//        driver = new HtmlUnitDriver(BrowserVersion.BEST_SUPPORTED, true);
//        driver.setJavascriptEnabled(true);
//        return driver;
//    }

    @Test
    public void canGetSwapiGUIPage(){
        driver.get("https://swapi.co/");
        Assert.assertTrue(driver.getTitle().contains("Star Wars"));
        driver.quit();
    }

    @Test
    public void usePersonApiGUIForLuke() {
        driver.get("http://swapi.co/api/people/1/?format=api");
        WebElement response = driver.findElement(By.cssSelector("div.response-info > pre"));

        String json = response.getText();
        System.out.println(json);
        Assert.assertTrue(json.contains("Luke Skywalker"));

        driver.quit();
    }


    @Test
    public void usePersonApiGUIForC3PO(){
        driver.get("http://swapi.co/api/people/2/?format=api");
        WebElement response = driver.findElement(By.cssSelector("div.response-info > pre"));

        String json = response.getText();
        System.out.println(json);
        Assert.assertTrue(json.contains("C-3PO"));

        driver.quit();
    }

//    @Test
//    public void canSubmitFormFromGUIPage(){
//        driver.get("https://swapi.co/");
//        WebElement inputfield = driver.findElement(By.id("interactive"));
//        inputfield.sendKeys("people/2/");
//
//        driver.findElement(By.className("btn-primary")).click();
//        new WebDriverWait(driver, 10).until(ExpectedConditions.textToBePresentInElementLocated(By.id("interactive_output"), "C-3PO"));
//
//        WebElement output = driver.findElement(By.id("interactive_output"));
//        String json = output.getText();
//        Assert.assertTrue(json.contains("C-3PO"));
//
//        driver.quit();
//    }

    @Test
    public void canClickSearchLink(){
        driver.get("https://swapi.co/");
        List<WebElement> links = driver.findElements(By.cssSelector("small > a"));

        links.get(0).click();

        WebElement output = driver.findElement(By.id("interactive_output"));
        String json = output.getText();

        System.out.println(json);
        Assert.assertTrue(json.contains("Luke Skywalker"));

        driver.quit();
    }

    /* Exercise search for C-3PO instead of Luke Skywalker:
         Download ChromeDriver from  https://sites.google.com/a/chromium.org/chromedriver/
         And add the chromedriver executable to your path
         comment out the usage of HtmlUnitDriver and enable use of ChromeDriver
         click on the second link (1)
         Assert on the name "Yavin IV"
     */

    /* for a real 'hack'
       create a SwapiApi implementation that uses WebDriver and parses the Json from the GUI
       - ugh it is horrible but you will learn how to parse Strings
       - and there will a come a time when you have to automate like this
     */

}

