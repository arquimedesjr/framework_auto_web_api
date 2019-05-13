package br.com.automation.util;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.automation.page.GooglePage;

public class UtilTest extends Driver {
	private static final Logger LOG = Logger.getLogger(UtilTest.class);

	private static UtilTest util;

	public static UtilTest getInstance() {
		if (util == null) {
			util = new UtilTest();
			setScreenShot(new ScreenShot());
		}

		return util;
	}

	public void setUpDriver() {
		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\driver\\chromedriver.exe");
		setDriver(new ChromeDriver());
		getDriver().manage().window().maximize();

		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		setGooglePage(PageFactory.initElements(getDriver(), GooglePage.class));
		setWait(new WebDriverWait(getDriver(), 30));

	}

	public void setUpUrl(String string) throws InterruptedException {
		Thread.sleep(5_00);
		getInstance().getDriver().get(string);
	}

	public void timeouts(By locator) {
		getInstance().getWait().until(ExpectedConditions.visibilityOfElementLocated(locator));

	}

	public void click(By by) {
		try {
			getInstance().timeouts(by);
			getInstance().getDriver().findElement(by).click();
		} catch (Exception e) {
			LOG.error(e.getMessage());
		}
	}

	public void sendKeys(By by, String string) {
		try {
			getInstance().timeouts(by);
			getInstance().getDriver().findElement(by).sendKeys(string);
		} catch (Exception e) {
			LOG.error(e.getMessage());
		}
	}

	public String findElementText(By by) {
		String texto = null;
		try {
			getInstance().timeouts(by);
			texto = getDriver().findElement(by).getText();
		} catch (Exception e) {
			LOG.error(e.getMessage());
		}
		return texto;
	}

	public boolean visibility(By locator) {
		boolean status = getInstance().getWait().until(ExpectedConditions.visibilityOfElementLocated(locator))
				.isDisplayed();		
		return status;
	}

	public String text(By by) {
		getInstance().timeouts(by);
		String text = getInstance().getDriver().findElement(by).getText();
		return text;
	}

	public void close() {
		getInstance().getDriver().close();
	}

	

}
