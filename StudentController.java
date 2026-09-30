package com.example.app.controller;

import com.example.app.model.Student;
import com.example.app.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentController {
    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("student", new Student());
        model.addAttribute("students", service.getAllStudents());
        return "index";
    }

    @PostMapping("/students/save")
    public String save(@ModelAttribute Student student) {
        service.saveStudent(student);
        return "redirect:/";
    }

    @GetMapping("/students/delete/{id}")
    public String delete(@PathVariable Long id) {
        service.deleteStudent(id);
        return "redirect:/";
    }
}
