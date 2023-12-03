package com.example.testTask.repo;

import com.example.testTask.entity.Equation;
import org.springframework.data.repository.CrudRepository;

public interface EquationRepo extends CrudRepository<Equation, Long> {
}
