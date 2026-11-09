package com.tarefas.repository;

import com.tarefas.model.Categoria;
import com.tarefas.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
    List<Tarefa> findByCategoria(Categoria categoria);
}