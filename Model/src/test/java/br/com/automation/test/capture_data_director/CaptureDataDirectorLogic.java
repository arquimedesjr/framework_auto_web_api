package br.com.automation.test.capture_data_director;

import java.util.Date;
import java.util.List;

import br.com.automation.dao.DirectorDao;
import br.com.automation.dto.Director;
import br.com.automation.page.GooglePage;
import br.com.automation.util.UtilTest;

public class CaptureDataDirectorLogic extends UtilTest {

	String string = null;

	GooglePage page = new GooglePage();

	public void url() throws InterruptedException {
		setUpUrl("https://www.google.com/");
	}

	public void write(String string) {
		sendKeys(page.fieldSearch(), string);
		this.string = string;
	}

	public void clickButtonSearch()  {

		click(page.buttonSearch());

	}

	@SuppressWarnings("deprecation")
	public void captureDataNascimentoDirector(String string) {
		Integer id = null;
		String text = null;
		String name = null;
		int day=0;
		int month = 0;
		int year=0;

		DirectorDao directorDao = new DirectorDao();
		List<Director> directors = directorDao.list("DIRETOR");

		for (Director director : directors) {
			if (string.equals(director.getNome())) {

				if (string.equals("Joe Russo")) {
					text = text(page.textDateBirthJoe());
					day = Integer.parseInt(text.substring(0, 1));
					year = Integer.parseInt(text.substring(14, 18));

				}
				if (string.equals("Anthony Russo")) {
					text = text(page.textDateBirthAnthony());
					day = Integer.parseInt(text.substring(0, 1));
					year = Integer.parseInt(text.substring(18, 22));

				}
				if (string.equals("Joss Whedon")) {
					text = text(page.textDateBirthJoss());
					day = Integer.parseInt(text.substring(0, 1));
					year = Integer.parseInt(text.substring(15, 19));

				}
				id = director.getId();
				name = director.getNome();

				System.out.println(text);


				if (text.contains("fevereiro")) {
					month = 03;
				} else if (text.contains("junho")) {
					month = 06;
				} else if (text.contains("julho")) {
					month = 07;
				}

				director.setId(id);
				director.setNome(name);
				director.setDataNascimento(new Date(day, month, year));
				directorDao.edit(director);
				getScreenShot().takeScreenShotTest(getInstance());
				break;
			}
		}
	}

}
