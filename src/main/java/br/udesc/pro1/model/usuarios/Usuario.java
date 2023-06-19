package br.udesc.pro1.model.usuarios;

import br.udesc.pro1.model.Turma;

import java.util.ArrayList;
import java.util.Objects;

public class Usuario {
    
    public static int contadorDeUsuarios = 0;
    protected String nome;
    protected String telefone;
    protected String email;
    protected String senha;
    protected ArrayList<Turma> turmasParticipando;
    
    public Usuario(){
    }
    
    public Usuario(String nome, String telefone, String email, String senha) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
        this.turmasParticipando = new ArrayList<>();
        contadorDeUsuarios = contadorDeUsuarios++;
    }
    
    public Usuario(Usuario usuario) {
        this.nome = usuario.nome;
        this.telefone = usuario.telefone;
        this.email = usuario.email;
        this.senha = usuario.senha;
        this.turmasParticipando = usuario.turmasParticipando;
        contadorDeUsuarios = contadorDeUsuarios++;
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

    public String getSenha() {
        return senha;
    }
    
    @Override
    public String toString() {
        return nome + " - Tel: " + telefone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(nome, usuario.nome) && Objects.equals(telefone, usuario.telefone) && Objects.equals(email, usuario.email) && Objects.equals(senha, usuario.senha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, telefone, email, senha);
    }
}
