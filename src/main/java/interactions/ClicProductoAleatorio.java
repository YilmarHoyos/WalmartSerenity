package interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.core.steps.Instrumented;
import userInterface.WalmartUserInterface;
import variablesGlobales.VariablesGlobales;

import java.util.List;
import java.util.Random;

public class ClicProductoAleatorio implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(5000);
        } catch (Exception e){}

        Random random = new Random();

        List<WebElementFacade> listaBotonesProductos = WalmartUserInterface.BTN_PRODUCTO_RANDOM.resolveAllFor(actor);
        List<WebElementFacade> listaNombresDeProductos = WalmartUserInterface.LBL_PRODUCTO_RANDOM.resolveAllFor(actor);
        System.out.println("Lista botones"+listaBotonesProductos);
        System.out.println("Lista nombres " + listaNombresDeProductos);
        int n = random.nextInt(listaBotonesProductos.size());

        VariablesGlobales.nombreProductoAleatorio = listaNombresDeProductos.get(n).getText();
        listaBotonesProductos.get(n).click();
        try {
            Thread.sleep(5000);
        } catch (Exception e){}


    }
    public static Performable on(){

        return Instrumented.instanceOf(ClicProductoAleatorio.class).withProperties();
    }
}
