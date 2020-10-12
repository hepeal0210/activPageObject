import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static utils.WebDriverSupliter.getChromeDriver;

public class Logueo {

    public static void LogueoUsuario(String email, String password){

        WebDriver driver = getChromeDriver();

        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("passwd")).sendKeys(password);
        driver.findElement(By.cssSelector("#SubmitLogin > span")).click();

}
}
