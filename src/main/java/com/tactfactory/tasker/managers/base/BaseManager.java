package com.tactfactory.tasker.managers.base;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tactfactory.tasker.dao.interfaces.base.IBaseDAO;
import com.tactfactory.tasker.managers.interfaces.base.IBaseManager;
import com.tactfactory.tasker.models.base.BaseEntity;

@Service
public abstract class BaseManager<T extends BaseEntity> implements IBaseManager<T> {

	@Autowired
	private IBaseDAO<T> dao;

	@Override
	public void create(T item) {
		dao.create(item);
	}

	@Override
	public void delete(T item) {
		dao.delete(item);
	}

	@Override
	public List<T> getAll() {
		return dao.getAll();
	}

	@Override
	public T getById(Integer id) {
		return dao.getById(id);
	}

	@Override
	public void update(T item) {
		dao.update(item);
	}
}
