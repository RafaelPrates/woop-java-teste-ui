package verificationpoints;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import framework.Report;
import framework.ScreenShot;

public class SimuladorVerificationPoint {

	private static final String VALOR_SIMULACAO_FELIZ = "R$ 129.466";
	private static final String VALOR_SIMULACAO_FELIZ_ANOS = "R$ 5.057.373";
	private static final String MENSAGEM_SIMULACAO_VAZIO = "Valor mínimo de 20.00";
	
	private WebDriver driver;
	
	public SimuladorVerificationPoint(WebDriver driver) {
		this.driver = driver;
	}
	
	public void verificarValorSimuladoCaminhoFeliz() {
		if(this.paginaContem(VALOR_SIMULACAO_FELIZ)) {
			Report.log(Status.PASS, "O valor esta correto.", ScreenShot.capture(driver));
		} else {
			Report.log(Status.FAIL, "O valor correto nao foi encontrado.", ScreenShot.capture(driver));
		}
	}
	
	public void verificarValorSimuladoCaminhoFelizAlterando() { //TODO Refatorar para receber unidade
		if(this.paginaContem(VALOR_SIMULACAO_FELIZ_ANOS)) {
			Report.log(Status.PASS, "O valor esta correto.", ScreenShot.capture(driver));
		} else {
			Report.log(Status.FAIL, "O valor correto nao foi encontrado.", ScreenShot.capture(driver));
		}
	}
	
	public void verificarValoresInvalidos() {
		if(this.paginaContem(MENSAGEM_SIMULACAO_VAZIO)) {
			Report.log(Status.PASS, "A mensagem de erro foi exibida", ScreenShot.capture(driver));
		} else {
			Report.log(Status.FAIL, "A mensagem de erro não foi exibida", ScreenShot.capture(driver));
		}	
	}

	private boolean paginaContem(String valor){
		return this.driver.getPageSource().contains(valor);
	}
}
