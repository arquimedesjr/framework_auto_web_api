package br.com.automation.test.search_director;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {
		"src\\test\\java\\br\\com\\automation\\test\\search_director\\searchDirector.feature" }, glue = {
				"br.com.automation.test.search_director", "br.com.automation.suiteTests" })
public class SearchDirectorTest {

}
