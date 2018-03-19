package com.luv2code.springsecurity.demo.controller;

import com.luv2code.springsecurity.demo.model.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
public class RegistrationController {

    @RequestMapping("/")
    public String registration(Model model){
        model.addAttribute("customer", new Customer());
        return "registration";

    }

    @RequestMapping("/registrationValidator")
    public String registrationValidator(@ModelAttribute("customer") Customer cusotmer){
        System.out.println("customer : " + cusotmer.getGender());
        return "confirmation";
    }

    @ModelAttribute("ActiveList")
    public Map<String, String> getActiveList() {
        Map<String, String> activeList = new HashMap<>();
        activeList.put("HA", "Highly Active");
        activeList.put("MA", "Medium Active");
        activeList.put("LA", "Low Active");
        return activeList;
    }

    @ModelAttribute("GenderList")
    public Map<String, String> getGenderList() {
        Map<String, String> genderList = new HashMap<>();
        genderList.put("M", "Male");
        genderList.put("F", "Female");
        genderList.put("O", "Other");
        return genderList;
    }

}
