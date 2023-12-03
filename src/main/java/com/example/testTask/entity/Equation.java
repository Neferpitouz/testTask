package com.example.testTask.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Equation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private long id;
    @Getter
    @Setter
    private double a;
    @Getter
    @Setter
    private double b;
    @Getter
    @Setter
    private double c;
    @Getter
    @Setter
    private double x1;
    @Getter
    @Setter
    private double x2;
}
