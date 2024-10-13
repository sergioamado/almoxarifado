package com.example.almoxarifado.controller;

import com.example.almoxarifado.model.Funcionario;
import com.example.almoxarifado.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/funcionarios")
public class FuncionarioController {

    @Autowired
    private FuncionarioService funcionarioService;

    // Método para listar todos os funcionários
    @GetMapping
    public ResponseEntity<List<Funcionario>> listarTodosFuncionarios() {
        List<Funcionario> funcionarios = funcionarioService.listarTodosFuncionarios();
        return ResponseEntity.ok(funcionarios);
    }

    // Método para buscar funcionário por CPF
    @GetMapping("/{cpf}")
    public ResponseEntity<Funcionario> buscarFuncionarioPorCpf(@PathVariable String cpf) {
        Optional<Funcionario> funcionario = funcionarioService.buscarFuncionarioPorCpf(cpf);
        if (funcionario.isPresent()) {
            return ResponseEntity.ok(funcionario.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Método para adicionar um novo funcionário
    @PostMapping
    public ResponseEntity<Funcionario> salvarFuncionario(@RequestBody Funcionario funcionario) {
        Funcionario novoFuncionario = funcionarioService.salvarFuncionario(funcionario);
        return ResponseEntity.ok(novoFuncionario);
    }

    // Método para atualizar um funcionário existente
    @PutMapping("/{cpf}")
    public ResponseEntity<Funcionario> atualizarFuncionario(
            @PathVariable String cpf, @RequestBody Funcionario funcionarioAtualizado) {
        Funcionario funcionarioAtualizadoResult = funcionarioService.atualizarFuncionario(cpf, funcionarioAtualizado);
        if (funcionarioAtualizadoResult != null) {
            return ResponseEntity.ok(funcionarioAtualizadoResult);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Método para deletar um funcionário por CPF
    @DeleteMapping("/{cpf}")
    public ResponseEntity<Void> deletarFuncionario(@PathVariable String cpf) {
        funcionarioService.deletarFuncionario(cpf);
        return ResponseEntity.noContent().build();
    }
}
