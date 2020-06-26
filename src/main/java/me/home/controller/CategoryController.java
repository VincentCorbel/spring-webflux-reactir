package me.home.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.home.model.Category;
import me.home.service.CategoryService;
import reactor.core.publisher.Flux;


@RequestMapping("/category")
@RestController
public class CategoryController
{
    @Autowired
    private CategoryService service;

    @GetMapping
    public Flux<Category> getAll() {
        return service.getAll();
    }
}
