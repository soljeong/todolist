package com.example.todolist;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RequiredArgsConstructor // final이 붙은 속성을 포함하는 생성자를 자동으로 생성
@Controller
public class MainController {

    private final TaskService taskService;

    @GetMapping("/")
    public String index() {
        return "redirect:/list";
    }

    @GetMapping("/list")
    public String list(Model model) {

        List<Task> taskList = this.taskService.getList(); 
        model.addAttribute("taskList", taskList);
        return "list";
    }

    @PostMapping(value="/create")
    public String createTask(@RequestParam String item) {

        this.taskService.create(item);
        return "redirect:/list";
    }
    

}
