package pa.com.bancolombia.prueba2.steps;

import net.thucydides.core.annotations.Step;
import pa.com.bancolombia.prueba2.pageobjects.SimulacionValidationPage;

//import static org.hamcrest.MatcherAssert.assertThat; 
//import static org.hamcrest.Matchers.*;

import java.util.List; 

public class SimulacionValidationSteps {
	
	SimulacionValidationPage simulacionValidationPage;
	
	@Step
	public void diligenciar_validacion_datos_tabla(List<List<String>> data, int id) {
		simulacionValidationPage.Tipo_Cuota(data.get(id).get(0).trim());
		simulacionValidationPage.Select_Fecha(data.get(id).get(1).trim());
		simulacionValidationPage.Tipo_Tasa(data.get(id).get(2).trim());
		simulacionValidationPage.Tipo_Producto(data.get(id).get(3).trim());
		simulacionValidationPage.Tipo_Plazo(data.get(id).get(4).trim());
		simulacionValidationPage.Valor_A_Pagar(data.get(id).get(5).trim());
		simulacionValidationPage.Simular();
	}
	
	@Step
	public void verificar_ingreso_datos_formulario_exitoso() {
		simulacionValidationPage.form_sin_errores();
	}
	
	@Step
	public void verificar_ingreso_datos_formulario_con_errores() {
		simulacionValidationPage.form_con_errores();
	}
}
