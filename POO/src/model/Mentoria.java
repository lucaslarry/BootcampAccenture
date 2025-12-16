package model;

import java.time.LocalDate;


public class Mentoria extends Conteudo {
    private LocalDate dataMentoria;
    private final double xpMentoria = 20d;

    public Mentoria(String titulo, String descricao, LocalDate dataMentoria) {
        super(titulo,descricao);
        this.dataMentoria = dataMentoria;
    }

    public double getXpMentoria() {
        return xpMentoria;
    }

    public LocalDate getDataMentoria() {
        return dataMentoria;
    }
    public void setDataMentoria(LocalDate dataMentoria) {
        this.dataMentoria = dataMentoria;
    }
    @Override
    public double calcularXP() {
        return Conteudo.getXpPadrao() + this.getXpMentoria();
    }
    @Override
    public String toString() {
        return "Mentoria{" +
                "descricao='" + getDescricao() + '\'' +
                ", titulo='" + getTitulo() + '\'' +
                '}';
    }
}
