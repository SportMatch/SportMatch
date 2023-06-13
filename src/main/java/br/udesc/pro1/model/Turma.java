package br.udesc.pro1.model;

import br.udesc.pro1.model.esportes.Esporte;
import br.udesc.pro1.model.usuarios.Administrador;
import br.udesc.pro1.model.usuarios.Jogador;
import br.udesc.pro1.model.usuarios.Usuario;

import java.time.DayOfWeek;
import java.util.ArrayList;

public class Turma {
    private String nomeDaTurma;
    private final Administrador administrador;
    private final Esporte esporte;
    private ArrayList<Jogador> jogadores;
    private String horarioInicio;
    //    private TimeComponent horarioInicio2; //TODO descobrir como seta horário no swing
    private String horarioFim;
    private String diaDeJogo;
//    private ArrayList<DayOfWeek> diasDoJogo;
    private String endereco;

    public Turma(String nomeDaTurma, Administrador administrador, Esporte esporte, String horarioInicio, String horarioFim, String diaDeJogo, String endereco) {
        this.nomeDaTurma = nomeDaTurma;
        this.administrador = administrador;
        this.esporte = esporte;
        this.jogadores = new ArrayList<>();
        jogadores.add(administrador);
        this.horarioInicio = horarioInicio;
        this.horarioFim = horarioFim;
        this.diaDeJogo = diaDeJogo;
        this.endereco = (endereco == null || endereco.equals("")) ? "A definir" : endereco;
    }

    public String getNomeDaTurma() {
        return nomeDaTurma;
    }

    public void setNomeDaTurma(String nomeDaTurma) {
        this.nomeDaTurma = nomeDaTurma;
    }

    public Administrador getAdministrador() {
        return administrador;
    }

    public Esporte getEsporte() {
        return esporte;
    }

    public ArrayList<Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(ArrayList<Jogador> jogadores) {
        /*
        TODO
           * método que seta uma *lista* de jogadores, provavelmente não vai ser utilizado
           * desenvolver métodos não-default que adiciona/remove um Jogador
                * conferir capacidade do Esporte antes de adicionar, retornar boolean de sucesso/falha
        */
        this.jogadores = jogadores;
    }
    
    public void adicionarJogador(Usuario usuario) {
        this.jogadores.add((Jogador) usuario);
    }

    public String getHorarioInicio() {
        return horarioInicio;
    }

    public void setHorarioInicio(String horarioInicio) {
        this.horarioInicio = horarioInicio;
    }

    public String getHorarioFim() {
        return horarioFim;
    }

    public void setHorarioFim(String horarioFim) {
        this.horarioFim = horarioFim;
    }

//    public ArrayList<DayOfWeek> getDiasDoJogo() {
//        return diasDoJogo;
//    }
//
//    public void setDiasDoJogo(ArrayList<DayOfWeek> diasDoJogo) {
//        this.diasDoJogo = diasDoJogo;
//    }

    public String getDiaDeJogo() {
        return diaDeJogo;
    }

    public void setDiaDeJogo(String diaDeJogo) {
        this.diaDeJogo = diaDeJogo;
    }
        
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /*public void setHorarioInicio2(){
        horarioInicio2.setTime();
    }*/

    public Turma(String nomeDaTurma, Administrador administrador, Esporte esporte, ArrayList<Jogador> jogadores, String horarioInicio, String horarioFim, String diaDeJogo, String endereco) {
        this.nomeDaTurma = nomeDaTurma;
        this.administrador = administrador;
        this.esporte = esporte;
        this.jogadores = jogadores;
        this.horarioInicio = horarioInicio;
        this.horarioFim = horarioFim;
        this.diaDeJogo = diaDeJogo;
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Turma{" + "nomeDaTurma=" + nomeDaTurma + ", administrador=" + administrador + ", esporte=" + esporte + ", jogadores=" + jogadores + ", horarioInicio=" + horarioInicio + ", horarioFim=" + horarioFim + ", diaDeJogo=" + diaDeJogo + ", endereco=" + endereco + '}';
    }
    
    
    
}
