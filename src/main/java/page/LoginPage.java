package page;

import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.thoughtworks.selenium.SeleneseTestBase.assertEquals;

public class LoginPage extends PageObject {

    private static final Integer CATALOG_WAIT_FOR_TIMEOUT = 15000;


    @FindBy(css= "#md_top_links_ul > li:nth-of-type(3) > a:nth-of-type(1)")
    private WebElementFacade signIn;

    @FindBy(css= "#email")
    private WebElementFacade login;

    @FindBy(css="#pass")
    private WebElementFacade pass;

    @FindBy(css="[name='send'] > span > span")
    private WebElementFacade send;

    @FindBy(css=".page-title")
    private WebElementFacade dashboard;


    public LoginPage (WebDriver driver) {
        super(driver, CATALOG_WAIT_FOR_TIMEOUT);

    }


    public void getHomePage() {
        clickOn(signIn);
    }

    public void getLogin(String login1) {
        enter(login1).into(login);
    }
    public void getPass(String pass1) {
        enter(pass1).into(pass);
    }

    public void clickOnButton() { clickOn(send);
    }

    public void assertMyDashboard() {
        element(dashboard).shouldContainOnlyText("My Dashboard");
    }


}





