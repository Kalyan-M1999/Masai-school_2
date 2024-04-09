package runnerTestNG;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = {"C:\\Users\\LENOVO\\Documents\\workspace-spring-tool-suite-4-4.22.0.RELEASE\\CucumberTestNG\\CucmberTestNGFrom1\\CucmberTestNGFrom1.feature"},
    glue = {"stepsformatTestNG"} 
)
public class RunnerTestNG extends AbstractTestNGCucumberTests {
}
