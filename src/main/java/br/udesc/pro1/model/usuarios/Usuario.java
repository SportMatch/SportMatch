package br.udesc.pro1.model.usuarios;

import br.udesc.pro1.model.Turma;

import java.util.ArrayList;

public class Usuario {
    protected String nome;
    protected  String telefone;
    protected  String email;
    protected  ArrayList<Turma> turmasParticipando;

//    protected String senha;

    public Usuario(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.turmasParticipando = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public ArrayList<Turma> getTurmasParticipando() {
        return turmasParticipando;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nome=" + nome + ", telefone=" + telefone + ", email=" + email + '}';
    }

}
