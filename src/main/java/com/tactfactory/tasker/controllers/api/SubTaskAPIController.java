package com.tactfactory.tasker.controllers.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tactfactory.tasker.controllers.base.BaseController;
import com.tactfactory.tasker.models.SubTask;

@RestController
@RequestMapping("/subtasks/")
public class SubTaskAPIController extends BaseController<SubTask> {

	protected SubTaskAPIController() {
		super(SubTask.class);
	}

}