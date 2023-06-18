package br.udesc.pro1.model.usuarios;

import br.udesc.pro1.model.Turma;

import java.util.ArrayList;

public class Administrador extends Usuario {
    private ArrayList<Turma> turmasAdministrando;

    public Administrador(String nome, String telefone, String email, String senha) {
        super(nome, telefone, email, senha);
        this.turmasAdministrando = new ArrayList<>();
    }

    public ArrayList<Turma> getTurmasAdministrando() {
        return turmasAdministrando;
    }

    public void setTurmasAdministrando(ArrayList<Turma> turmasAdministrando) {
        this.turmasAdministrando = turmasAdministrando;
    }
}
