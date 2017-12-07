package com.tactfactory.tasker.dao;

import java.util.List;

import com.tactfactory.tasker.dao.base.BaseDAO;
import com.tactfactory.tasker.dao.interfaces.ISubTaskDAO;
import com.tactfactory.tasker.models.SubTask;

public class SubTaskDAO extends BaseDAO<SubTask> implements ISubTaskDAO {

	@SuppressWarnings("unchecked")
	@Override
	public List<SubTask> getAll() {
		return entityManager.createQuery("SELECT st FROM SubTask st").getResultList();
	}

	@Override
	public SubTask getById(Integer id) {
		return entityManager.find(SubTask.class, id);
	}
}
