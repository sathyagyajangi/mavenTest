package stepdefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = "classpath:sample.feature", glue = "stepdefinations", plugin= {"html:target/test-report.html"})

public class sample {

	
}
