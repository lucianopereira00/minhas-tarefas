package com.tarefas.service;

import com.tarefas.model.Categoria;
import com.tarefas.model.Tarefa;
import com.tarefas.repository.TarefaRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TarefaService {

    private final TarefaRepository repository;

    public TarefaService(TarefaRepository repository) {
        this.repository = repository;
    }

    public Tarefa registrar(Tarefa tarefa) {
        if (tarefa.getTitulo() == null || tarefa.getTitulo().isBlank()) {
            throw new IllegalArgumentException("O título não pode ser vazio.");
        }
        return repository.save(tarefa);
    }

    public List<Tarefa> listarTodas() {
        return repository.findAll();
    }

    public List<Tarefa> listarPorCategoria(Categoria categoria) {
        return repository.findByCategoria(categoria);
    }
}