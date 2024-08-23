package StepDefinition;

import base.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ActionsClass;
import pages.LoginPage;

public class Loginandactions  extends TestBase {

    LoginPage login = new LoginPage();
    ActionsClass ac = new ActionsClass();

    @Before
    public void setup(){
        initialization();
    }

    @Given("a user has credentials to login to an application")
    public void login() {
        System.out.println("The url of the application is"+prop.getProperty("url"));
    }

    @When("popup is displayed , user is logged in successfully")
    public void popup_is_displayed_user_is_logged_in_successfully() {
         login.logintoapp(prop.getProperty("username"),prop.getProperty("pass"), prop.getProperty("url"));

    }
    @Then("click on the hyperlink")
    public void click_on_the_hyperlink() {

        ac.clickhyperlink();
    }

    @And("perform drag and drop operations")
    public void perform_drag_and_drop_operations()
    {
           ac.drapanddrop();
    }
    @Then("use the navigate commands")
    public void use_the_navigate_commands()
    {
          ac.navi();
    }
    @And("handle an alert")
    public void handle_an_alert() {
          ac.handlealert();
    }

    @After
    public void end()
    {
        close();
    }
}
