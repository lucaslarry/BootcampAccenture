package view;

import model.Desenvolvedor;

public class DesenvolvedorView {
    public static void mostrarErroProgressao(){
        System.err.println("Você não está matriculado em nenhum conteúdo");
    }

    public static void mostrarConteudosInscritosDesenvolvedor(Desenvolvedor desenvolvedor) {
        System.out.println("Conteudos inscritos "+ desenvolvedor.getNome() + " : "  + desenvolvedor.getConteudosInscritos());
    }

    public static void mostrarConteudosConcluidosDesenvolvedor(Desenvolvedor desenvolvedor) {
        System.out.println("Conteudos concluidos "+ desenvolvedor.getNome() + " : " + desenvolvedor.getConteudosConcluidos());
    }

    public static void mostrarXpDesenvolvedor(double xp) {
        System.out.println("XP Total: " + xp);
    }

}
