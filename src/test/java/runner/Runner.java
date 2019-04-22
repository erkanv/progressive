package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
             "html:target/default-cucumber-reports",
              "json:target/cucumber.json"
        },
        features = {"C:\\Users\\vt\\workspaceForEclipseNewerVersions\\progressive\\src\\test\\resources\\features"},
        glue = "stepDefs"
//        , tags = "@progressive"
        , dryRun = false
        
        
)
public class Runner {
}
