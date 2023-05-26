package steps;

import org.junit.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.AmazonSearchPage;

public class AmazonSearchSteps {

    AmazonSearchPage amazon  = new AmazonSearchPage();

    @Given("^the user navigates to Amazon website$")
    public void navigateToAmazon(){
        amazon.navigateToAmazon();
    }

    @And("^searches for (.+)$")
    public void enterSearchCriteria(String criteria){
        amazon.enterSearchCriteria(criteria);
        amazon.clickSearch();
    }

    @And("^navigates to page number two$")
    public void navigatesToSecondPage(){
        amazon.goToPageTwo();
    }

    @And("^selects the third item$")
    public void selectsThirdItem(){
        amazon.pickThirdItem();     
    }

    @Then("^the user is able to add it to the cart$")
    public void itemCanBeAddedToTheCart(){
        amazon.addToCart();
        Assert.assertEquals("Added to Cart", amazon.addToCartMessage());  
    }

    @Then("^the user see a message that confirms it$")
    public void confirmMessage(){
        String actualText = amazon.confirmMessage();
        String expectedPartialText = "Top Deal";

        Assert.assertTrue(actualText.contains(expectedPartialText));  
    }
}
