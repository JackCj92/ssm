package com.ssm.controller;

import com.ssm.entity.Person;
import com.ssm.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping("/showPerson")
    public String showPersons(Model model) {
        List<Person> persons = personService.findAll();
        model.addAttribute("persons", persons);
        return "jsp/showperson";
    }
}
