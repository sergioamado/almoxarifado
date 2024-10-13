package com.example.almoxarifado.service;

import com.example.almoxarifado.model.Funcionario;
import com.example.almoxarifado.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    // Método listar todos os funcionários
    public List<Funcionario> listarTodosFuncionarios() {
        return funcionarioRepository.findAll();
    }

    // Método buscar funcionário por CPF
    public Optional<Funcionario> buscarFuncionarioPorCpf(String cpf) {
        return funcionarioRepository.findById(cpf);
    }

    // Método salvar um novo funcionário
    public Funcionario salvarFuncionario(Funcionario funcionario) {
        return funcionarioRepository.save(funcionario);
    }

    // Método atualizar funcionário existente
    public Funcionario atualizarFuncionario(String cpf, Funcionario funcionarioAtualizado) {
        Optional<Funcionario> funcionarioExistente = funcionarioRepository.findById(cpf);
        if (funcionarioExistente.isPresent()) {
            Funcionario funcionario = funcionarioExistente.get();
            funcionario.setNomeCompleto(funcionarioAtualizado.getNomeCompleto());
            funcionario.setIdentidade(funcionarioAtualizado.getIdentidade());
            funcionario.setEmail(funcionarioAtualizado.getEmail());
            funcionario.setTelefone(funcionarioAtualizado.getTelefone());
            funcionario.setDepartamento(funcionarioAtualizado.getDepartamento());
            return funcionarioRepository.save(funcionario);
        } else {
            return null; 
        }
    }

    // Método deletar  funcionário
    public void deletarFuncionario(String cpf) {
        funcionarioRepository.deleteById(cpf);
    }
}
