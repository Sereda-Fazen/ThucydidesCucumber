package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

import org.jbehave.core.annotations.AfterScenario;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import page.LoginPage;


public class LoginSteps extends Steps {
    LoginPage LoginPage;

    public LoginSteps(Pages pages) {
        super(pages);
    }

    @Step()
    public void start_browser() {
        LoginPage loginPage = getPages().get(LoginPage.class);
        loginPage.open();
    }

    @Given("I am on home page")
    public void home(){
        enterLogin();
    }
    @When("I enter login")
    public void login(String login){
        loginE(login);

    }
    @When("I enter password")
    public void pass(String pass){
        loginP(pass);
    }
    @When("I click on button 'Login'")
    public void clickLogin(){
        clickSend();
    }

    @Then("I should see My Dashboard")
    public void clickOnButton(){
        assertLocation();
    }

}


