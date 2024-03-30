package Cucumber;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = "C:\\Users\\Dell\\eclipse-workspace\\CucucmberMarchBatch\\src\\test\\java\\Cucumber\\Login.feature"
, glue = "Cucumber",tags = "@SmokeTest" , plugin = { "pretty", "html:target/cucumber-reports.html" })

/*
 * features = "path of your feature file", glue =
 * "paste ur package where stepdefination is there "
 */

public class RunnerFile {

}
