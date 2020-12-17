package com.ssm.controller;

import com.ssm.entity.Person;
import com.ssm.service.PersonService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class PersonController {

    private final PersonService personService;
    //基于构造函数的依赖注入
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @RequestMapping("/showPerson")
    public String showPersons(Model model) {
        List<Person> persons = personService.findAll();
        model.addAttribute("persons", persons);
        return "jsp/showPerson";
    }
}
