import controller.DesenvolvedorController;
import model.Bootcamp;
import model.Curso;
import model.Desenvolvedor;
import model.Mentoria;
import view.DesenvolvedorView;

import java.time.LocalDate;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso("curso js","descicao curso js", 4);
        Curso curso2 = new Curso("curso java","descicao curso java", 8);
        Mentoria mentoria = new Mentoria("Mentoria java", "descricao mentoria java", LocalDate.of(2025,12,16));

        Bootcamp bootcamp = new Bootcamp("Bootcamp Programacao", "descricao bootcamp", Set.of(curso, curso2, mentoria));

        Desenvolvedor desenvolvedor = new Desenvolvedor("Lucas");
        DesenvolvedorController devController = new DesenvolvedorController(desenvolvedor);
        Desenvolvedor desenvolvedor2 = new Desenvolvedor("Gabriel");
        DesenvolvedorController devController2 = new DesenvolvedorController(desenvolvedor2);

        devController.inscreverBootcamp(bootcamp);
        DesenvolvedorView.mostrarConteudosInscritosDesenvolvedor(desenvolvedor);
        DesenvolvedorView.mostrarConteudosInscritosDesenvolvedor(desenvolvedor2);

        devController2.inscreverBootcamp(bootcamp);
        DesenvolvedorView.mostrarConteudosInscritosDesenvolvedor(desenvolvedor2);
        devController2.progredir();
        DesenvolvedorView.mostrarConteudosInscritosDesenvolvedor(desenvolvedor2);
        DesenvolvedorView.mostrarConteudosConcluidosDesenvolvedor(desenvolvedor);
        DesenvolvedorView.mostrarConteudosConcluidosDesenvolvedor(desenvolvedor2);


        DesenvolvedorView.mostrarXpDesenvolvedor(devController.calcularTotalXp());
        DesenvolvedorView.mostrarXpDesenvolvedor(devController2.calcularTotalXp());



    }
}