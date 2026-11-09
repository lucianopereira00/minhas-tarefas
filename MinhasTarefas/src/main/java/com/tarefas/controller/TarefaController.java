package com.tarefas.controller;

import com.tarefas.model.Categoria;
import com.tarefas.model.Tarefa;
import com.tarefas.service.TarefaService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {

    private final TarefaService service;

    public TarefaController(TarefaService service) {
        this.service = service;
    }

    @PostMapping
    public Tarefa registrar(@RequestBody Tarefa tarefa) {
        return service.registrar(tarefa);
    }

    @GetMapping
    public List<Tarefa> listar() {
        return service.listarTodas();
    }

    @GetMapping("/categoria/{categoria}")
    public List<Tarefa> listarPorCategoria(@PathVariable Categoria categoria) {
        return service.listarPorCategoria(categoria);
    }
}