package com.example.almoxarifado.controller;

import com.example.almoxarifado.model.Itens;
import com.example.almoxarifado.service.ItensService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/itens")
public class ItensController {

    @Autowired
    private ItensService itensService;

    // Inserir novo item
    @PostMapping
    public ResponseEntity<Itens> createItem(@RequestBody Itens item) {
        Itens newItem = itensService.saveItem(item);
        return ResponseEntity.ok(newItem);
    }

    // Obter todos os itens
    @GetMapping
    public ResponseEntity<List<Itens>> getAllItems() {
        List<Itens> itens = itensService.getAllItems();
        return ResponseEntity.ok(itens);
    }

    // Obter um item por ID
    @GetMapping("/{id}")
    public ResponseEntity<Itens> getItemById(@PathVariable Integer id) {
        Optional<Itens> item = itensService.getItemById(id);
        return item.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Atualizar um item existente
    @PutMapping("/{id}")
    public ResponseEntity<Itens> updateItem(@PathVariable Integer id, @RequestBody Itens itemDetails) {
        Optional<Itens> updatedItem = itensService.updateItem(id, itemDetails);
        return updatedItem.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Deletar um item
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteItem(@PathVariable Integer id) {
        boolean deleted = itensService.deleteItem(id);
        return deleted ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
    }
}
