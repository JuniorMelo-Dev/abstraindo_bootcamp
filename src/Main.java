import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
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

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Curso Java");
        mentoria1.setDescricao("Descrevendo Mentoria do Curso de Java");
        mentoria1.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
    }
}