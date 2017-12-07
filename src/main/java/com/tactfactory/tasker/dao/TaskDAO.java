package com.tactfactory.tasker.dao;

import java.util.List;

import com.tactfactory.tasker.dao.base.BaseDAO;
import com.tactfactory.tasker.dao.interfaces.ITaskDAO;
import com.tactfactory.tasker.models.Task;

public class TaskDAO extends BaseDAO<Task> implements ITaskDAO {

	@SuppressWarnings("unchecked")
	@Override
	public List<Task> getAll() {
		return entityManager.createQuery("SELECT st FROM Task st").getResultList();
	}

	@Override
	public Task getById(Integer id) {
		return entityManager.find(Task.class, id);
	}
}
