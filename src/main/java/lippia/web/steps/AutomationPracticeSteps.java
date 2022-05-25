package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.constants.AutomationPracticeConstants;
import lippia.web.services.AutomationPracticeService;



public class AutomationPracticeSteps extends PageSteps {

    @Given("El usuario se encuentra en la web Automation Practice")
    public void elUsuarioSeEncuentraEnLaWebAutomationPractice(){
        AutomationPracticeService.navegarWeb();
    }

    @When("^El usuario clickea el botón \"(.*)\" del menú$")
    public void elUsuarioClickeaElBotonDelMenu(String myAccountButton) {
               AutomationPracticeService.clickMyAccount();
    }

    @And("^El usuario ingresa su username \"(.*)\"$")
    public void elUsuarioIngresaSuUsername(String username) {
        AutomationPracticeService.completarUsername(username);
    }

    @And("^El usuario ingresa su password \"(.*)\"$")
    public void elUsuarioIngresaSuPassword(String password) {
        AutomationPracticeService.completarPassword(password);
    }

    @And("^El usuario clickea el botón \"(.*)\"$")
    public void elUsuarioClickeaElBotonLogin(String loginButton) {
        AutomationPracticeService.clickLoginBtn();
    }


    @Then("El usuario verifica el logueó")
    public void elUsuarioVerificaElLogueó() {AutomationPracticeService.verificarLogin();
    }



// SEGUNDO TEST


    @When("^El usuario clickea el boton \"(.*)\" de la home$")
    public void elUsuarioClickeaElBotonDeLaHome(String Btn_Shop) {
        AutomationPracticeService.clickShop();
    }

    @And("El usuario clickea en el  producto Selenium Ruby")
    public void elUsuarioClickeaEnElBotonDelProductoSeleniumRuby() {
        AutomationPracticeService.clickProductSelenium();
    }


    @Then("El usuario visualiza el producto")
    public void elUsuarioVisualizaElProducto() {
        AutomationPracticeService.verificaProduct();

    }

 // TERCER TEST

    @And("^El usuario Selecciona el menu desplegable \"(.*)\"$")
    public void elUsuarioSeleccionaElMenuDesplegable(String menuDespleg) {
        AutomationPracticeService.clickMenuDesplegable();
   }
    @And("^El usuario selecciona la opcion \"(.*)\"$")
    public void elUsuarioSeleccionaLaOpcion(String optionPopulary) {
        AutomationPracticeService.clickOptionPopulary();
    }

    @Then("El usuario visualiza los productos mas populares")
    public void elUsuarioVisualizaLosProductosMasPopulares() {
        AutomationPracticeService.verificarProductPopulares();
    }


}
