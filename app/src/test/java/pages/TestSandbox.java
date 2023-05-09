package pages;

public class TestSandbox extends BasePage {
    
    private String categoryDropdown = "//select[@id='dropdowm-menu-1']";
    
    public TestSandbox() {
        super(driver);
    }

    public void navigateToSandbox(){
        navigateTo("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
    }

    public void selectCategory(String category){
        selectFromDropdownByText(categoryDropdown, category);
    }
}

