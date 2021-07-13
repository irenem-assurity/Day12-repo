package calculator;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class CalculatorSteps {
    private int result;





    @Then("the answer is {int}")
    public void theAnswerIs(int arg0) {
        assertEquals(arg0, result);


    }

    @When("I calculate {int} + {int}")
    public void iCalculate(int arg0, int arg1) {
        result=arg0+arg1;
    }
}
