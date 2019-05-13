package br.com.automation.test.capture_data_director;

import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class CaptureDataDirectorStep {

	CaptureDataDirectorLogic logic = new CaptureDataDirectorLogic();

	@Quando("^que navego na url do google$")
	public void que_navego_na_url_do_google() throws InterruptedException {
		logic.url();
	}
	
	@Quando("^insiro no campo de perquisa 'Joe Russo'$")
	public void insiro_no_campo_de_perquisa_joe_russo() throws Throwable {
		logic.write("Joe Russo");
	}
	
	@Quando("^insiro no campo de perquisa 'Anthony Russo'$")
	public void insiro_no_campo_de_perquisa_anthony_russo() throws Throwable {
		logic.write("Anthony Russo");
	}
	
	@Quando("^insiro no campo de perquisa 'Joss Whedon'$")
	public void insiro_no_campo_de_perquisa_joss_whedon() throws Throwable {
		logic.write("Joss Whedon");
	}

	@Quando("^clico no botão 'Pesquisa Google'$")
	public void clico_no_botão_Pesquisa_Google() throws Throwable {
		logic.clickButtonSearch();
	}

	@Então("^capturo a data de nascimento do diretor 'Joe Russo'$")
	public void capturo_o_nomes_do_diretor_joes() throws Throwable {
		logic.captureDataNascimentoDirector("Joe Russo");
	}
	@Então("^capturo a data de nascimento do 'Anthony Russo'$")
	public void capturo_o_nomes_do_diretor_anthony() throws Throwable {
		logic.captureDataNascimentoDirector("Anthony Russo");
	}
	@Então("^capturo a data de nascimento do 'Joss Whedon'$")
	public void capturo_o_nomes_do_diretor_joss() throws Throwable {
		logic.captureDataNascimentoDirector("Joss Whedon");
	}


}
