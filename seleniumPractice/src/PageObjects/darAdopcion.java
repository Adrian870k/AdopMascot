package PageObjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class darAdopcion {

    WebDriver driver;
    By darAdop = By.name("darAdopcion");
    By foto = By.id("fotoSubida");
    By nombre = By.name("nombre");
    By Edad = By.name("edad");
    By Telefono = By.name("telefono");
    By Correo = By.name("correo");
    By Vacunas = By.name("vacuna");
    By Descripcion = By.name("descripcion");
    By btnEnviar = By.id("btnEnviarAdop");
    By listar = By.name("accion");

    public darAdopcion(WebDriver driver) {
        this.driver = driver;
    }

    //Click on login button
    public void butonDarAdop() {
        driver.findElement(darAdop).click();
    }

    public void llenarFormulario() throws InterruptedException, AWTException {
        List<WebElement> especie = driver.findElements(By.xpath("//option[@class='val']"));
        Random r = new Random();
        int numAl = r.nextInt(especie.size());
        driver.findElement(nombre).sendKeys("beto");
        especie.get(numAl).click();
        driver.findElement(Edad).sendKeys("2");
        driver.findElement(Telefono).sendKeys("1111");
        driver.findElement(Correo).sendKeys("juan@juan");
        driver.findElement(Vacunas).sendKeys("Todas");
        driver.findElement(Descripcion).sendKeys("Es una mascota muy adorable");
        boolean pas = rob();
        if (pas) {           
            
            driver.findElement(btnEnviar).click();
//            Thread.sleep(4000);
//            driver.findElement(listar).click();
            
        }
    }

    private boolean rob() throws AWTException, InterruptedException {
        boolean pas = true;
        WebElement ft = driver.findElement(foto);
        ft.click();

        //put path to your image in a clipboard
        StringSelection ss = new StringSelection("C:\\prueba.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

        //imitate mouse events like ENTER, CTRL+C, CTRL+V
        Robot robot = new Robot();
        Thread.sleep(5000);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(5000);
        
        return pas;

    }
}
