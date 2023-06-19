package br.udesc.pro1.utils;

import br.udesc.pro1.model.Turma;
import br.udesc.pro1.model.usuarios.Usuario;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.out;

public class Persistencia {

    public void gravarUsuario(Usuario usuario) {
        try (PrintWriter arquivo = new PrintWriter(new FileWriter("usuarios.txt", true))) {
            arquivo.print(usuario.getNome() + " ");
            arquivo.print(usuario.getTelefone() + " ");
            arquivo.print(usuario.getEmail() + " ");
            arquivo.print(usuario.getSenha() + " ");
            arquivo.println();
        } catch (Exception e) {
            out.println(e);
        }
    }

    public ArrayList<Usuario> getUsuarios() {
        ArrayList<Usuario> usuarios = new ArrayList<>();
        try (Scanner arquivo = new Scanner(new FileReader("usuarios.txt"))) {
            while (arquivo.hasNext()) {
                String nome = arquivo.next();
                String telefone = arquivo.next();
                String email = arquivo.next();
                String senha = arquivo.next();
                Usuario usuario = new Usuario(nome, telefone, email, senha);
                usuarios.add(usuario);
            }
        } catch (Exception e) {
            out.println(e);
        }
        return usuarios;
    }
}
