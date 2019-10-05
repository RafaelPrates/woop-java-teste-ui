package appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SimuladorAppObject {
	private WebDriver driver;
	
	public SimuladorAppObject(WebDriver driver){
		this.driver = driver;
	}
	
	public WebElement getValorAplicarTextField(){		
		return driver.findElement(By.id("valorAplicar"));
	}
	
	public WebElement getValorInvestirTextField(){		
		return driver.findElement(By.id("valorInvestir"));
	}
	
	public WebElement getTempoInvestimentoTextField(){		
		return driver.findElement(By.id("tempo"));
	}
	
	public WebElement getSimularButton(){		
		return driver.findElement(By.className("btnSimular"));
	}
	
	public WebElement getLimparFormularioLink(){		
		return driver.findElement(By.partialLinkText("Limpar formulário"));
	}
}
