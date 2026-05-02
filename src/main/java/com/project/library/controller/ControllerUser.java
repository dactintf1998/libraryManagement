package com.project.library.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.project.library.model.User;
import com.project.library.repository.UserRepository;
import com.project.library.service.UserService;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ControllerUser {

    private final UserService userService;

    public ControllerUser(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String homeGet(Model model) {
        List<User> users = this.userService.getAllUsers();
        model.addAttribute("users", users);
        // mv.addObject("users", users);
        return "hello";
    }

    @PostMapping("/")
    public String homePost(@ModelAttribute User user, Model model) {
        user.setAdmin(false);
        user.setActivated(false);
        userService.addUser(user);
        List<User> users = this.userService.getAllUsers();
        model.addAttribute("users", users);
        return "user/greeting";
    }

    @GetMapping("/user/create")
    public String createUser(Model model) {
        model.addAttribute("message", "Welcome to the Library Manager!");
        model.addAttribute("user", new User());
        return "user/create";
    }

    @GetMapping("/user/edit/{id}")
    public String updateUser(@PathVariable Long id, Model model) {

        User updatedUser = this.userService.getUserById(id.intValue());
        model.addAttribute("id", id);
        model.addAttribute("user", updatedUser);
        return "user/edit";
    }

    @GetMapping("/user/delete/{id}")
    public String deleteUser(@PathVariable Long id, Model model) {
        model.addAttribute("id", id);
        User updatedUser = this.userService.getUserById(id.intValue());
        this.userService.deleteUser(updatedUser.getId());
        return "user/greeting";
    }

    @PostMapping("/user/create/greeting")
    public String greetingCreate(@ModelAttribute User user, Model model) {
        user.setAdmin(false);
        user.setActivated(false);
        userService.addUser(user);
        return "user/greeting";
    }

    @PostMapping("/user/edit/greeting/{id}")
    public String greetingUpdate(@PathVariable Long id, @ModelAttribute User user, Model model) {
        User updatedUser = this.userService.getUserById(id.intValue());
        System.out.println(updatedUser.toString());
        userService.updateUser(updatedUser, user);
        List<User> users = this.userService.getAllUsers();
        model.addAttribute("users", users);
        return "user/greeting";
    }
}
