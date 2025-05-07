/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.primeiroprojeto;

/**
 *
 * @author MATHEUSMEDTLERALVES
 */
public class PrimeiroProjeto {

    public static void main(String[] args) {
     
    Tipos meusTipos = new Tipos();
    meusTipos.verificaIdade(17);
    
    Tipos minhaNacio = new Tipos();
    minhaNacio.escolheNacionalidade("Brasil");
    
   int numero = 4;
   String resultado = (numero % 2 == 0)? "Par":"Impar";
   
//    Frase minhaFrase = new Frase();
//    minhaFrase.mensagem();
    }
}
