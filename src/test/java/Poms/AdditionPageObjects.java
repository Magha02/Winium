package Poms;
import Base.BaseUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.winium.WiniumDriver;

public class AdditionPageObjects{

    //Constructor
    public  AdditionPageObjects(WiniumDriver driver)
    {

        PageFactory.initElements(driver,this);

    }

   /* @FindBy(xpath="//*[contains(@AutomationId,'num7Button')]")
    public WebElement Seven;*/


    @FindBy(name="Seven")
    public WebElement Seven;

    @FindBy(name="Plus")
    public WebElement Plus;

    @FindBy(name="Nine")
    public WebElement Nine;

    @FindBy(name="Equals")
    public WebElement Equals;


    @FindBy(name = "Display is 16")
    public WebElement Displayis16;



}


