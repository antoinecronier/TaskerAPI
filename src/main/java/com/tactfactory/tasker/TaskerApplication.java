package com.tactfactory.tasker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.tactfactory.tasker.dao.SubTaskDAO;
import com.tactfactory.tasker.dao.TaskDAO;
import com.tactfactory.tasker.dao.interfaces.ISubTaskDAO;
import com.tactfactory.tasker.dao.interfaces.ITaskDAO;
import com.tactfactory.tasker.managers.SubTaskManager;
import com.tactfactory.tasker.managers.TaskManager;
import com.tactfactory.tasker.managers.interfaces.ISubTaskManager;
import com.tactfactory.tasker.managers.interfaces.ITaskManager;

@SpringBootApplication
public class TaskerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskerApplication.class, args);
	}

	@Bean
	public ITaskDAO getTaskDAO(){
		return new TaskDAO();
	}

	@Bean
	public ISubTaskDAO getSubTaskDAO(){
		return new SubTaskDAO();
	}

	@Bean
	public ITaskManager getTaskManager(){
		return new TaskManager();
	}

	@Bean
	public ISubTaskManager getSubTaskManager(){
		return new SubTaskManager();
	}
}
