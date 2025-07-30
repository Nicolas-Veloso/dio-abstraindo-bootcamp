package poo.projetoabstraindobootcamp;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso();
        Curso curso1 = new Curso();

        curso.setTitulo("Curso de Java");
        curso.setDescricao("Descrição curso de Java");
        curso.setCargaHoraria(10);

        curso1.setTitulo("Curso de JS");
        curso1.setDescricao("Descrição curso de JS");
        curso1.setCargaHoraria(20);

        System.out.println(curso);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        System.out.println(mentoria);

        BootCamp bootCamp = new BootCamp();

        bootCamp.setNome("BootCamp Java Developer");
        bootCamp.setDescricao("Descrição bootcamp Java Developer");
        bootCamp.getConteudos().add(curso);
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(mentoria);

        Dev dev = new Dev();
        dev.setNome("Magraum");
        dev.increverBootCamp(bootCamp);

        Dev dev1 = new Dev();
        dev1.setNome("Serjão");
        dev1.increverBootCamp(bootCamp);

        System.out.println(dev.getConteudosInscritos());
        dev.progredir();
        System.out.println(dev.getConteudosConcluidos());
        System.out.println(dev.calcularTotalXp());

        System.out.println("===================");

        System.out.println(dev1.getConteudosInscritos());
        System.out.println(dev1.getConteudosConcluidos());
        dev1.progredir();
        dev1.progredir();
        dev1.progredir();
        System.out.println(dev1.getConteudosInscritos());
        System.out.println(dev1.getConteudosConcluidos());
        System.out.println(dev1.calcularTotalXp());
    }
}
