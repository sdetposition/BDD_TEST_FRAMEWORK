package hooks;

import io.cucumber.core.backend.ScenarioScoped;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class Hooks {
	
	@BeforeAll
	public static void beforeAll() {
		System.out.println("===> Before All");
	}
	
	@AfterAll
	public static void afterAll() {
		System.out.println("===> After All");
	}
	
	@Before
	public void before() {
		System.out.println("==> Before");
	}
	
	@After
	public void after() {
		System.out.println("==> After");
	}
	
	@BeforeStep
	public void eachStepBefore() {
		System.out.println("=> Before Each Step");
	}
	
	@AfterStep
	public void eachStepAfter() {
		System.out.println("=> After Each Step");
	}
	
	public void stepAround(Scenario scenario, ScenarioScoped ss) {
		
	}

}
