package br.com.automation.test.search_movie;

import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class SearchMovieStep {

	SearchMovieLogic logic = new SearchMovieLogic();

	@Quando("^que navego na url do google$")
	public void que_navego_na_url_do_google() throws InterruptedException {
		logic.url();
	}

	@Quando("^insiro no campo de perquisa 'Joe Russo filmes'$")
	public void insiro_no_campo_de_perquisa_joe_russo() throws Throwable {
		logic.write("Joe Russo filmes");
	}

	@Quando("^insiro no campo de perquisa 'Anthony Russo filmes'$")
	public void insiro_no_campo_de_perquisa_anthony_russo() throws Throwable {
		logic.write("Anthony Russo filmes");
	}

	@Quando("^insiro no campo de perquisa 'Joss Whedon filmes'$")
	public void insiro_no_campo_de_perquisa_joss_whedon() throws Throwable {
		logic.write("Joss Whedon filmes");
	}

	@Quando("^clico no botão 'Pesquisa Google'$")
	public void clico_no_botão_Pesquisa_Google() throws Throwable {
		logic.clickButtonSearch();
	}

	@Então("^capturo a data de lancamento do filme do diteror$")
	public void capturo_o_nomes_do_diretor_joes() throws Throwable {
		logic.captureDateLaunch("Joe Russo");
	}

}
