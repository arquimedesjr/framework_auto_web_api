package br.com.automation.test.search_director;

import br.com.automation.dao.DirectorDao;
import br.com.automation.dto.Director;
import br.com.automation.page.GooglePage;
import br.com.automation.util.UtilTest;

public class SearchDirectorLogic extends UtilTest {

	GooglePage page = new GooglePage();

	public void url() throws InterruptedException {
		setUpUrl("https://www.google.com/");
	}

	public void write() {
		sendKeys(page.fieldSearch(), "diretores dos vingadores");
	}

	public void clickButtonSearch() throws InterruptedException {

		click(page.buttonSearch());

	}

	public void captureNamesDirector() {
		String name = null;
		Director director;
		DirectorDao directorDao = new DirectorDao();

		if (visibility(page.containsNameAnthonyRusso())) {
			name = text(page.containsNameAnthonyRusso());
			director = new Director();
			director.setNome(name);
			directorDao.save(director);

		}
		if (visibility(page.containsNameJoeRusso())) {
			name = text(page.containsNameJoeRusso());
			director = new Director();
			director.setNome(name);
			directorDao.save(director);

		}
		if (visibility(page.containsNameJossWhedon())) {
			name = text(page.containsNameJossWhedon());
			director = new Director();
			director.setNome(name);
			directorDao.save(director);

		}

		getScreenShot().takeScreenShotTest(getInstance());

	}
}
