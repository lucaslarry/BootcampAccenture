package controller;

import model.Bootcamp;

import model.Conteudo;
import model.Desenvolvedor;
import view.DesenvolvedorView;

import java.util.Optional;

public class DesenvolvedorController {
    private Desenvolvedor desenvolvedor;

    public DesenvolvedorController(Desenvolvedor desenvolvedor) {
        this.desenvolvedor = desenvolvedor;
    }

    public void inscreverBootcamp(Bootcamp bootcamp) {
        this.desenvolvedor.getConteudosInscritos().addAll(bootcamp.getConteudos());
        bootcamp.getDesenvolvedoresInscritos().add(this.desenvolvedor);
    }

    public void progredir(){
        Optional<Conteudo> conteudo = this.desenvolvedor.getConteudosInscritos().stream().findFirst();
        if(conteudo.isPresent()){
            this.desenvolvedor.getConteudosConcluidos().add(conteudo.get());
            this.desenvolvedor.getConteudosInscritos().remove(conteudo.get());
        }else {
            DesenvolvedorView.mostrarErroProgressao();
        }
    }

    public double calcularTotalXp(){
        return this.desenvolvedor.getConteudosConcluidos().stream().mapToDouble(Conteudo::calcularXP).sum();

    }


}
