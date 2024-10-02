package com.example.almoxarifado.service;

import com.example.almoxarifado.model.Usuario;
import com.example.almoxarifado.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario criarUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public List<Usuario> listarUsuarios() {
        return usuarioRepository.findAll();
    }

    public Usuario buscarUsuarioPorCpf(String cpf) {
        return usuarioRepository.findById(cpf).orElse(null);
    }

    public Usuario atualizarUsuario(String cpf, Usuario usuario) {
        if (usuarioRepository.existsById(cpf)) {
            usuario.setCpf(cpf);
            return usuarioRepository.save(usuario);
        }
        return null;
    }

    public void deletarUsuario(String cpf) {
        usuarioRepository.deleteById(cpf);
    }
}
