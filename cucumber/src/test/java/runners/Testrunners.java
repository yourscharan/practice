package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class) 
@CucumberOptions(
		//format = {"pretty", "json:target/cucumber.json"},
		plugin = {"pretty", "html:target/cucumber.html"},
		//way1 : To run all feature files 
		//features= {"src/test/java/FeatureFiles"}
		//way 2 : Execute one particular feature file
		features= {"D:\\nagneon\\cucumber\\src\\main\\java\\featuresfiles\\login.feature"}
		//Way 3: Execute only one scenarion in feature file
		//features= {"src/test/java/FeatureFiles/Login.feature:15"}
		,glue={"D:\\nagneon\\cucumber\\src\\test\\java\\stepdefs\\stepdefs.java"}
		) 
public class Testrunners {
	
	

}
