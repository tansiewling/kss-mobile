package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ViewNotificationsPage {

    public ViewNotificationsPage (WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(how = How.XPATH, using = "//*[@id=\"content\"]/div/div/div[1]/div[1]/h2")
    public WebElement notificationsPageHeader;

    public String getNotificationsHeaderText(){

        String headerOnNotificationsPage;

        headerOnNotificationsPage = notificationsPageHeader.getText();
        return  headerOnNotificationsPage;
    }
}