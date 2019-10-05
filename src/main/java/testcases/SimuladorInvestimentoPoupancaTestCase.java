package testcases;

import framework.Drivers;
import framework.Report;
import framework.ScreenShot;
import tasks.SimuladorTask;
import verificationpoints.SimuladorVerificationPoint;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SimuladorInvestimentoPoupancaTestCase {
	private WebDriver driver;
	
	private SimuladorTask simuladorPage;
	private SimuladorVerificationPoint verificationPoint;
	
	@Before
	public void setUp() {
		Report.startTest("Simulador de Investimento Poupanca");
		driver = Drivers.getFirefoxDriver();
		
		simuladorPage = new SimuladorTask(driver);
		verificationPoint = new SimuladorVerificationPoint(driver);
	}
	
	@Test
	public void testeCaminhoFeliz() {
		driver.get("https://www.sicredi.com.br/html/ferramenta/simulador-investimento-poupanca/");
		driver.manage().window().maximize();

		Report.log(Status.INFO, "Site foi carregado", ScreenShot.capture(driver));

		simuladorPage.simularInvestimento("2000", "2000", "58");
		Report.log(Status.INFO, "Dados inseridos no formulario.", ScreenShot.capture(driver));

		verificationPoint.verificarValorSimuladoCaminhoFeliz();
	}	

	@Test
	public void testeValoresInvalidos() {
		driver.get("https://www.sicredi.com.br/html/ferramenta/simulador-investimento-poupanca/");
		driver.manage().window().maximize();

		Report.log(Status.INFO, "Site foi carregado", ScreenShot.capture(driver));

		simuladorPage.simularInvestimento("0", "0", "0");
		Report.log(Status.INFO, "Dados inseridos no formulario.", ScreenShot.capture(driver));

		verificationPoint.verificarValorSimuladoCaminhoFeliz();
	}	
	@After
	public void tearDown() {
		driver.close();
	}
}
