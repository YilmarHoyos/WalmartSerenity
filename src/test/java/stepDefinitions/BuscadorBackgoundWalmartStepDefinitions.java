package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driver.SeleniumWebDriver;
import models.Producto;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import org.junit.Before;
import task.BuscarProductoEnWalmart;
import userInterface.WalmartUserInterface;
import variablesGlobales.VariablesGlobales;

import java.io.IOException;
import java.util.List;

public class BuscadorBackgoundWalmartStepDefinitions {


    @Before
    public void before() throws IOException {
        OnStage.setTheStage(new OnlineCast());
    }
    @When("^busco un producto en el buscador walmart$")
    public void buscoUnProductoEnElBuscadorWalmart(List<Producto> productos)
    {
        OnStage.theActorInTheSpotlight().attemptsTo(BuscarProductoEnWalmart.on(productos.get(0).getNombreProducto()));
    }

    @Then("^podre ver el producto buscado en la pantalla$")
    public void podreVerElProductoBuscadoEnLaPantalla() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(WebElementQuestion.the(WalmartUserInterface.LBL_PRODUCTO.of(VariablesGlobales.nombreProductoAleatorio)), WebElementStateMatchers.containsText(VariablesGlobales.nombreProductoAleatorio)));


    }
}


