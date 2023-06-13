package br.udesc.pro1;

import br.udesc.pro1.model.Turma;
import br.udesc.pro1.model.esportes.Esporte;
import br.udesc.pro1.model.esportes.Futebol;
import br.udesc.pro1.model.esportes.Futsal;
import br.udesc.pro1.model.usuarios.Administrador;
import br.udesc.pro1.model.usuarios.Jogador;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
// Press Alt+Enter with your caret at the highlighted text to see how
// IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");

// Press Shift+F10 or click the green arrow button in the gutter to run the code.
//        for (int i = 1; i <= 5; i++) {

// Press Shift+F9 to start debugging your code. We have set one breakpoint
// for you, but you can always add more by pressing Ctrl+F8.
//            System.out.println("i = " + i);
//        }
public class Main {//TODO
    public static void main(String[] args) {

        Administrador admin = new Administrador("Vitor");
        Jogador jogador = new Jogador("Victor");
        Esporte esporte = new Esporte(0,0);
        Futebol futebol = new Futebol();
        Futsal futsal = new Futsal();
        System.out.println("a");
        
        Turma turma = new Turma("java swing", admin, futebol, "00:00", "02:00", "Segunda", null);
        turma.adicionarJogador(jogador);
        System.out.println(turma);

    }
}