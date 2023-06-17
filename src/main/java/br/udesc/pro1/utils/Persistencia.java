package br.udesc.pro1.utils;

import br.udesc.pro1.model.Turma;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Persistencia {


    public void gravarTurma(Turma turma) {
        try (PrintWriter arquivo = new PrintWriter(new FileWriter("turmas.txt", true))) {
            arquivo.print(turma);
            arquivo.println();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
