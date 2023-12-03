package com.example.testTask.controller;

import com.example.testTask.EquationRequest;
import com.example.testTask.service.EquationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/equation")
public class EquationController {

    private final EquationService equationService;

    @Autowired
    public EquationController(EquationService equationService) {
        this.equationService = equationService;
    }

    @PostMapping("/solve")
    public ResponseEntity<?> solve(@RequestBody EquationRequest equationRequest) {
        return ResponseEntity.ok(equationService.solveEquation(equationRequest));
    }

}
