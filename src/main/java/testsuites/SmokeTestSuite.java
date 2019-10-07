package testsuites;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import framework.Report;
import testcases.SimuladorInvestimentoPoupancaTestCase;

@RunWith(Suite.class)
@SuiteClasses({
	SimuladorInvestimentoPoupancaTestCase.class
})
public class SmokeTestSuite {
	
	@BeforeClass
	public static void initTest() {
		Report.create("Simulador de Investimaneto Poupanca", "Suite de SmokeTest");
	}

	@AfterClass
	public static void endTest() {
		Report.close();
	}

}
