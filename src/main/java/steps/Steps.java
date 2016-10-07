package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import page.LoginPage;
import page.SalePage;


public class Steps extends ScenarioSteps {
    LoginPage LoginPage;
    SalePage SalePage;

    public Steps(Pages pages) {
        super(pages);
    }

    @Step()
    public void enterLogin() {
        LoginPage.getHomePage();
    }

    @Step()

    public void loginE( String login) {
        LoginPage.getLogin(login);
    }
    @Step()
    public void loginP(String pass){
        LoginPage.getPass(pass);
    }
    @Step()
    public void clickSend(){
        LoginPage.clickOnButton();
    }

    @Step
    public void assertLocation() {
        LoginPage.assertMyDashboard();
    }


    /**
     * Steps Sale
     */

    @Step
    public void homePage(){
        SalePage.getHomePage();
    }

    @Step
    public void detailsItem(){
        SalePage.getDetailsItem();
    }
    @Step
    public void showAllItem(){
        SalePage.getShowAllItem();
    }
    @Step
    public void assertTopItem(){
        SalePage.getAssertTopItem();
    }

}


