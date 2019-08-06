package com.absher.task_organizer.controller;

import com.absher.task_organizer.model.TaskModel;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class GreetingController {

    // inject via application.properties
    @Value("${welcome.message}")
    private String message;

    //private List<String> tasks = Arrays.asList("a", "b", "c", "d", "e", "f", "g");
    private TaskModel tasks = new TaskModel();

    @GetMapping("/")
    public String main(Model model) {
        model.addAttribute("message", message);
        model.addAttribute("tasks", tasks.getTasks().entrySet());

        return "index"; //view
    }

    // /hello?name=kotlin
    @GetMapping("/hello")
    public String mainWithParam(
            @RequestParam(name = "name", required = false, defaultValue = "")
                    String name, Model model) {

        model.addAttribute("message", name + message);

        return "index"; //view
    }

    @RequestMapping("/")
    public String index(){
        return "Greetings from Spring Boot!";
    }
}
