package seleniumpractice;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.login;
import PageObjects.index;
import PageObjects.darAdopcion;
import java.awt.AWTException;

/**
 *
 * @author sala304
 */
public class SeleniumPracticeTest {

    private static WebDriver driver = null;
    login log;
    index ind;
    darAdopcion dap;

    public SeleniumPracticeTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        driver.get("http://localhost:8080/SoulMate");
        driver.manage().window().maximize();
        String userName = "juan@juan";
        String password = "abc";
        log = new login(driver);
        log.loginApplication(userName, password);
    }

    @After
    public void tearDown() {
//        driver.quit();
    }

    /**
     * Test of main method, of class SeleniumPractice.
     */
//    @Test
//    public void adoptarMascotas() {        
//        ind = new index(driver);
//        ind.clickListar();
//        
//        
//        
//        
//      //  assertEquals("validar texto", "1", flight.getValuePassengers());
//    }
    @Test
    public void darEnAdopccion() throws InterruptedException, AWTException {
        dap = new darAdopcion(driver);
        dap.butonDarAdop();
        dap.llenarFormulario();
        //assertEquals("validar texto", "1");
    }

}
