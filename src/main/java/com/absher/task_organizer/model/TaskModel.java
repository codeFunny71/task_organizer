package com.absher.task_organizer.model;

import java.util.HashMap;
import java.util.Map;

public class TaskModel {
    Map<String, Integer> tasks = new HashMap<>();


    public Map<String, Integer> getTasks(){
       tasks.put("water flowers", 1);
       tasks.put("weed flowerbed", 2);
       tasks.put("mow lawn", 1);

       return tasks;
    }
}
