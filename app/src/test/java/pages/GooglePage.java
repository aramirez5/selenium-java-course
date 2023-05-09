package pages;

public class GooglePage extends BasePage {
    
    private String cookiesButton = "//button[@id='L2AGLb']";
    private String searchButton = "/html[1]/body[1]/div[1]/div[3]/form[1]/div[1]/div[1]/div[2]/div[2]/div[7]/center[1]/input[1]";
    private String searchTextField = "//textarea[@id='APjFqb']";
    private String googleFirstResult = "//body/div[@id='main']/div[@id='cnt']/div[@id='rcnt']/div[@id='center_col']/div[@id='res']/div[@id='search']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/h3[1]";

    public GooglePage() {
        super(driver);
    }

    public void navigateToGoogle(){
        navigateTo("https://www.google.com/");
    }

    public void acceptCookies(){
        clickElement(cookiesButton);
    }

    public void searchGoogle(){
        clickElement(searchButton);
    }

    public void enterSearchCriteria(String criteria){
        write(searchTextField, criteria);
    }

    public String firstResult(){
        return textFromElement(googleFirstResult);
    }
}
