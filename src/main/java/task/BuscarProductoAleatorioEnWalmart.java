package task;

import driver.SeleniumWebDriver;
import interactions.ClicProductoAleatorio;
import interactions.Esperar;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.JavascriptExecutor;
import userInterface.WalmartUserInterface;

public class BuscarProductoAleatorioEnWalmart implements Task {

    @Override
    public <T extends Actor> void performAs(T actor){



        actor.attemptsTo(
                //Click.on(WalmartUserInterface.BTN_GLOBAL),
                Scroll.to(WalmartUserInterface.SCROLL).andAlignToBottom(),
                Esperar.estosSegundos(5),
                Click.on(WalmartUserInterface.BTN_COVID),
                ClicProductoAleatorio.on()
        );

    }
    public static BuscarProductoAleatorioEnWalmart on(){

        return Instrumented.instanceOf(BuscarProductoAleatorioEnWalmart.class).withProperties();
    }


}
