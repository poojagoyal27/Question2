package com.example.Question2;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EntityPracticeRepository extends CrudRepository<EntityPactice, Integer> {
    Optional<EntityPactice> findById(Integer id);
}
