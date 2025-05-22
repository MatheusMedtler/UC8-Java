/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciocompras;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author MATHEUSMEDTLERALVES
 */
public class Shopping {

    ArrayList<Produto> carrinho;
    Scanner sc;

    public Shopping() {
        carrinho = new ArrayList<>();
        sc = new Scanner(System.in);
    }

    public void menu() {
        while (true) {
            System.out.println("Sistema de compras");
            System.out.println("1- Adicionar produto \n"
                    + "2- Remover produto \n"
                    + "3- Ver carrinho \n"
                    + "4- Finalizar compra \n"
                    + "5- SAIR \n"
                    + "Digite a opção desejada: ");

            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:

                    System.out.println("Escolha um produto para adiconar:\n"
                            + "1- Televisao\n"
                            + "2- Camiseta\n"
                            + "3- Batata Frita");
                    int opcaoAdd = sc.nextInt();
                    Produto produto;
                    switch (opcaoAdd) {
                        case 1:
                            produto = new Eletronico("Televisao", 1999);
                            carrinho.add(produto);
                            System.out.println(produto.getNome() + "adicionado ao carrinho");
                            break;
                        case 2:
                            produto = new Vestuario("Camiseta", 99);
                            carrinho.add(produto);
                            System.out.println(produto.getNome() + "adicionado ao carrinho");
                            break;
                        case 3:
                            produto = new Alimento("Batata frita", 20.50);
                            carrinho.add(produto);
                            System.out.println(produto.getNome() + "adicionado ao carrinho");
                            break;
                        default:
                            System.out.println("Opção invalida");
                            break;
                    }

                    break;
                case 2:
                    if (!carrinho.isEmpty()) {
                        System.out.println("Escolha o produto para remover");
                        exibir();
                        int opcaoRem = sc.nextInt() - 1;

                        if (opcaoRem <= 0 && opcaoRem > carrinho.size()) {
                            System.out.println("Opção invalida");
                        } else {
                            carrinho.remove(opcaoRem);
                            System.out.println("Produto removido!");
                        }
                    } else {
                        System.out.println("O carrinho está vazio. Não há produtos para remover.");
                    }

                case 3:
                    if (!carrinho.isEmpty()) {
                        System.out.println("Seu carrinho tem esses itens: ");
                        exibir();
                    } else {
                        System.out.println("Seu carrinho esta vazio");
                    }
                case 4:

                    if (!carrinho.isEmpty()) {
                        double valor = 0;
                        for (Produto item : carrinho) {
                            valor += item.getPreco();
                        }
                        System.out.println("Valor total: " + valor);
                        System.out.println("Compra finalizada");

                    } else {
                        System.out.println("Seu carrinho esta vazio.Não é possivel finalizar a compra!");
                    }

                    break;
                case 5:
                    System.out.println("Saindo...");

                    return;
                default:
                    System.out.println("OPÇÃO INVÁLIDA");
            }

        }
    }

    public void exibir() {
        for (int i = 0; i < carrinho.size(); i++) {
            System.out.println(i + 1 + "-" + carrinho.get(i).getNome());;
        }
    }
}
