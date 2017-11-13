import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Guest extends BasePage {
    public Guest() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "searchDropdownBox")
    private WebElement catgrocery;
    @FindBy(className = "nav-input")
    private WebElement button;
    @FindBy(linkText = "Chocolate & Sweets")
    private WebElement chocsweet;
    @FindBy(linkText = "Chocolate")
    private WebElement choc;
    @FindBy(xpath = "//*[@id='result_3']/div/div[3]/div[1]/a/h2")
    private WebElement ferreochoc;
    @FindBy(id="submit.add-to-cart")
    private WebElement add;
    @FindBy(id="hlb-ptc-btn-native")
    private WebElement checkout;
    @FindBy(id="createAccountSubmit")
    private WebElement text;


    public void grocery() {
        Select sel = new Select(catgrocery);
        sel.selectByVisibleText("Grocery");
    }

    public void button() {
        button.click();
    }

    public void choclatesweet() {
        chocsweet.click();
    }
    public void choc() {
        choc.click();
    }

    public void ferrero() {
        ferreochoc.click();
    }

    public void addBasket() {
        add.click();
    }

    public void checkout() {
        checkout.click();
    }



   public boolean textisPresent() {
       return text.isDisplayed();

   }
}
