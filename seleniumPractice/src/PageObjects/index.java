package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class index {
    WebDriver driver;
    By listar = By.name("accion");
    public index(WebDriver driver) {
        this.driver = driver;
    }
    //Click on login button
    public void clickListar() {
        driver.findElement(listar).click();
    }
    public void mostrarMascotas() {
        //Click Listar button
        this.clickListar();
    }
}
