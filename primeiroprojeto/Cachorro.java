/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.UC8.primeiroprojeto;

/**
 *
 * @author MATHEUSMEDTLERALVES
 */
public class Cachorro extends Animal {

    private String breed;

    public Cachorro(String name, String species, double weight) {
        super(name, species, weight);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    
    @Override
    public void emitirSom(){
        System.out.println("O cachorro latiu.");
    }

    }