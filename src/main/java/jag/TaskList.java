package jag;

import java.util.ArrayList;

public class TaskList {
    ArrayList<Task> tasks;
    Storage storage;
    int size;

    public TaskList(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }
    public TaskList() {
        this.tasks = new ArrayList<>();
        this.size = 0;
    }
    public void addTask(Task task) {
        this.tasks.add(task);
    }

    public Task getTask(int index) {
        return this.tasks.get(index);
    }

    public void deleteTask(int index) {
        this.tasks.remove(index);
    }

    public int size() {
        return this.tasks.size();
    }

}
