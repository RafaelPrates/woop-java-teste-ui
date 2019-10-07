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
	
	public void preencherDadosInvestimento(String valorAplicar	, String valorInvestir, String tempo) {
		simulador.getValorAplicarTextField().sendKeys(valorAplicar);
		simulador.getValorInvestirTextField().sendKeys(valorInvestir);
		simulador.getTempoInvestimentoTextField().sendKeys(tempo);
	}
	
	public void prosseguirSimulacao(){
		simulador.getSimularButton().click();
	}
	
	public void alterarUnidadeDeTempo(){
		simulador.getTempoSelect().click();
		simulador.getUnidadeTempoAnos().click();
	}
}
