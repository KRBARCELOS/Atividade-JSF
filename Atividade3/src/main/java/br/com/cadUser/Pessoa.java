package br.com.cadUser;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class Pessoa {
    private String nome;
    private List<String> nomesCadastrados = new ArrayList<>();

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<String> getNomesCadastrados() {
        return nomesCadastrados;
    }

    // Método para cadastrar o nome
    public String cadastrar() {
        if (nome != null && !nome.trim().isEmpty()) {
            nomesCadastrados.add(nome);
            nome = ""; 
        }
        return "index?faces-redirect=true";
    }
}