package org.example.model;

import org.example.model.Animal;
import org.springframework.stereotype.Component;

@Component
public class Dog extends Animal {
    @Override
    public String toString() {
        return "Im a Dog";
    }
}

