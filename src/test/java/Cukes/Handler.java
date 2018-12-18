package Cukes;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;


@RunWith(Cucumber.class)
@ContextConfiguration(classes = SpringConfigurator.class)
@CucumberOptions(
        features = {"src\\test\\java\\Cukes\\Tests.feature"},
        format = {"pretty","html:target/reports","json:target/cucumber.json"},
        glue = {"Cukes"}

)
public class Handler {
}
