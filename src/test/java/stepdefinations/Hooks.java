package stepdefinations;

import Base.BaseUtil;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.commons.exec.CommandLine;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.openqa.selenium.winium.WiniumDriverService;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
//import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class Hooks extends BaseUtil{

    private BaseUtil base;


    public Hooks(BaseUtil base) {
        this.base = base;

    }


    @Before
    public void InitializeTest() throws IOException, InterruptedException {


        //Below code works atuomatically on the winium driver.

        base.options = new DesktopOptions();                         //Instantiate Winium Desktop Options
        base.options.setApplicationPath("C:\\Windows\\System32\\calc.exe");              //Set Calculator Application Path
        File driverPath = new File("C:\\Users\\Murali\\Desktop\\Winium1.6.0\\Winium.Desktop.Driver.exe");   //Set Winium  Driver Path
        base.service = new WiniumDriverService.Builder().usingDriverExecutable(driverPath).usingPort(9999).withVerbose(true).withSilent(false).buildDesktopService();
        base.service.start();                 //Build and start a Winium Driver service
        base.driver = new WiniumDriver(base.service,base.options);  // Start Winium Driver
        System.out.println("Server Started");

        //Below code automatically open console through bat file command

        /*
        base.options = new DesktopOptions();
        Runtime.getRuntime().exec("cmd /c start C:\\serverst.bat");
        Thread.sleep(5000);
        base.options.setApplicationPath("C:\\Windows\\System32\\calc.exe");
        Thread.sleep(5000);
        base.driver = new WiniumDriver(new URL("http://localhost:9999"),base.options);
       // Thread.sleep(5000);*/

    }
    @After
    public void TearDownTest() throws InterruptedException, IOException {

        //automatically stop browser for First Code written in before class
        base.service.stop();
        System.out.println("Driver Closed");
        System.out.println("Server Closed");


        //automatically stop browser cmd commands not working

      /*  CommandLine command = new CommandLine("cmd");
        command.addArgument("/c");
        command.addArgument("taskkill");
        command.addArgument("/F");
        command.addArgument("/IM");
        command.addArgument("Winium.Desktop.Driver.exe");
        //Thread.sleep(5000);
        //System.out.println("Driver trying to close");
       // Runtime.getRuntime().exec("cmd /c start C:\\Users\\Murali\\IdeaProjects\\Winium\\serverquit.bat");
       // cmd /C start cmd /C test.bat
      //  base.driver.close();

        //base.driver.quit();
        System.out.println("Driver Closed");
        System.out.println("Server Closed");

        // Runtime.getRuntime().exec("cmd /c C:\\taskkill /F /IM cmd.exe");

       // base.service.stop();

        System.out.println("Appium server stopped");
    }*/
    }

}
