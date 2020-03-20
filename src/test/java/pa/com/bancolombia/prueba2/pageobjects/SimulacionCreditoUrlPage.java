package pa.com.bancolombia.prueba2.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

@DefaultUrl("https://www.grupobancolombia.com/wps/portal/personas/productos-servicios/creditos/consumo/libre-inversion/simulador-credito-consumo")
public class SimulacionCreditoUrlPage extends PageObject{
	
	@FindBy(xpath="//H1[text()='Simula tu Crédito']")
	public WebElementFacade lblHomePpal;
	
	
	public void VerificaHome() {
		String labelv = "Simula tu Crédito";
		String strMensaje = lblHomePpal.getText();
		assertThat(strMensaje, containsString(labelv));
	}

}
