package com.tactfactory.tasker.dao.base;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tactfactory.tasker.dao.interfaces.base.IBaseDAO;
import com.tactfactory.tasker.models.base.BaseEntity;

@Service
@Transactional
public abstract class BaseDAO<T extends BaseEntity> implements IBaseDAO<T> {

	@PersistenceContext
	protected EntityManager entityManager;

	/* (non-Javadoc)
	 * @see com.tactfactory.tasker.dao.interfaces.base.IBaseDAO#create(com.tactfactory.tasker.models.base.BaseEntity)
	 */
	@Override
	public void create(T item) {
		entityManager.persist(item);
	}

	/* (non-Javadoc)
	 * @see com.tactfactory.tasker.dao.interfaces.base.IBaseDAO#delete(com.tactfactory.tasker.models.base.BaseEntity)
	 */
	@Override
	public void delete(T item) {
		entityManager.detach(item);
	}

	/* (non-Javadoc)
	 * @see com.tactfactory.tasker.dao.interfaces.base.IBaseDAO#update(com.tactfactory.tasker.models.base.BaseEntity)
	 */
	@Override
	public void update(T item) {
		entityManager.merge(item);
	}
}
