package com.project.library.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.project.library.domain.User;
import com.project.library.service.UserService;

@Controller
public class ControllerUser {

    private final UserService userService;

    public ControllerUser(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String homeGet(Model model) {
        model.addAttribute("users", this.userService.getAllUsers());
        return "hello";
    }

    @GetMapping("/user/create")
    public String createUser(Model model) {
        model.addAttribute("message", "Welcome to the Library Manager!");
        model.addAttribute("user", new User());
        return "user/create";
    }

    @PostMapping("/user/create")
    public String greetingCreate(@ModelAttribute User user, Model model) {
        userService.addUser(user);
        return "redirect:/";
    }

    @GetMapping("/user/edit/{id}")
    public String updateUser(@PathVariable Long id, Model model) {
        model.addAttribute("id", id);
        model.addAttribute("user", this.userService.getUserById(id));
        return "user/edit";
    }

    @GetMapping("/user/delete/{id}")
    public String deleteUser(@PathVariable Long id, Model model) {
        model.addAttribute("id", id);
        this.userService.deleteUser(this.userService.getUserById(id).getUserId());
        return "redirect:/";
    }

    @PostMapping("/user/edit/{id}")
    public String greetingUpdate(@PathVariable Long id, @ModelAttribute User user, Model model) {
        userService.updateUser(this.userService.getUserById(id.intValue()), user);
        model.addAttribute("users", this.userService.getAllUsers());
        return "redirect:/";
    }
}
