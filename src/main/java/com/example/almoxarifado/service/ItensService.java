package com.example.almoxarifado.service;

import com.example.almoxarifado.model.Itens;
import com.example.almoxarifado.repository.ItensRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItensService {

    @Autowired
    private ItensRepository itensRepository;

    // Método para salvar um novo item
    public Itens saveItem(Itens item) {
        return itensRepository.save(item);
    }

    // Método para buscar todos os itens
    public List<Itens> getAllItems() {
        return itensRepository.findAll();
    }

    // Método para buscar um item por ID
    public Optional<Itens> getItemById(Integer id) {
        return itensRepository.findById(id);
    }

    // Método para atualizar um item existente
    public Optional<Itens> updateItem(Integer id, Itens itemDetails) {
        Optional<Itens> itemOptional = itensRepository.findById(id);
        if (itemOptional.isPresent()) {
            Itens itemToUpdate = itemOptional.get();
            // Atualizar os atributos do item
            itemToUpdate.setNomeItem(itemDetails.getNomeItem());
            itemToUpdate.setDescricao(itemDetails.getDescricao());
            itemToUpdate.setDataRecebimento(itemDetails.getDataRecebimento());
            itemToUpdate.setUnidade(itemDetails.getUnidade());
            itemToUpdate.setQuantidade(itemDetails.getQuantidade());
            itemToUpdate.setPreco(itemDetails.getPreco());
            itemToUpdate.setLocalizacao(itemDetails.getLocalizacao());
            itemToUpdate.setCodigoCatmat(itemDetails.getCodigoCatmat());
            return Optional.of(itensRepository.save(itemToUpdate));
        }
        return Optional.empty();
    }

    // Método para deletar um item por ID
    public boolean deleteItem(Integer id) {
        Optional<Itens> itemOptional = itensRepository.findById(id);
        if (itemOptional.isPresent()) {
            itensRepository.delete(itemOptional.get());
            return true;
        }
        return false;
    }
}
