import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WebDriverSupliter;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UpdateMyAddresses {

    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        driver = WebDriverSupliter.getChromeDriver();
    }

    @AfterEach
    public void tearDown() {
        WebDriverSupliter.quitDriver();
    }

    @Test
    public void updateMyAddress() {
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        driver.findElement(By.cssSelector("li:nth-child(3) > a > span:nth-child(2)")).click();
        driver.findElement(By.cssSelector(".address_update .icon-chevron-right")).click();

        Logueo.LogueoUsuario ("h_alem@hotmail.com","Tips2");

        DatoActualizado.ModifiDatos("3514978562","3515262626","monte 361","hermanos asociados","tribuna");

        assertEquals("apodo", driver.findElement(By.cssSelector(".page-subheading")).getText());
    }

}
