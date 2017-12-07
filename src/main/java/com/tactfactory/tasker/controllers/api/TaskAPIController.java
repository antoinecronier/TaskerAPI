package com.tactfactory.tasker.controllers.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tactfactory.tasker.controllers.base.BaseController;
import com.tactfactory.tasker.models.Task;

@RestController
@RequestMapping("/tasks/")
public class TaskAPIController extends BaseController<Task> {

	protected TaskAPIController() {
		super(Task.class);
	}

}
