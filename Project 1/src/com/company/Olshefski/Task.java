package com.company.Olshefski;

public class Task implements Comparable<Task>{
    private String name;
    private String description;
    private Integer priority;

    public Task(String name, String description, int priority) {
        this.name = name;
        this.description = description;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", priority=" + priority +
                '}';
    }

    //Used from compare to
    @Override
    public int compareTo(Task o) {

        int compareResult = this.name.compareTo(o.name);
        compareResult = this.priority.compareTo(o.priority);
        // if this = "o" (other) return 0
        // if this > "o" (other) return 1
        // if this < "o" (other) return -1

        return compareResult;

    }

}

