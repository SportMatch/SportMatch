package br.udesc.pro1.model;

import br.udesc.pro1.model.esportes.Esporte;
import br.udesc.pro1.model.usuarios.Administrador;
import br.udesc.pro1.model.usuarios.Usuario;

import java.util.ArrayList;

public class Turma {

    private String nomeDaTurma;
    private final Administrador ADMINISTRADOR;
    private Esporte esporte;
    private String endereco;
    private String horarioInicio;
    private String horarioFim;
    private ArrayList<Usuario> jogadores;
    private ArrayList<String> diasDoJogo;
    
    
    public Turma(String nomeDaTurma, Administrador ADMINISTRADOR, Esporte esporte, String horarioInicio, String horarioFim, ArrayList<String> diasDoJogo, String endereco) {
        this.nomeDaTurma = nomeDaTurma;
        this.ADMINISTRADOR = ADMINISTRADOR;
        this.esporte = esporte;
        this.jogadores = new ArrayList<>();
        this.jogadores.add(ADMINISTRADOR);
        this.horarioInicio = horarioInicio;
        this.horarioFim = horarioFim;
        this.diasDoJogo = diasDoJogo;
        this.endereco = (endereco == null || endereco.equals("")) ? "A definir" : endereco;
        this.ADMINISTRADOR.getTurmasAdministrando().add(this);
        this.ADMINISTRADOR.getTurmasParticipando().add(this);
    }
    
    public Turma(Administrador ADMINISTRADOR){
        this.ADMINISTRADOR = ADMINISTRADOR;
        this.jogadores = new ArrayList<>();
        this.jogadores.add(ADMINISTRADOR);
        this.diasDoJogo = new ArrayList<>();
    }

    public String getNomeDaTurma() {
        return nomeDaTurma;
    }

    public void setNomeDaTurma(String nomeDaTurma) {
        this.nomeDaTurma = nomeDaTurma;
    }

    public Administrador getADMINISTRADOR() {
        return ADMINISTRADOR;
    }
    public Esporte getEsporte() {
        return esporte;
    }

    public ArrayList<Usuario> getJogadores() {
        return jogadores;
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

    public ArrayList<String> getDiasDoJogo() {
        return diasDoJogo;
    }

    public void setDiasDoJogo(ArrayList<String> diasDoJogo) {
        this.diasDoJogo = diasDoJogo;
    }
    
    public void adicionarDia(String dia){
        if(!diasDoJogo.contains(dia)) diasDoJogo.add(dia);
    }
    
    public void removerDia(String dia){
        if(diasDoJogo.contains(dia)) diasDoJogo.remove(dia);
    }

    @Override
    public String toString(){
        return (esporte + " - " + nomeDaTurma);
    }
}
