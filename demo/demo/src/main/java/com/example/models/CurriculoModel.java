package com.example.springboot.models;

import jakarta.persistence.Entity;

@Entity

public class CurriculoModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String experiencia;
    // Outros campos relevantes

    // Getters e Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    // Adicione outros getters e setters conforme necessário para outros campos

    @Override
    public String toString() {
        return "Curriculo{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", experiencia='" + experiencia + '\'' +
                // Adicione outros campos ao toString conforme necessário
                '}';
    }
}

