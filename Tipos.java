/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primeiroprojeto;

/**
 *
 * @author MATHEUSMEDTLERALVES
 */
public class Tipos {
   String meuNome = "Matheus";
   char minhaInicial = 'M';
   int minhaIdade = 17;
   double minhaAltua = 1.79;
   boolean verdadeiroOuFalso = true;
   
   public void verificaIdade(int idade){
     if(idade >= 18){
         System.out.println("Você é maior de idade,pois tem" +idade+ "anos");
     } else {
         System.out.println("Você é menor de idade,pois tem " + idade + " anos");
     }
   }
   
   //Primeiro Dizemos se o metodo é publiv,private,protected
   //Depois devemos especificar o tipo de retorno do metodo
   //e depois, os parametros(se houverem)
   
   public int calcularSoma(int num1,int num2){
   
       return num1 + num2;
       
    }
   
   public void escolheNacionalidade(String pais){
       
       switch (pais){
           case "Brasil":
               System.out.println("Você é brasileiro");
               break;
           case "Argentina":
               System.out.println("Você é argentino");
               break;
           default:
               System.out.println("Nacionalidade não encontrada.");
               break;
       
       }
     }
   
   }
