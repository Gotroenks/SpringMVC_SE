package com.example.softwareengineering.controller;

import com.example.softwareengineering.models.peoples;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/viewpeoples")
public class peoplesController {

    private final List<peoples> peoples = new ArrayList<>();

    peoplesController() {
        peoples.add(new peoples("Claudinho", "Professor", 25));
        peoples.add(new peoples("Richards", "C sharpeiro", 20));
        peoples.add(new peoples("Marcurinha", "Estudante", 18));
        peoples.add(new peoples("Bianquinha", "Pai tonzera", 20));
        peoples.add(new peoples("Vini", "Pai tonzero", 23));
        peoples.add(new peoples("Isaaquito", "Javeiro", 22));
    }

    @GetMapping
    private String allPeoples(Model model) {
        model.addAttribute("peoples", peoples);
        return "peoples";
    }
}
