package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",
                "html:target/reports/html/cucumber-UrbanicFarm_reports.html",
                "json:target/reports/json/json-reports/cucumber.json",
                "junit:target/reports/xml/xml-report/cucumber.xml",
                "rerun:target/reports/rerun.txt"
        },
        features = "src/test/resources/features",
        glue = "stepDefinitions",



        dryRun = false

       //tags = "@US63_TC001"

)
public class CukesRunner {
}
