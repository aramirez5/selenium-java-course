package pages;

public class AmazonSearchPage extends BasePage {
    
    public String cookiesButton = "//input[@id='sp-cc-accept']";
    public String searchBox = "//input[@id='twotabsearchtextbox']";
    public String searchButton = "//input[@id='nav-search-submit-button']";
    public String pageNumberTwo = "a[aria-label='Go to page 2']";
    public String thirdResult = "(//div[@data-component-type='s-search-result'])[3]";
    public String addToCartButton = "//*[@id='add-to-cart-button']";
    public String addedMessageText = "//*[@id='attachDisplayAddBaseAlert']/div/h4";
    public String confirmMessage = "//span[contains(text(),'You are on amazon.com. You can also shop on Amazon')]";

    public AmazonSearchPage() {
        super(driver);
    }

    public void navigateToAmazon(){
        navigateTo("https://www.amazon.com/?language=en_US");
    }

    public void acceptCookies(){
        clickElement(cookiesButton);
    }

    public void enterSearchCriteria(String criteria){
        write(searchBox, criteria);
    }

    public void clickSearch(){
        clickElement(searchButton);
    }

    public void goToPageTwo(){
        clickAndGoToElement(pageNumberTwo);
    }

    public void pickThirdItem(){
        clickElement(thirdResult);
    }

    public void addToCart(){
        clickElement(addToCartButton);
    }

    public String addToCartMessage(){
       return textFromElement(addedMessageText);
    }

    public String confirmMessage(){
        return textFromElement(confirmMessage);
     }
}
