package pa.com.bancolombia.prueba2.steps;

import net.thucydides.core.annotations.Step;
import pa.com.bancolombia.prueba2.pageobjects.SimulacionCreditoUrlPage;


public class SimulacionCreditoSteps {

	SimulacionCreditoUrlPage simulacionCreditoUrlPage; 
	//SimulacionCreditoValidationStep simulacionCreditoValidationStep;
	
	@Step
	public void ingresar_simulacionCredito() {
		
		simulacionCreditoUrlPage.open();
		
		simulacionCreditoUrlPage.VerificaHome();
			
	}
	
	
}
