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

public class Esporte {
    protected int NUMERO_DE_JOGADORES_EM_CAMPO;
    protected int NUMERO_DE_JOGADORES_MAXIMO;

    public Esporte(int NUMERO_DE_JOGADORES_EM_CAMPO, int NUMERO_DE_JOGADORES_MAXIMO) {
        this.NUMERO_DE_JOGADORES_EM_CAMPO = NUMERO_DE_JOGADORES_EM_CAMPO;
        this.NUMERO_DE_JOGADORES_MAXIMO = NUMERO_DE_JOGADORES_MAXIMO;
    }

    public int getNUMERO_DE_JOGADORES_EM_CAMPO() {
        return NUMERO_DE_JOGADORES_EM_CAMPO;
    }

    public int getNUMERO_DE_JOGADORES_MAXIMO() {
        return NUMERO_DE_JOGADORES_MAXIMO;
    }

}
