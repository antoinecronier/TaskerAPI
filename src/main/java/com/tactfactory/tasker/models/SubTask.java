package com.tactfactory.tasker.models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.tactfactory.tasker.models.base.BaseEntity;

@Entity
@Table
public class SubTask extends BaseEntity {

    /** Name of Sub-Task. */
    protected String name;

    /** Task owner. */
    @ManyToOne
    protected Task owner;

    public SubTask() {
    }

    public SubTask(String name, Task task) {
        this.name = name;
        this.setOwner(task);
    }

    public String getName() {
        return name;
    }

    public SubTask setName(String name) {
        this.name = name;

        return this;
    }

    public Task getOwner() {
        return owner;
    }

    public SubTask setOwner(Task owner) {
        this.owner = owner;

        if (!owner.hasSubTask(this)) {
            owner.addSubTask(this);
        }

        return this;
    }
}
