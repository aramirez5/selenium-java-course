package pages;

public class AmazonSearchPage extends BasePage {
    
    public String cookiesButton = "//input[@id='sp-cc-accept']";
    public String searchBox = "//input[@id='twotabsearchtextbox']";
    public String searchButton = "//input[@id='nav-search-submit-button']";
    public String pageNumberTwo = "//a[contains(text(),'2')]";
    public String thirdResult = "//body/div[@id='a-page']/div[@id='search']/div[1]/div[1]/div[1]/span[1]/div[1]/div[4]";
    public String addToCartButton = "//input[@id='add-to-cart-button']";
    public String addedMessageText = "//span[contains(text(),'Añadido a la cesta')]";

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
