/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.UC8.primeiroprojeto;

/**
 *
 * @author MATHEUSMEDTLERALVES
 */
public class Animal {

    private String name;
    private String species;
    private double weight;

    //O metodo constructor, em java, dece ser declarado como public
    //Nao deve ir retorno (nem void)
    //deve ter o mesmo nome EXATO da classe

    public Animal(String name, String species, double weight) {
        this.name = name;
        this.species = species;
        this.weight = weight;
    
    }
    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public double getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    public void emitirSom(){
        System.out.println("O animal emitiu o som!");
    }
 
}
