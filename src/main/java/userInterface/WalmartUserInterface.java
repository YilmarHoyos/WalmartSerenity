package userInterface;

import net.serenitybdd.screenplay.targets.Target;


public class WalmartUserInterface {
    public static final Target TXT_WALMAR = Target.the("El campo donde se realiza la busqueda del producto").locatedBy("//input[@class='k_a bo_b header-GlobalSearch-input mweb-Typeahead-input k_b']");
    public static final Target BTN_SUBMIN = Target.the("El boton para dar inicio de la busqueda").locatedBy("//button[@class='g_a bo_e GlobalHeaderSearchbar-submit g_c']");
    public static final Target BTN_PRODUCTO = Target.the("localizador de productos").locatedBy("//mark[contains(text(),'{0}')]//ancestor::a");
    public static final Target LBL_PRODUCTO = Target.the("Confirmacion de productos").locatedBy("//h1[contains(text(),'{0}')]");
    public static final Target BTN_COVID = Target.the("BOTON CLIC EN PRODUCTOS CLOTHES").locatedBy("//a[@aria-label='At-home COVID-19 tests. Now available at Walmart. - Now available at Walmart.']");
    public static final Target SCROLL = Target.the("SCROLL").locatedBy("//div[@class='home home-Homepage']");
    public static final Target BTN_PRODUCTO_RANDOM = Target.the("BOTON PRODUCTO ALEATORIO").locatedBy("//ul[@data-automation-id='search-result-gridview-items']/li//div[@class='search-result-product-title gridview']/a");
    public static final Target LBL_PRODUCTO_RANDOM = Target.the("CONFIRMACIONDE PRODUCTO ALEATORIO").locatedBy("//ul[@data-automation-id='search-result-gridview-items']/li//div");



}
