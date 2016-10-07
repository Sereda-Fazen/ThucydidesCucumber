package page;

import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SalePage extends PageObject {

    private static final Integer CATALOG_WAIT_FOR_TIMEOUT = 15000;



    @FindBy(css= "nav.product-navigation > ul > li:nth-of-type(10) > a")
    private WebElementFacade details;

    @FindBy(css= "p.curved.shadow.shop-now")
    private WebElementFacade shopNow;

    @FindBy(css="h1")
    private WebElementFacade top;

    public SalePage(WebDriver driver) {
        super(driver, CATALOG_WAIT_FOR_TIMEOUT);

    }


    public void getHomePage(){
        waitForTextToAppear("Deals");
    }

    public void getDetailsItem() {
        clickOn(details);
        waitForTextToAppear("Shop now");
    }
    public void getShowAllItem() { clickOn(shopNow);
    }
    public void getAssertTopItem() {
        element(top).shouldContainOnlyText("Top Deals from MowDirect!");
    }


}





