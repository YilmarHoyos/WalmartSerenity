package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/BuscadorWalmart.feature",
        glue = "stepDefinitions",
        snippets = SnippetType.CAMELCASE)// acomoda la tipografia, lo deja bonito



public class BuscadorWalmartRunners {
}
