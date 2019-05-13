package br.com.automation.util;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import br.com.automation.dao.GenericDao;

public class ScreenShot {

	private static ScreenShot sreenShot;
	private static final Logger LOG = Logger.getLogger(GenericDao.class);
	private File diretorio;
	private static String scenario;

	public static ScreenShot getInstace() {

		if (sreenShot == null) {
			sreenShot = new ScreenShot();
		}
		return sreenShot;
	}

	public void takeScreenShotTest(UtilTest driver) {

		Date data = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyhhmmss");
		SimpleDateFormat sdfTwo = new SimpleDateFormat("yyyyMMdd");

		try {
			setDiretorio(new File(".\\src\\test\\resources\\Evidencia\\"));
			File imagem = ((TakesScreenshot) driver.getDriver()).getScreenshotAs(OutputType.FILE);

			if (diretorio.exists()) {
				FileUtils.copyFile(imagem, new File(diretorio.getAbsolutePath() + "//" + getScenario() + "//"
						+ sdfTwo.format(data) + "//" + sdf.format(data) + ".png"));

			} else {
				diretorio.mkdir();
				FileUtils.copyFile(imagem, new File(diretorio.getAbsolutePath() + "//" + getScenario() + "//"
						+ sdfTwo.format(data) + "//" + sdf.format(data) + ".png"));
			}
		} catch (IOException e) {
			LOG.error(e.getMessage());
		}
	}

	public File getDiretorio() {
		return diretorio;
	}

	public void setDiretorio(File diretorio) {
		this.diretorio = diretorio;
	}

	public static String getScenario() {
		return scenario;
	}

	public static void setScenario(String scenario) {
		ScreenShot.scenario = scenario;
	}

}
