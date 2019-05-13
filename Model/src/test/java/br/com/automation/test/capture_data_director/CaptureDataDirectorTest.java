package br.com.automation.test.capture_data_director;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(	
		
		features = {"src\\test\\java\\br\\com\\automation\\test\\capture_data_director\\CaptureDataDirector.feature" }, 
		glue = {"br.com.automation.test.capture_data_director", "br.com.automation.suiteTests" })

public class CaptureDataDirectorTest {

}
