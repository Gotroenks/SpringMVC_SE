package com.example.softwareengineering.controller;

import com.example.softwareengineering.models.peoples;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/peoples")
public class peoplesRestController {

    private final List<com.example.softwareengineering.models.peoples> peoples = new ArrayList<>();

    peoplesRestController() {
        peoples.add(new peoples("Claudinho", "Professor", 25));
        peoples.add(new peoples("Richards", "C sharpeiro", 20));
        peoples.add(new peoples("Marcurinha", "Estudante", 18));
        peoples.add(new peoples("Bianquinha", "Pai tonzera", 20));
        peoples.add(new peoples("Vini", "Pai tonzero", 23));
        peoples.add(new peoples("Isaaquito", "Javeiro", 22));
    }

    @GetMapping
    List<com.example.softwareengineering.models.peoples> getPeoples() {
        return peoples;
    }
}
