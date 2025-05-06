package com.example.demo.repo;
////package com.example.demo.controller;
//
//import com.example.demo.model.Person;
//import com.example.demo.repo.PersonRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api")
//public class UserDetailsController {
//
//    @Autowired
//    private PersonRepo userDetailsRepo;
//
//    @GetMapping("/userdetails")
//    public List<Person> getAllUsers() {
//        return PersonRepo.findAll();
//    }
//}

//package com.example.demo.controller;

import com.example.demo.model.UserDetails;
import com.example.demo.repo.UserDetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class UserDetailsController {

    @Autowired
    private UserDetailsRepo userDetailsRepo;

    @GetMapping("/userdetails")
    public List<UserDetails> getAllUsers() {
        return userDetailsRepo.findAll();
    }
 // ✅ POST request to insert a new user
    @PostMapping("/userdetails")
    public UserDetails addUser(@RequestBody UserDetails user) {
        return userDetailsRepo.save(user);
    }
//    @DeleteMapping("/userdetails/{id}")
//    public void deleteUserById(@PathVariable Long id) {
//        userDetailsRepo.deleteById(id);
//        }
}
