package com.example.testTask.service;

import com.example.testTask.EquationRequest;
import com.example.testTask.entity.Equation;
import com.example.testTask.repo.EquationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EquationService {

    EquationRepo equationRepo;

    @Autowired
    public EquationService(EquationRepo equationRepo) {
        this.equationRepo = equationRepo;
    }

    public Equation solveEquation(EquationRequest equationRequest) {
        double a = equationRequest.getA();
        double b = equationRequest.getB();
        double c = equationRequest.getC();
        double discriminant = b * b - 4 * a * c;
        Equation equation = new Equation();
        equation.setA(a);
        equation.setB(b);
        equation.setC(c);

        if (discriminant > 0) {
            equation.setX1((-b + Math.sqrt(discriminant)) / (2 * a));
            equation.setX2((-b - Math.sqrt(discriminant)) / (2 * a));
        } else if (discriminant == 0) {
            equation.setX1(-b / (2 * a));
        } else {
            throw new RuntimeException("No real roots");
        }

        return equationRepo.save(equation);
    }
}
