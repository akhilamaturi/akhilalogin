

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class MyStepdefsLogin {
    Login log=new Login();

    @Given("^User is on the homepage of amazon site$")
    public void userIsOnTheHomepageOfAmazonSite() throws Throwable {
    }

    @When("^User clicks on signin$")
    public void userClicksOnSignin() throws Throwable {
        System.out.println("hello login");
       log.signin();
    }

    @When("^User gives his email and password$")
    public void userGivesHisEmailAndPassword() throws Throwable {
    log.details();
    }

    @And("^User clicks on login$")
    public void userClicksOnLogin() throws Throwable {
    log.login();
    }

    @Then("^User should login succesfully \"([^\"]*)\"$")
    public void userShouldLoginSuccesfully(String text) throws Throwable {
        Assert.assertTrue(log.isTextPresent(text));
    }

    @And("^User searches for shirts$")
    public void userSearchesForShirts() throws Throwable {
        log.searchshirt();
    }

    @And("^User clicks on search button$")
    public void userClicksOnSearchButton() throws Throwable {
      log.search();
    }

   /* @And("^when User checks for autumn/winter collection$")
    public void whenUserChecksForAutumnWinterCollection() throws Throwable {
        log.autumncollection();
    }*/

    @And("^User clicks on selected shirt link \"([^\"]*)\"$")
    public void userClicksOnSelectedShirtLink(String text) throws Throwable {
       log.selectedshirt(text);
    }

    @And("^User selects size and color of shirt$")
    public void userSelectsSizeAndColorOfShirt() throws Throwable {
       log.sizecolor();
    }

    @And("^User adds the item to basket$")
    public void userAddsTheItemToBasket() throws Throwable {
        log.basket();
    }

    @And("^when User clicks on proceed to checkout$")
    public void whenUserClicksOnProceedToCheckout() throws Throwable {
       log.checkout();
    }

    @Then("^User should view the address page \"([^\"]*)\"$")
    public void userShouldViewTheAddressPage(String text) throws Throwable {
        Assert.assertTrue(log.isTextPresent(text));
    }


    @And("^User navigates to home page$")
    public void userNavigatesToHomePage() throws Throwable {
        log.toMain();
    }

    @And("^User should signoff$")
    public void userShouldSignoff() throws Throwable {
       log.logoff();
    }
}
