package info.seleniumcucumber;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "json:target/cucumber",
                "html:target/cucumber"
        },
        glue = {"info.seleniumcucumber.steps"},
        features = {"classpath:features/"},
        monochrome = true,
        dryRun = true,
        publish = true
)
public class RunnerTest {
}
