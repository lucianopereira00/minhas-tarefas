package com.tarefas.MinhasTarefas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import service.Tarefas;

@SpringBootApplication
public class MinhasTarefasApplication {

	public static void main(String[] args) {
		SpringApplication.run(MinhasTarefasApplication.class, args);
		Tarefas tarefas = new Tarefas();
	}

}
