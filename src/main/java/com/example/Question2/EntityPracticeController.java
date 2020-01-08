package com.example.Question2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/entity")
public class EntityPracticeController {
    private EntityPracticeRepository entityPracticeRepository;

    public EntityPracticeController(EntityPracticeRepository entityPracticeRepository) {
        this.entityPracticeRepository = entityPracticeRepository;
    }

    @GetMapping("/")
    public List<EntityPactice> getAll(){
        return (List<EntityPactice>) entityPracticeRepository.findAll();
    }
}
