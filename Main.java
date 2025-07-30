package poo.projetoabstraindobootcamp;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso();

        curso.setTitulo("Java");
        curso.setDescricao("Java é");
        curso.setCargaHoraria(60);

        System.out.println(curso);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        System.out.println(mentoria);
    }
}
