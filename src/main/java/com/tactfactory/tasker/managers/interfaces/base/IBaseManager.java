package com.tactfactory.tasker.managers.interfaces.base;

import java.util.List;

import com.tactfactory.tasker.models.base.BaseEntity;

public interface IBaseManager<T extends BaseEntity> {
	public void create(T item);

	public void delete(T item);

	public List<T> getAll();

	public T getById(Integer id);

	public void update(T item);
}
