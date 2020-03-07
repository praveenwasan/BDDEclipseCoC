package runnerPackage;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"C:/Users/PraveenVasan/workspace/FreeCrmBDDFramework/src/main/java/features/login.feature"}
		,glue={"src/main/java/stepDefinition"}
		//,format={"pretty","html:test-outout"}
		)

public class TestRunner{
}
