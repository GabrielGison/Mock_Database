package co.develhope.mockdb.controllers;

import co.develhope.mockdb.entities.Student;
import co.develhope.mockdb.services.StudentSe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {


    @Autowired
    private StudentSe studentSe;


    @GetMapping
    private String welcomeMsg(){
        return "Welcome to the mockDB server";
    }

    @GetMapping("/students")
    public List<Student> listAllSongs() {
        return studentSe.listAllStudent();
    }

    @PostMapping("/students")
    public void add(@RequestParam String firstName,
                    @RequestParam String lastName,
                    @RequestParam String email) {}
}
