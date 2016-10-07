package tests;


import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import steps.LoginSteps;
import steps.SaleSteps;


import java.io.IOException;


public class BeforeClass {


    @Managed(driver = "chrome")

    public WebDriver driver;
    public String ChromePath = "/home/alex/.jenkins/jobs/1/selenium/chromedriver";

    @Steps
    public LoginSteps settings;

    @Steps
    public LoginSteps enterLogin;
    @Steps
    public LoginSteps enterPass;

    @Steps
    public LoginSteps assertLocation;


    @Steps
    public SaleSteps home;
    @Steps
    public SaleSteps details;
    @Steps
    public SaleSteps showAll;
    @Steps
    public SaleSteps assertTop;



    @Before
    public void myTest() throws Exception {

        System.setProperty("webdriver.chrome.driver", ChromePath);
        settings.start_browser();
        driver.manage().window().maximize();

    }
    @After
    public void close() throws IOException {
        driver.close();
    }




}
