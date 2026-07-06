package com.example.firstSpringProject.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.firstSpringProject.model.Student;

@RestController
@RequestMapping("/api/v1/teachers")
public class TeacherController {
    public static void main(String args[]) {
        System.out.println("Hello from main");
    }

    @GetMapping
    public void getAllStudents() {
        System.out.println("Hello from GET");
    }
}
