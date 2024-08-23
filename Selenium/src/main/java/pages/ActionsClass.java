package pages;

import base.TestBase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActionsClass extends TestBase
    {

        @FindBy(xpath="link")
        WebElement link;
        @FindBy(xpath="source")
        WebElement source;

        @FindBy(xpath="dest")
        WebElement destination;


        public ActionsClass() {

            PageFactory.initElements(driver, this);

        }

        public void clickhyperlink(){

            link.click();
        }

        public void drapanddrop(){
             Actions a = new Actions(driver);
              a.dragAndDrop(source,destination).build().perform();
        }

        public void navi(){
            driver.navigate().to(""); //navigate to page
            driver.navigate().forward(); //to navigate one page forward
            driver.navigate().back(); //to navigate one page back
            driver.navigate().refresh(); //to refresh the current page


        }

        public void handlealert(){
            driver.switchTo().alert().accept(); //to accept an alert
            driver.switchTo().alert().dismiss(); //to dismiss an alert
            Alert a = driver.switchTo().alert();
            a.sendKeys(""); // to send values to alerts
            }
        }

