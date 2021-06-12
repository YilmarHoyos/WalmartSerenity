package stepDefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import driver.SeleniumWebDriver;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.thucydides.core.annotations.Managed;
import task.BuscarProductoAleatorioEnWalmart;
import userInterface.WalmartUserInterface;
import variablesGlobales.VariablesGlobales;

import java.io.IOException;

public class BuscadorAleatorioWalmartStepDefinitios {


    @Before
    public void before() throws IOException {
        OnStage.setTheStage(new OnlineCast());
    }


    @When("^busco un producto aleatorio en el buscador$")
    public void buscoUnProductoAleatorioEnElBuscador() {
        OnStage.theActorInTheSpotlight().attemptsTo(BuscarProductoAleatorioEnWalmart.on());

    }

    @Then("^podre ver el producto aleatorio buscado$")
    public void podreVerElProductoAleatorioBuscado() {

        //OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(WebElementQuestion.the(WalmartUserInterface.LBL_PRODUCTO_RANDOM.of(VariablesGlobales.nombreProductoAleatorio)), WebElementStateMatchers.containsText(VariablesGlobales.nombreProductoAleatorio)));


    }
}
