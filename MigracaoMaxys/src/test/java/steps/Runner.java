package steps;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        tags = "@Motorista and not @wip",
        publish = true, plugin = {"json:target/cucumber.json"})
public class Runner {
}