package steps;

import org.junit.Assert;

import cucumber.api.java.en.*;
import pages.GooglePage;

public class GoogleSteps {

    GooglePage google  = new GooglePage();

    @Given("^I am on the Google search page$")
    public void navigateToGoogle(){
        google.navigateToGoogle();
        //google.acceptCookies();
    }

    @When("^I enter a search criteria$")
    public void enterSearchCriteria(){
        google.enterSearchCriteria("Google");
    }

    @And("^click on the search button$")
    public void clickSearchButton(){
        google.searchGoogle();
    }

    @Then("^the results match the criteria$")
    public void validateResults(){
       Assert.assertEquals("Google", google.firstResult());     
    }

    @Then("^I see a message that confirms it$")
    public void confirmMessage(){
       Assert.assertEquals("Gmail", google.confirmMessage());     
    }
}
