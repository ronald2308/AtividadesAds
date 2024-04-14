package com.example.springBoot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springBoot.model.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long>{
    List<Livro> findByTitulo(String titulo);
}