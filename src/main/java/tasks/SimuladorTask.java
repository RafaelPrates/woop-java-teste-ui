package tasks;


import org.openqa.selenium.WebDriver;

import appobjects.SimuladorAppObject;

public class SimuladorTask {
	private SimuladorAppObject simulador;
	
	public SimuladorTask(WebDriver driver){
		this.simulador = new SimuladorAppObject(driver);
	}
	
	public void limparFormularioLink(){
		simulador.getLimparFormularioLink().click();
	}
	
	public void simularInvestimento(String valorAplicar	, String valorInvestir, String tempo) {
		simulador.getValorAplicarTextField().sendKeys(valorAplicar);
		simulador.getValorInvestirTextField().sendKeys(valorInvestir);
		simulador.getTempoInvestimentoTextField().sendKeys(tempo);
		simulador.getSimularButton().click();
	}
}
