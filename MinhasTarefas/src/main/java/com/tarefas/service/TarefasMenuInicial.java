package com.tarefas.service;

import java.util.Scanner;

public class TarefasMenuInicial {
    private Scanner sc = new Scanner(System.in);

    public void menuInicial(){
        System.out.println("-- Tarefas --");
        System.out.println("\nVerificar tarefas a serem feitas:");
        System.out.println("1. Faculdade");
        System.out.println("2. Cursos");
        System.out.println("3. Sair");
        System.out.print("Opcao: ");
        int opcEscolhida = sc.nextInt();

        switch(opcEscolhida){
            case 1:
                if(opcEscolhida==1){
                    System.out.println("Opção escolhida: "+ opcEscolhida +". Faculdade");
                    System.out.println("1. Consultar(Tarefas/Lembretes)");
                    System.out.println("2. Registrar(Tarefas/Lembretes)");
                }
        }


    }


}
