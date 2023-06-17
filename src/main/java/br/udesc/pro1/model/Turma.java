package br.udesc.pro1.model;

import br.udesc.pro1.model.esportes.Esporte;
import br.udesc.pro1.model.usuarios.Administrador;
import br.udesc.pro1.model.usuarios.Usuario;

import java.util.ArrayList;

public class Turma {

    private String nomeDaTurma;
    private final Administrador administrador;
    private final Esporte esporte;
    private String endereco;
    private String horarioInicio;
    private String horarioFim;
    private ArrayList<Usuario> jogadores;
    private ArrayList<String> diasDoJogo;

//    public Turma(String nomeDaTurma, Administrador administrador, Esporte esporte, String horarioInicio, String horarioFim, ArrayList<String> diasDoJogo, String endereco) {
//        this.nomeDaTurma = nomeDaTurma;
//        this.administrador = administrador;
//        this.esporte = esporte;
//        this.jogadores = new ArrayList<>();
//        jogadores.add(administrador);
//        this.horarioInicio = horarioInicio;
//        this.horarioFim = horarioFim;
//        this.diasDoJogo = diasDoJogo;
//
//    }
    public Turma(String nomeDaTurma, Administrador administrador, Esporte esporte, String horarioInicio, String horarioFim, ArrayList<String> diasDoJogo, String endereco) {
        this.nomeDaTurma = nomeDaTurma;
        this.administrador = administrador;
        this.esporte = esporte;
        this.jogadores = new ArrayList<>();
        this.jogadores.add(administrador);
        this.horarioInicio = horarioInicio;
        this.horarioFim = horarioFim;
        this.diasDoJogo = diasDoJogo;
        this.endereco = (endereco == null || endereco.equals("")) ? "A definir" : endereco;
        this.administrador.getTurmasAdministrando().add(this);
        this.administrador.getTurmasParticipando().add(this);
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

    public ArrayList<Usuario> getJogadores() {
        return jogadores;
    }

    /**
     * Método que seta uma *lista* de jogadores, não confundir com
     * {@link br.udesc.pro1.model.esportes.Turma.adicionarJogador}
     */
    public void setJogadores(ArrayList<Usuario> jogadores) {

        this.jogadores = jogadores;
    }

    public void adicionarJogador(Usuario usuario) {
        if (this.jogadores.size() < this.esporte.getNUMERO_DE_JOGADORES_MAXIMO()) {
            this.jogadores.add((Usuario) usuario);
            usuario.getTurmasParticipando().add(this);
        } else {
            System.out.println("Não foi possível entrar pois número máximo de jogadores na turma!");
        }

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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /*public void setHorarioInicio2(){
        horarioInicio2.setTime();
    }*/
    public ArrayList<String> getDiasDoJogo() {
        return diasDoJogo;
    }

    public void setDiasDoJogo(ArrayList<String> diasDoJogo) {
        this.diasDoJogo = diasDoJogo;
    }

    @Override
    public String toString() {
        return "Turma["
                + "\nNome da turma: '" + nomeDaTurma + '\''
                + "\nAdministrador:" + administrador
                + "\nEsporte=" + esporte
                + "\nJogadores=" + jogadores
                + "\nHorário Inicio='" + horarioInicio + '\''
                + "\nHorario Fim='" + horarioFim + '\''
                + "\ndiaDeJogo='" + diasDoJogo + '\''
                + "\ndiasDoJogo=" + diasDoJogo
                + "\nendereco='" + endereco + '\''
                + ']';
    }
}
