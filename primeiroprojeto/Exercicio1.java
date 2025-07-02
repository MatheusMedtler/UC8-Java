/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.UC8.primeiroprojeto;
import java.util.Scanner;
/**
 *
 * @author MATHEUSMEDTLERALVES
 */
public class Exercicio1 {
    
    public static void exercicio(){
   //Criar um metodo que verifica se um numero é digitado pelo usuario é par ou não é
    
    Scanner sc = new Scanner(System.in);
    
    int numero;
    System.out.println("Digite seu numero: ");
    numero = sc.nextInt();
    
    String parImpar = (numero % 2 == 0)? "Par":"Impar";
        System.out.println("O numero " + numero+ "é" +parImpar+".");  
}

}
