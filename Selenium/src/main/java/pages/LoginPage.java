package pages;

import base.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {

    String url;
    @FindBy(name="username")
    WebElement username;

    @FindBy(name="password")
    WebElement password;

    @FindBy(xpath="submit")
    WebElement loginBtn;

      public LoginPage() {

          PageFactory.initElements(driver, this);

      }



      public void logintoapp(String user,String pass,String domain){
        url = "https://" + user + ":" + pass + "@" + domain;
        driver.get(url);
      }

}
