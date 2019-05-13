package br.com.automation.test.search_director;

import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class SearchDirectorStep {

	SearchDirectorLogic logic = new SearchDirectorLogic();

	@Quando("^que navego na url do google$")
	public void que_navego_na_url_do_google() throws InterruptedException {
		logic.url();
	}
	
	@Quando("^insiro no campo de perquisa 'diretor do vingadores'$")
	public void insiro_no_campo_de_perquisa_diretor_do_vingadores() throws Throwable {
		logic.write();
	}

	@Quando("^clico no botão 'Pesquisa Google'$")
	public void clico_no_botão_Pesquisa_Google() throws Throwable {
		logic.clickButtonSearch();
	}

	@Então("^capturo o nomes do diretores$")
	public void capturo_o_nomes_do_diretores() throws Throwable {
		logic.captureNamesDirector();
	}


}
