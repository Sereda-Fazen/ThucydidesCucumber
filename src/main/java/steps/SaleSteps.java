package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import page.SalePage;


public class SaleSteps extends Steps {
    SalePage salePage;

    public SaleSteps(Pages pages) {
        super(pages);
    }



    @Given("I click 'Details'")
    public void details(){
        detailsItem();

    }
    @When("I click 'Show all'")
    public void showAll(){
        showAllItem();
    }

    @Then("I should see text 'Top Deals from MowDirect'")
    public void assertTop(){
        assertTopItem();
    }

}


