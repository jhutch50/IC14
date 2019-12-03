package com.example.ic14;

public class Task {
    String name, priority, created_time;
    Boolean completed;

    public Task(String name, String priority, String created_time, Boolean completed) {
        this.name = name;
        this.priority = priority;
        this.created_time = created_time;
        this.completed = completed;
    }

    public Task() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getCreated_time() {
        return created_time;
    }

    public void setCreated_time(String created_time) {
        this.created_time = created_time;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }
}

