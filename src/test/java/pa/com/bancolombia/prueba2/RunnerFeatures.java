package pa.com.bancolombia.prueba2;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
//@CucumberOptions(features ="src/test/resources/features/")
@CucumberOptions(features ="src/test/resources/bancolombia/")
//@CucumberOptions(features ="src/test/resources/features/ColorLib/nombre.feature")
public class RunnerFeatures {

}
