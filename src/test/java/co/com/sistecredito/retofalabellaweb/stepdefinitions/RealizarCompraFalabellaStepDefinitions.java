package co.com.sistecredito.retofalabellaweb.stepdefinitions;


import co.com.sistecredito.retofalabellaweb.model.DatosCompra;
import co.com.sistecredito.retofalabellaweb.questions.Validar;
import co.com.sistecredito.retofalabellaweb.task.RealizarCompraProducto;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static co.com.sistecredito.retofalabellaweb.utils.Constantes.*;


public class RealizarCompraFalabellaStepDefinitions {

    @Managed
    static WebDriver driver;

    @Before
    public void configurar() {
        OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(driver)));
        OnStage.theActorCalled("Usuario Ximena");
    }


    @Given("^el usuario ingresa a la pagina falabella$")
    public void elUsuarioIngresaALaPaginaFalabella() {

        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url(URL_FALABELLA));
    }


    @When("^requiere comprar un producto$")
    public void requiereComprarUnProducto(List<DatosCompra> datosCompras) {

        OnStage.theActorInTheSpotlight().attemptsTo(
                RealizarCompraProducto.realizarCompraProducto(datosCompras)
        );

    }

    @Then("^verificar el valor del producto$")
    public void verificarElValorDelProducto() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Validar.montoAPagar()));
    }
}
