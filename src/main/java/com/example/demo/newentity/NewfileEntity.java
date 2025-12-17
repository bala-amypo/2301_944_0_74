package com.example.demo.newentity;

import jakarta.persistence

public class NewfileEntity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message="should not contain spaces")
    private String name;
    @NotBlank(message)
}

