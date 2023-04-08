import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do Curso de Java");
        curso1.setCargaHoraria(20);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição do Curso de JavaScript");
        curso2.setCargaHoraria(40);

//      Conteudo conteudo = new Conteudo(); //erro por ser classe abstract
//      Conteudo conteudo = new Curso(); //posso criar Curso, pois é filha de Conteudo()

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Curso Java");
        mentoria.setDescricao("Descrevendo Mentoria do Curso de Java");
        mentoria.setData(LocalDate.now());

        /*
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
        */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Banco PAN Java Developer");
        bootcamp.setDescricao("Insira a descrição do Bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJunior = new Dev();
        devJunior.setNome("Junior");
        devJunior.inscreverBootcamp(bootcamp);
        System.out.println("Conteudo Inscritos Junior" + devJunior.getConteudosInscritos());
        devJunior.progredir();
        System.out.println("Conteudo Inscritos Junior" + devJunior.getConteudosInscritos());
        System.out.println("Conteudo Concluidos Junior" + devJunior.getConteudosConcluidos());
        System.out.println("XP: " + devJunior.calcularTotalXp());

        System.out.println("---------");

        Dev devLuana = new Dev();
        devLuana.setNome("Luana");
        devLuana.inscreverBootcamp(bootcamp);
        System.out.println("Conteudo Inscritos Luana" + devLuana.getConteudosInscritos());
        devLuana.progredir();
        System.out.println("Conteudo Inscritos Luana" + devLuana.getConteudosInscritos());
        System.out.println("Conteudo Concluidos Luana" + devLuana.getConteudosConcluidos());
        System.out.println("XP: " + devLuana.calcularTotalXp());
    }
}