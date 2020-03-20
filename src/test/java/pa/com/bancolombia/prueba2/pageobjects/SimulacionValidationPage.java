package pa.com.bancolombia.prueba2.pageobjects;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
//import static org.hamcrest.Matchers.is;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class SimulacionValidationPage extends PageObject{
	
	@FindBy(xpath="//SELECT[@name='comboTipoSimulacion']")
	public WebElementFacade cmbTipoCuota;
	
	@FindBy(name="dateFechaNacimiento")
	public WebElementFacade selectFecha;
	
	@FindBy(xpath="//SELECT[@name='comboTipoTasa']")
	public WebElementFacade cmbTipoTasa;
	
	@FindBy(name="comboTipoProducto")
	public WebElementFacade cmbTipoProducto;
	
	@FindBy(xpath="(//INPUT[@type='text'])[4]")
	public WebElementFacade selectPlazo;
	
	@FindBy(xpath="(//INPUT[@type='text'])[5]")
	public WebElementFacade valorPagar;
	
	@FindBy(xpath="//*[@id=\"sim-detail\"]/form/div[8]/button")
	public WebElementFacade btnSimular;
	
	@FindBy(xpath="//*[@id=\"sim-detail\"]/form/div[2]/div/div/span")
	public WebElementFacade etiquetaInformativa;
	
	
	public void Tipo_Cuota(String datoPrueba) {
		cmbTipoCuota.click();
		cmbTipoCuota.sendKeys(datoPrueba);
	}
	
	public void Select_Fecha(String datoPrueba) {
		selectFecha.click();
		//selectFecha.clear();
		selectFecha.sendKeys(datoPrueba);
	}
	
	public void Tipo_Tasa(String datoPrueba) {
		cmbTipoTasa.click();
		cmbTipoTasa.sendKeys(datoPrueba);
	}
	
	public void Tipo_Producto(String datoPrueba) {
		cmbTipoProducto.click();
		//cmbTipoProducto.sendKeys(datoPrueba);
		//cmbTipoProducto.clear();
		cmbTipoProducto.sendKeys(datoPrueba);
	}
	
	public void Tipo_Plazo(String datoPrueba) {
		selectPlazo.click();
		//cmbTipoProducto.sendKeys(datoPrueba);
		selectPlazo.clear();
		selectPlazo.sendKeys(datoPrueba);
	}
	
	public void Valor_A_Pagar(String datoPrueba) {
		valorPagar.click();
		//cmbTipoProducto.sendKeys(datoPrueba);
		valorPagar.clear();
		valorPagar.sendKeys(datoPrueba);
	}
	
	public void Simular() {
		btnSimular.click();
		btnSimular.sendKeys();
	}
	
	public void form_sin_errores() {
		assertThat(etiquetaInformativa.isCurrentlyVisible(), is(false));
	}
	
	public void form_con_errores() {
		assertThat(etiquetaInformativa.isCurrentlyVisible(), is(true));
	}
}
