package stepDefinitions;

import java.io.IOException;

import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import driver.SeleniumWebDriver;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import task.BuscarProductoEnWalmart;
import userInterface.WalmartUserInterface;

public class BuscadorWalmartStepDefinitions {
    @Before
    public void before() throws IOException {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^que me encuentro en la pagina de walmart con la url (.*)$")
    public void queMeEncuentroEnLaPaginaDeWalmartConLaUrlHttpsWwwWalmartCom(String url) {
        OnStage.theActorCalled("Yilmar").can(BrowseTheWeb.with(SeleniumWebDriver.ChromeWebDriver().on(url)));

    }

    @When("^busco diferentes productos (.*) en el buscador$")
    public void buscoDiferentesProductosEnElBuscador(String producto) {
        OnStage.theActorInTheSpotlight().attemptsTo(BuscarProductoEnWalmart.on(producto));

    }

    @Then("^podre ver los productos (.*) buscados$")
    public void podreVerLosProductosBuscados(String producto) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(WebElementQuestion.the(WalmartUserInterface.LBL_PRODUCTO.of(producto)),
                WebElementStateMatchers.containsText(producto)));

    }

}
