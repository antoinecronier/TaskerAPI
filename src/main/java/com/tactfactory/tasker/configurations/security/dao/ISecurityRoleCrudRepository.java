package com.tactfactory.tasker.configurations.security.dao;

import org.springframework.data.repository.CrudRepository;

import com.tactfactory.tasker.configurations.security.models.SecurityRole;

public interface ISecurityRoleCrudRepository extends CrudRepository<SecurityRole, Integer> {

}
