package task;

import driver.SeleniumWebDriver;
import interactions.Esperar;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userInterface.WalmartUserInterface;
import variablesGlobales.VariablesGlobales;

public class BuscarProductoEnWalmart implements Task {
    private  String producto;
    public BuscarProductoEnWalmart(String producto){this.producto = producto;}
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Enter.theValue(producto).into(WalmartUserInterface.TXT_WALMAR),
                Esperar.estosSegundos(30),
                Click.on(WalmartUserInterface.BTN_SUBMIN),
                Esperar.estosSegundos(30),
                Click.on(WalmartUserInterface.BTN_PRODUCTO.of(producto.split(" ")[0]))

        );
        VariablesGlobales.nombreProductoAleatorio = WalmartUserInterface.LBL_PRODUCTO.of(producto).resolveFor(actor).getText();


    }
    public static BuscarProductoEnWalmart on(String producto){
        return Instrumented.instanceOf(BuscarProductoEnWalmart.class).withProperties(producto);

    }

}
