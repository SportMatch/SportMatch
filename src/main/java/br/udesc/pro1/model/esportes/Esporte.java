package br.udesc.pro1.model.esportes;

/**
 * Classe abstrata, utilizar suas sub-classes.
 * Um Esporte é um conceito abstrato, portanto NÃO consta parâmetros de valores atuais,
 * mas, sim, valores de regras de negócio (i.e., não mudam).<br/>
 * Exemplo: NUMERO_DE_JOGADORES_EM_CAMPO do {@link br.udesc.pro1.model.esportes.Futebol} SEMPRE será 22.<br/>
 * Para valores atuais, como número de participantes atual, utilizar {@link br.udesc.pro1.model.Turma Turma}.
 *
 * @see Futebol
 * @see Volei
 */

public abstract class Esporte {
    protected Integer NUMERO_DE_JOGADORES_EM_CAMPO;
    protected Integer NUMERO_DE_JOGADORES_MAXIMO;
    protected String nome;

    public Esporte(Integer NUMERO_DE_JOGADORES_EM_CAMPO, Integer NUMERO_DE_JOGADORES_MAXIMO, String nome) {
        this.NUMERO_DE_JOGADORES_EM_CAMPO = NUMERO_DE_JOGADORES_EM_CAMPO;
        this.NUMERO_DE_JOGADORES_MAXIMO = NUMERO_DE_JOGADORES_MAXIMO;
        this.nome = nome;
    }
    
    public Esporte(){
        
    }

    public Integer getNUMERO_DE_JOGADORES_EM_CAMPO() {
        return NUMERO_DE_JOGADORES_EM_CAMPO;
    }

    public Integer getNUMERO_DE_JOGADORES_MAXIMO() {
        return NUMERO_DE_JOGADORES_MAXIMO;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Esporte{" + "NUMERO_DE_JOGADORES_EM_CAMPO=" + NUMERO_DE_JOGADORES_EM_CAMPO + ", NUMERO_DE_JOGADORES_MAXIMO=" + NUMERO_DE_JOGADORES_MAXIMO + ", nome=" + nome + '}';
    }
    
}
