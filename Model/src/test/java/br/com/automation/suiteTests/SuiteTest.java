package br.com.automation.suiteTests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import br.com.automation.APIRest.APITest;
import br.com.automation.dao.ResultDao;
import br.com.automation.dto.Result;
import br.com.automation.test.capture_data_director.CaptureDataDirectorTest;
import br.com.automation.test.search_director.SearchDirectorTest;
import br.com.automation.test.search_movie.SearchMovieTest;
import br.com.automation.util.ScreenShot;
import br.com.automation.util.UtilTest;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

@RunWith(Suite.class)
@Suite.SuiteClasses({

		SearchDirectorTest.class, 
		CaptureDataDirectorTest.class, 
		SearchMovieTest.class, 
		APITest.class,

})
public class SuiteTest {


	@Before
	public void before(Scenario scenario) {
		UtilTest.getInstance().setUpDriver();
		ScreenShot.setScenario(scenario.getName());

	}

	@After
	public void after(Scenario scenario) {
		UtilTest.getInstance().close();

		ResultDao dao = new ResultDao();
		Result result = new Result();

		result.setScenario(scenario.getName());
		result.setStatus(scenario.getStatus());

		dao.save(result);

	}



}
