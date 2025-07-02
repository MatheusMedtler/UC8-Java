package com.mycompany.arrays;


import java.util.ArrayList;

public class Arrays {

    private static Usuario usuario;

    public static void main(String[] args) {
        int[] numero = new int[3];
        
        
        /*OU PODE SER ASSIM: int[]numero{10,20,23,32,31}*/
     /*   numero[0] = 1;
        numero[1] = 43;
        numero[2] = 22;

        // Corrected the index error
        System.out.println(numero[0] + " " + numero[1] + " " + numero[2]);

        String[] nomes = new String[3];
        nomes[0] = "LEO";
        nomes[1] = "ANa";
        nomes[2] = "João";

        System.out.println(nomes[0] + " " + nomes[1] + " " + nomes[2]);

        for (int i = 0; i < numero.length; i++) {
            System.out.println(numero[i]);
            */
             ArrayList<String> nomes = new ArrayList<>();
        //Adicionar elementos ao ArrayList
        nomes.add("Matheus");
        nomes.add("LUcas");
        
        //Remover elementos do ArrayList
        nomes.remove(0);
        
        //Assim acessamos o valor de um elemento no ArrayList e acessar o valor do indice
        System.out.println(nomes.get(0));
        
        
        //Trocar o valor de um elemento
        nomes.set(0, "Felipe");
        
        //Acessar a primeira ocorrencia de um valor
        System.out.println(nomes.indexOf("Felipe"));
        
        //Acessar a ultima ocorrencia de um valor
        System.out.println(nomes.lastIndexOf("Felipe"));
        
        //Acessar um indice que nao existe 
        System.out.println(nomes.indexOf("Gabriel"));
        
        //Verificar o tamanho do arraylist
        System.out.println(nomes.size());
        
        //Verifica se o ArrayList esta vazio ou não
        System.out.println(nomes.isEmpty());
        
        //Verifica se o arrayList contem determinado elemento
        System.out.println(nomes.contains("Matheus"));
        
        
        /*
        Usando Java e Scanner, elabore um sistema simples de compras  5 classes de tipos de produtos diferentes).
Para fazer as compras, deve haver um menu com switch, onde você deve poder adicionar e remover itens do carrinho
        , ver os itens do carrinho e fazer o pagamento.
        */
              
//  String[]info = info(new Usuario("Matheus3242@gmail.com","4223423"));
   //     System.out.println(info[0]+ "" + info[1]);
          }
    }
