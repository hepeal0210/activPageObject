import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static utils.WebDriverSupliter.getChromeDriver;

public class DatoActualizado {

    public static void ModifiDatos(String telefonofijo, String celular, String domicilio, String empresa, String apodo){

        WebDriver driver = getChromeDriver();

        driver.findElement(By.id("phone")).clear();
        driver.findElement(By.id("phone")).sendKeys(telefonofijo);

        driver.findElement(By.id("phone_mobile")).clear();
        driver.findElement(By.id("phone_mobile")).sendKeys(celular);

        driver.findElement(By.id("address1")).clear();
        driver.findElement(By.id("address1")).sendKeys(domicilio);

        driver.findElement(By.id("company")).clear();
        driver.findElement(By.id("company")).sendKeys(empresa);

        driver.findElement(By.id("alias")).clear();
        driver.findElement(By.id("alias")).sendKeys(apodo);

        driver.findElement(By.cssSelector("#submitAddress > span")).click();

}
}