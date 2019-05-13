package br.com.automation.dao;

import java.util.List;

import br.com.automation.dto.Director;

public class DirectorDao extends GenericDao<Director> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void save(Director entidade) {
		super.save(entidade);
	}

	@Override
	public void edit(Director entidade) {
		super.edit(entidade);
	}

	@Override
	public List<Director> list(String tabela) {
		return super.list(tabela);
	}

	@Override
	public void remove(Class<Director> persistClass, long id) {
		super.remove(persistClass, id);
	}

	@Override
	public Director find(long id, Class<Director> persistClass) {
		return super.find(id, persistClass);
	}




}
