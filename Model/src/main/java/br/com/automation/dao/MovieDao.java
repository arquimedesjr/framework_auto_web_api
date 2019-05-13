package br.com.automation.dao;

import java.util.List;

import br.com.automation.dto.Movie;

public class MovieDao extends GenericDao<Movie> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void save(Movie entidade) {
		super.save(entidade);
	}

	@Override
	public void edit(Movie entidade) {
		super.edit(entidade);
	}


	@Override
	public List<Movie> list(String tabela) {
		return super.list(tabela);
	}


	

}
