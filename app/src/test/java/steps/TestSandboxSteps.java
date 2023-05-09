package steps;

import cucumber.api.java.en.*;
import pages.TestSandbox;

public class TestSandboxSteps {

    TestSandbox sandboxPage  = new TestSandbox();

    @Given("^I navegate to the sandbox page$")
    public void navigateToSandbox(){
        sandboxPage.navigateToSandbox();
    }

    @And("^select a value from the dropdown$")
    public void selectElement(){
        sandboxPage.selectCategory("Python");
    }
}
