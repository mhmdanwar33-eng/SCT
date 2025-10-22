package StepDefs;

import com.ecommerce.utils.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setUp() {
        // Initialize WebDriver before each scenario
        DriverFactory.getDriver();
        System.out.println("Browser launched for scenario");
    }

    @After
    public void tearDown() {
        // Close browser after all scenarios
        DriverFactory.quitDriver();
        System.out.println("Browser closed after scenario");
    }
}
