package stepsdefinitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;

import com.jsmj.cucumber1.calculator.Calculator;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;

public class StepsDefinintion {
	private Integer int1;
    private Integer int2;
    private Integer result;
    
	@Given("I have entered {int} into the calculator")
	public void i_have_entered_into_the_calculator(Integer int1) {
		this.int2 = this.int1;
        this.int1 = int1;
	}

	@When("I press add")
	public void i_press_add() {
		this.result =  Calculator.Add(this.int1, this.int2);
	}
	
	@When("I press multiply")
	public void i_press_multiply() {
	    this.result = Calculator.Multiply(this.int1, this.int2);
	}
	
	@When("I press divide")
	public void i_press_divide() {
	    this.result = Calculator.Divide(this.int1, this.int2);
	}
	
	@Then("the result should be {int} on the screen")
	public void the_result_should_be_on_the_screen(Integer value) {
		//assertEquals(value, this.result);
		System.out.println("El valor es: "+this.result);
		assertEquals(value, this.result);
	}
	
	@After
	public void after(Scenario scenario) {
		//TakesScreenshot ts = (TakesScreenshot) driver;

		//byte[] src = ts.getScreenshotAs(OutputType.BYTES);
		//scenario.attach(src, "image/png", "screenshot");
		
		
	}
	

}
