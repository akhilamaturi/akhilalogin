import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class MyStepdefsGuest {
    Guest guest=new Guest();
    @When("^User selects the the grocery departments Grocery$")
    public void userSelectsTheTheGroceryDepartmentsGrocery() throws Throwable {
       guest.grocery();
    }


    @And("^User clicks on the search button$")
    public void userClicksOnTheSearchButton() throws Throwable {
    guest.button();
    }

    @And("^user  selects choclate and sweets$")
    public void userSelectsChoclateAndSweets() throws Throwable {
        guest.choclatesweet();
    }
    @And("^User selects the choclate$")
    public void userSelectsTheChoclate() throws Throwable {
        guest.choc();
    }



    @And("^User clicks on the selected ferrero$")
    public void userClicksOnTheSelectedFerrero() throws Throwable {
        guest.ferrero();

    }

    @And("^User adds the product to basket$")
    public void userAddsTheProductToBasket() throws Throwable {
    guest.addBasket();
    }

    @And("^User clicks proceed to checout$")
    public void userClicksProceedToChecout() throws Throwable {
    guest.checkout();
    }



    @Then("^User should view the login page$")
    public void userShouldViewTheLoginPage() throws Throwable {
     Assert.assertTrue(guest.textisPresent());

   }

   }
