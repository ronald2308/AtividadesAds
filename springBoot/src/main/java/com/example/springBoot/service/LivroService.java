package com.example.springBoot.service;

import java.util.List;

import org.apache.coyote.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.stereotype.Service;

import com.example.springBoot.model.Livro;
import com.example.springBoot.repository.LivroRepository;

@Service
public class LivroService {
    @Autowired
    private LivroRepository livroRepository;

    private boolean validarCamposObrigatorios(Livro livro) throws BadRequestException {
        if (livro.getTitulo() == null || livro.getTitulo().isEmpty() ||
            livro.getAutorPrincipal() == null || livro.getAutorPrincipal().isEmpty()) {
            throw new BadRequestException("Título e autor são campos obrigatórios");
        }
        return true;
    }

    public Livro cadastrarLivro(Livro livro) throws Exception {
        Livro novoLivro = null;
        try {
            if (validarCamposObrigatorios(livro)) {
                novoLivro = livroRepository.save(livro);
            }
        } catch (Exception e) {
            throw e;
        }
        return novoLivro;
    }

    public List<Livro> listarLivros() {
        return livroRepository.findAll();
    }

    public Livro alterarLivro(Long idLivro, Livro livro) throws Exception {
        try {
            if (!livroRepository.existsById(idLivro)) {
                throw new NotFoundException();
            }

            if (validarCamposObrigatorios(livro)) {
                livro.setId(idLivro);
                livro = livroRepository.save(livro);
            }
        } catch (Exception e) {
            throw e;
        }
        return livro;
    }

    public void excluirLivro(Long idLivro) {
        livroRepository.deleteById(idLivro);
    }

    public Livro buscarLivroPorId(Long idLivro) {
        try {
            return livroRepository.findById(idLivro)
                    .orElseThrow(() -> new RuntimeException("Livro não encontrado"));
        } catch (Exception e) {
            throw new RuntimeException("Erro ao buscar livro por ID: " + e.getMessage());
        }
    }

    public List<Livro> buscarLivroPorTitulo(String titulo) {
        return livroRepository.findByTitulo(titulo);
    }
}