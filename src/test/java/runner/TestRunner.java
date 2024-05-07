package runner;

import base.TestBase;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features/F01_Register.feature",
        glue = "steps"
)
public class TestRunner extends TestBase {
}
