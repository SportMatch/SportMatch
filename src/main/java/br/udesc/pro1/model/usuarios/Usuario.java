package br.udesc.pro1.model.usuarios;

public class Usuario {
    protected static int id = 0;
    protected String nome;

    public Usuario(String nome) {
        this.id++;
        this.nome = nome;
    }
    
    
    //TODO

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nome=" + nome + '}';
    }
    
    
}
