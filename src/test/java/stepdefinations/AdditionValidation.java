package stepdefinations;

import Base.BaseUtil;
import Poms.AdditionPageObjects;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.io.IOException;

public class AdditionValidation extends BaseUtil {

    private BaseUtil base;

    public AdditionValidation(BaseUtil base) {
        this.base = base;
    }

    @Test
    @Given("^valid inputs$")
    public void validInputs() throws IOException {

        AdditionPageObjects POs = new AdditionPageObjects(base.driver);
        POs.Seven.click();


       // POs.Seven.click();
       // POs.Seven.click();
        System.out.println("found element seven");
        POs.Plus.click();
        System.out.println("found element Plus");
        POs.Nine.click();
        System.out.println("found element Nine");
        POs.Equals.click();
        System.out.println("found element Equal");
        // base.driver wait = new driver()
        WebDriverWait wait = new WebDriverWait(base.driver,5);
        String output = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("Display is 16"))).getAttribute("Name");
        System.out.println("Result is "+output);
        // if(output.equals(POs.Displayis16))
        //{
        //  System.out.println("Result is "+output);
//       // else {

        //ScreenShots

        // TakesScreenshot ts = ((TakesScreenshot)driver);
        //File source = ts.getScreenshotAs(OutputType.FILE);

        // FileUtils.copyFile(source, new File("./Screenshots/facebook.png"));
        //  FileUtils.copyFile(source, new File("C:\\Users\\Murali\\IdeaProjects\\Winium\\src\\test\\java\\ScreenShots"));
        // System.out.println(" Taken Screen shot failed to Display 16 pls look in Screenshots folder");




        // }


        //driver.findElementByXPath("//*[contains(@AutomationId,'num7Button')]").click();
        // waitfortwoSeconds();
        System.out.println("All test Completed");

    }
    @Test
    @Given("^Pint console$")
    public void pintConsole() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("All test Complennnnnted");
        throw new PendingException();
    }
}
