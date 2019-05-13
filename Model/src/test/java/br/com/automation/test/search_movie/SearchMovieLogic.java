package br.com.automation.test.search_movie;

import org.openqa.selenium.By;

import br.com.automation.dao.MovieDao;
import br.com.automation.dto.Movie;
import br.com.automation.page.GooglePage;
import br.com.automation.util.UtilTest;

public class SearchMovieLogic extends UtilTest {

	GooglePage page = new GooglePage();

	public void url() throws InterruptedException {
		setUpUrl("https://www.google.com/");
	}

	public void write(String string) {
		sendKeys(page.fieldSearch(), string);
	}

	public void clickButtonSearch() throws InterruptedException {
		click(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@name='btnK']"));
	}

	public void captureDateLaunch(String string) {
		String name = null;
		String year = null;

		MovieDao movieDao = new MovieDao();
		Movie movie = new Movie();

			if (string.contains("Joe Russo")) {
				name = text(page.textMovieName());
				year = text(page.textMovieYear());

			}
			if (string.contains("Anthony Russo")) {
				name = text(page.textMovieName());
				year = text(page.textMovieYear());

			}
			if (string.contains("Joss Whedon")) {
				name = text(page.textMovieName());
				year = text(page.textMovieYear());

			}
			
			if(year.contains("2019")) {
				year = "2019";
			}

			if (name != null) {
				movie.setNome(name);
				movie.setAnoLancamento(year);
				movieDao.save(movie);
				getScreenShot().takeScreenShotTest(getInstance());
		}
	}
}
