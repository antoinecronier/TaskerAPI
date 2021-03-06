package com.tactfactory.tasker.dao.interfaces.base;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tactfactory.tasker.models.base.BaseEntity;

@Service
public abstract interface IBaseDAO<T extends BaseEntity> {
	public void create(T item);

	public void delete(T item);

	public List<T> getAll();

	public T getById(Integer id);

	public void update(T item);
}
