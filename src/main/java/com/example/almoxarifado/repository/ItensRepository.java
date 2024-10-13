package com.example.almoxarifado.repository;

import com.example.almoxarifado.model.Itens;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItensRepository extends JpaRepository<Itens, String> {
}