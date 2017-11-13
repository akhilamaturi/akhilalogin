import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Login extends BasePage{
    public void signin() {
        driver.findElement(By.xpath(".//*[@id='nav-tools']/a/span")).click();

    }

    public void details() {

        driver.findElement(By.id("ap_email")).sendKeys("krishna_pramodh@yahoo.co.uk");
        Boolean isPresent;
        isTextPresent("continue");//driver.findElement(By.id("continue"));
       // WebElement element = driver.findElement(By.id("continue"));
        //if (element.isDisplayed()) {
         //   element.click();
        if(isPresent=true)
        {driver.findElement(By.id("continue")).click();
            driver.findElement(By.id("ap_password")).sendKeys("798999knd");
        }
       // }
        else if(isPresent=false) {
            driver.findElement(By.id("ap_password")).sendKeys("798999knd");
        }
        else
        {
            System.out.println("Sorry we cant log u in");
        }
    }

    public void login() {
        driver.findElement(By.id("signInSubmit")).click();
    }

    public boolean isTextPresent(String text) {
        return  driver.findElement(By.tagName("body")).getText().contains(text);

    }

    public void searchshirt() {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shirt");
    }

    public void search() {
        driver.findElement(By.xpath("//*[@id='nav-search']/form/div[2]/div/input")).click();
    }



    public void sizecolor() {
        Select size=new Select(driver.findElement(By.id("native_dropdown_selected_size_name")));
        size.selectByValue("3,B074ZRC3QD");
        try
        {
        Thread.sleep(1000);}
        catch (InterruptedException exe)
        {
            exe.printStackTrace();
        }
    }

    public void basket() {
        driver.findElement(By.id("add-to-cart-button")).click();
    }

    public void checkout() {
        driver.findElement(By.id("hlb-ptc-btn-native")).click();

    }

    public void selectedshirt(String text) {
        driver.findElement(By.linkText(text)).click();
    }

    public void toMain() {
        driver.navigate().to("https://www.amazon.co.uk/");
    }

    public void logoff() {
           WebElement element=driver.findElement(By.xpath(".//*[@id='nav-link-accountList']/span[1]"));
               Actions act=new Actions(driver);
        act.moveToElement(element).perform();
        driver.findElement(By.linkText("Not krishna? Sign Out")).click();
    }
}
