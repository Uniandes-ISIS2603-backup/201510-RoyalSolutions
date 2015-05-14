package Royal.RoyalVacations.web.test;

import static org.junit.Assert.*;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.jboss.arquillian.junit.Arquillian;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.junit.runners.MethodSorters;
import org.junit.FixMethodOrder;
import org.junit.Test;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RoyalVacationsTest {
        private static WebDriver driver;
        // url en el cual se aloja la página web (en este caso localhost:8080)
        private static String baseUrl;
        // variable que indica si varios alert consecutivos (alert javascript) se tomarán
        private static boolean acceptNextAlert = true;
        private static StringBuffer verificationErrors = new StringBuffer();
 
       /*La anotación @BeforeClass indica lo que se debe ejecutar ANTES de correr el archivo de pruebas. Este método instancia un nuevo driver firefox (causando la apertura de una ventana física de firefox).*/
        @BeforeClass
        public static void setUp() throws Exception {
            driver = new FirefoxDriver();
        // se define el url base del proyecto web
            baseUrl = "http://localhost:8080";
        /* Indica cuanto se espera para la respuesta de cualquier comando realizado hacia el navegador*/
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }
        
        // La anotación @AfterClass indica lo que se debe ejecutar DESPUES de ejecutar
        // el archivo de pruebas. Este método cierra la ventana de firefox
        // abierta por @BeforeClass que se utilizó para la prueba.
        @AfterClass
        public static void tearDown() throws Exception {
            // Se cierra el navegador.
            driver.quit();
           // Se verifica que se haya cerrado efectivamente el navegador.
            String verificationErrorString = verificationErrors.toString();
            if (!"".equals(verificationErrorString)) {
                fail(verificationErrorString);
            }
        }
        
        @Before
        public void setUpUrl() {
            driver.get(baseUrl + "/RoyalVacations.services/");
        }
  
      
            @Test
    public void testRegistrarse() throws Exception {
 
        
        boolean success = false;
        driver.findElement(By.partialLinkText("Login")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("crear")).click();
        Thread.sleep(1000);
 
        driver.findElement(By.id("name")).clear();
         driver.findElement(By.id("password")).clear();
 
        driver.findElement(By.id("name")).sendKeys("user1");
        driver.findElement(By.id("password")).sendKeys("password");
 
        
        driver.findElement(By.id("registrarse")).click();
        Thread.sleep(2000);
 
 
 
         
            if (driver.findElement(By.id("crear")) != null) {
                
                success = true;
            }
        

        assertTrue(success);
        Thread.sleep(2000);
    }
     @Test
    public void testCrearItinerario() throws Exception {
 
        
        boolean success = false;
        driver.findElement(By.partialLinkText("Itinerarios")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("crear")).click();
        Thread.sleep(1000);
 
        driver.findElement(By.id("nombre")).clear();
         driver.findElement(By.id("fechaInicio")).clear();
         driver.findElement(By.id("fechaFinal")).clear();
     
        driver.findElement(By.id("nombre")).sendKeys("itinerario");
        driver.findElement(By.id("fechaInicio")).sendKeys("16/06/2015");
        driver.findElement(By.id("fechaFinal")).sendKeys("15/08/2015");
 
        
        driver.findElement(By.id("salvar")).click();
        Thread.sleep(2000);
 
 
 
         
            if (driver.findElement(By.id("crear")) != null) {
                
                success = true;
            }
     
        assertTrue(success);
        Thread.sleep(2000);
    }
    
    @Test
    public void testborrarItinerario() throws Exception {
        boolean success = true;
        driver.findElement(By.partialLinkText("Itinerarios")).click();
        Thread.sleep(3000);
        List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@id,'Table')]/tbody/tr"));
        
        driver.findElement(By.id("borrar")).click();
        Thread.sleep(3000);
        
        rows = driver.findElements(By.xpath("//table[contains(@id,'Table')]/tbody/tr"));
        if(rows.size()>0){
            for (WebElement webElement : rows) {
                List<WebElement> elems = webElement.findElements(By.xpath("td"));
                if (elems.get(0).getText().equals("itinerario") ) {
                    success = false;
                    break;
                }
            }
        }
 
        Thread.sleep(3000);
        assertTrue(success);
    }
    
}