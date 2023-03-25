package com.mehmetnuri.springmongodbornek1.controller;

import com.mehmetnuri.springmongodbornek1.document.Category;
import com.mehmetnuri.springmongodbornek1.repository.CategoryRepository;
import com.mehmetnuri.springmongodbornek1.service.SequenceGeneratorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/categories")
public class CategoryController {

    private final CategoryRepository categoryRepository;
    private final SequenceGeneratorService sequenceGeneratorService;

    public CategoryController(CategoryRepository categoryRepository, SequenceGeneratorService sequenceGeneratorService) {
        this.categoryRepository = categoryRepository;
        this.sequenceGeneratorService = sequenceGeneratorService;
    }

    @GetMapping(path = "/all")
    public List<Category> findAllCategories() {
        return this.categoryRepository.findAll();
    }

    @PostMapping(path = "/add")
    public Category addCategory(@RequestBody Category category) {
        category.setId(sequenceGeneratorService.generateSequence(Category.SEQUENCE_NAME));
        return this.categoryRepository.save(category);
    }
}
