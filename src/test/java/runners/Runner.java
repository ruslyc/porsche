package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/cucumber",
        features = "C:\\Users\\rusly\\IdeaProjects\\porsche\\src\\test\\java\\resources",
        glue = "steps",
        tags = "@porsche",
        dryRun = false


)
public class Runner {


}
