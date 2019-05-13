package br.com.automation.test.search_movie;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {
		"src\\test\\java\\br\\com\\automation\\test\\search_movie\\searchMovie.feature" }, glue = {
				"br.com.automation.test.search_movie", "br.com.automation.suiteTests" })
public class SearchMovieTest {

}
