package br.com.automation.dao;

import java.util.List;

import br.com.automation.dto.Result;

public class ResultDao extends GenericDao<Result>{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5272497369586850927L;


	@Override
	public void save(Result entity) {
		super.save(entity);
	}

	@Override
	public void edit(Result entity) {
		super.edit(entity);
	}

	@Override
	public void remove(Class<Result> persistClass, long id) {
		super.remove(persistClass, id);
	}

	@Override
	public Result find(long id, Class<Result> persistClass) {
		return super.find(id, persistClass);
	}

	@Override
	public List<Result> list(String table) {
		return super.list(table);
	}
	
	

}
