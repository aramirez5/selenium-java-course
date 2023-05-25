package pages;

public class AmazonSearchPage extends BasePage {
    
    public String cookiesButton = "//input[@id='sp-cc-accept']";
    public String searchBox = "//input[@id='twotabsearchtextbox']";
    public String searchButton = "//input[@id='nav-search-submit-button']";
    public String pageNumberTwo = "//*[@id='search']/div[1]/div[1]/div/span[1]/div[1]/div[65]/div/div/span/a[1]";
    public String thirdResult = "//*[@id='search']/div[1]/div[1]/div/span[1]/div[1]/div[4]/div";
    public String addToCartButton = "//input[@id='add-to-cart-button']";
    public String addedMessageText = "//*[@id='NATC_SMART_WAGON_CONF_MSG_SUCCESS']/span";

    public AmazonSearchPage() {
        super(driver);
    }

    public void navigateToAmazon(){
        navigateTo("https://www.amazon.es/");
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
        goToElement(pageNumberTwo);
        clickElement(pageNumberTwo);
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
}
