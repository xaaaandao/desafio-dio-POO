import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descrição de mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootCamp = new Bootcamp();
        bootCamp.setNome("Bootcamp Java Developer");
        bootCamp.setDescricao("Descrição Bootcamp Java Developer");
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(curso2);
        bootCamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootCamp);
        System.out.println(devCamila.getNome());
        System.out.println("Conteúdos inscritos " + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos " + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos concluídos " + devCamila.getConteudosConcluidos());
        System.out.println("XP " + devCamila.calcularTotalXp());


        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootCamp);
        System.out.println(devJoao.getNome());
        System.out.println("Conteúdos inscritos " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos " + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos concluídos " + devJoao.getConteudosConcluidos());
        System.out.println("XP " + devJoao.calcularTotalXp());

    }
}