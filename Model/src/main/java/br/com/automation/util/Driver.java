package br.com.automation.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.automation.page.GooglePage;

public class Driver {

	private WebDriver driver;
	private WebDriverWait wait;
	private static ScreenShot screenShot;
	private GooglePage googlePage;

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public WebDriverWait getWait() {
		return wait;
	}

	public void setWait(WebDriverWait wait) {
		this.wait = wait;
	}

	public GooglePage getGooglePage() {
		return googlePage;
	}

	public void setGooglePage(GooglePage googlePage) {
		this.googlePage = googlePage;
	}

	public static ScreenShot getScreenShot() {
		return screenShot;
	}

	public static void setScreenShot(ScreenShot screen) {
		screenShot = screen;
	}

}
