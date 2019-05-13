package br.com.automation.page;

import org.openqa.selenium.By;

public class GooglePage {
	
	public By fieldSearchHome() { return By.xpath("//input[@name='q']");}
	
	public By buttonSearch() {return By.name("btnK");}
	
	public By fieldSearch() {return By.xpath("//div[@class='a4bIc']//input[@name='q']");}
	
	public By containsNameJoeRusso() { return By.xpath("//div[contains(text(),'Joe Russo')]");}
		
	public By containsNameJossWhedon() {return By.xpath("//div[contains(text(),'Joss Whedon')]");}
	
	public By containsNameAnthonyRusso() {return By.xpath("//div[contains(text(),'Anthony Russo')]");}
	
	public By resultSearch() {return By.xpath("//div[@id='resultStats']");}
	
	public By textDateBirthJoe() {return By.xpath("//span[contains(text(),'(idade 47 anos)')]");}
	
	public By textDateBirthAnthony() {return By.xpath("//span[contains(text(),'(idade 49 anos)')]");}
	
	public By textDateBirthJoss() {return By.xpath("//span[contains(text(),'23 de junho de 1964 (idade 54 anos),')]");}
	
	public By textMovieName() {return By.xpath("//span[contains(text(),'Vingadores:')]");}
	
	public By textMovieYear() {return By.xpath("//span[contains(text(),'2019')]");}
	
	
}
