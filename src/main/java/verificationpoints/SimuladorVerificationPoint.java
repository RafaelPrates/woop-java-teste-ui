package verificationpoints;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import framework.Report;
import framework.ScreenShot;

public class SimuladorVerificationPoint {

	private static final String VALOR_SIMULACAO_FELIZ = "R$ 129.466";
	
	private WebDriver driver;
	
	public SimuladorVerificationPoint(WebDriver driver) {
		this.driver = driver;
	}
	
	public void verificarValorSimuladoCaminhoFeliz() {
		if(this.paginaContem(VALOR_SIMULACAO_FELIZ)) {
			Report.log(Status.PASS, "O valor está correto.", ScreenShot.capture(driver));
		} else {
			Report.log(Status.FAIL, "O valor correto não foi encontrado.", ScreenShot.capture(driver));
		}
	}
	
	public void verificarValoresInvalidos() {
			Report.log(Status.FAIL, "O teste não passou.", ScreenShot.capture(driver));
	}

	private boolean paginaContem(String valor){
		return this.driver.getPageSource().contains(valor);
	}
}
