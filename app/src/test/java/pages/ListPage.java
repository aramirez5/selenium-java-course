package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

public class ListPage extends BasePage {

    private String searchField = "//body/form[1]/input[1]";
    private String searchResults = "name";

    public ListPage() {
        super(driver);
    }

    public void navigateToListPage(){
        navigateTo("https://github.com/andreidbr/JS30/tree/master/06AjaxTypeAhead");
    }

    public void enterSearchCriteria(String state) throws InterruptedException {
        Thread.sleep(600);
        write(searchField, state);
    }

    public List<String> getAllSearchResults(){
        List<WebElement> list = bringMeAllElements(searchResults);
        List<String> stringsFromList = new ArrayList<String>();
        
        for(WebElement e :list){
            stringsFromList.add(e.getText());
        }
        
        return stringsFromList;
    }
}
