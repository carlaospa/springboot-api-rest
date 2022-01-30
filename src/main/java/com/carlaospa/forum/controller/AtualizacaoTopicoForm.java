package com.carlaospa.forum.controller;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.carlaospa.forum.modelo.Topico;
import com.carlaospa.forum.repository.TopicosRepository;

import org.hibernate.validator.constraints.Length;

public class AtualizacaoTopicoForm {

    @NotNull
    @NotEmpty
    @Length(min = 5)
    private String titulo;

    @NotNull
    @NotEmpty
    @Length(min = 10)
    private String mensagem;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public Topico atualizar(Long id, TopicosRepository topicosRepository) {
        Topico topico = topicosRepository.getById(id);
        topico.setTitulo(this.titulo);
        topico.setMensagem(this.mensagem);
        return topico;
    }
}
