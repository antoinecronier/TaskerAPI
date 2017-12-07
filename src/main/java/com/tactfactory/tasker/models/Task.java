package com.tactfactory.tasker.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.tactfactory.tasker.models.base.BaseEntity;

@Entity
@Table
public class Task extends BaseEntity {

    /** Name of Task. */
    protected String name;

    /** List of Sub-Task. */
    @OneToMany
    protected List<SubTask> subTasks;

    /** Constructor. */
    public Task() {
        this.subTasks = new ArrayList<>();
    }

    public Task(String name) {
        this.subTasks = new ArrayList<>();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Task addSubTask(SubTask subTask) {
        if (!this.hasSubTask(subTask)) {
            this.subTasks.add(subTask);

            // Maintain bi-directional
            if (subTask.getOwner() != this) {
                subTask.setOwner(this);
            }
        }

        return this;
    }

    public Task removeSubTask(SubTask subTask) {
        if (this.hasSubTask(subTask)) {
            this.subTasks.remove(subTask);

            // Maintain bi-directional
            if (subTask.getOwner() == this) {
                subTask.setOwner(null);
            }
        }

        return this;
    }

    public boolean hasSubTask(SubTask subTask) {
        return this.subTasks.contains(subTask);
    }
}
