package pa.com.bancolombia.prueba2.definition;

import java.util.List;
import pa.com.bancolombia.prueba2.steps.SimulacionCreditoSteps;
import pa.com.bancolombia.prueba2.steps.SimulacionValidationSteps;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
//import pa.com.bancolombia.prueba2.pageobjects.SimulacionValidationPage;


public class SimulacionCreditoDefinition {
	
	@Steps
	SimulacionCreditoSteps simulacionCreditoSteps;
	@Steps
	SimulacionValidationSteps simulacionValidationSteps;

	@Given("^Selecciona la opción simula tu cuota$")
	public void selecciona_la_opción_simula_tu_cuota() {
		simulacionCreditoSteps.ingresar_simulacionCredito();
	}

	@When("^Ingresa los criterios solicitados$")
	public void ingreso_los_criterios_solicitados(DataTable dtDatosForm) {
		List<List<String>> data = dtDatosForm.raw();	
		
		for(int i = 1; i<data.size(); i++) {
			simulacionValidationSteps.diligenciar_validacion_datos_tabla(data, i);
			
			try {
				Thread.sleep(5000);
			}catch(InterruptedException e) {}
		}
		
		
	}

	@Then("^El sistema calcula la cuota del prestamo solicitado$")
	public void el_sistema_calcula_la_cuota_del_prestamo_solicitado() {
		simulacionValidationSteps.verificar_ingreso_datos_formulario_exitoso();
	}
	
	@Then("^Verificar que se presente Etiqueta Informativa de validación requerida$")
	public void verificar_que_se_presente_Etiqueta_Informativa_de_validación_requerida() {
		simulacionValidationSteps.verificar_ingreso_datos_formulario_con_errores();
	}
}
