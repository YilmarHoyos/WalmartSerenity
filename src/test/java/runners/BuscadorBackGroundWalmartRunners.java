package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/BuscadorBackgroundWalmart.feature",
        glue = "stepDefinitions",
        snippets = SnippetType.CAMELCASE)// acomoda la tipografia, lo deja bonito

public class BuscadorBackGroundWalmartRunners {
}
