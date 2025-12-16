package model;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Desenvolvedor {
    private String nome;
    private Set<Conteudo> conteudosInscritos;
    private Set<Conteudo> conteudosConcluidas;

    public Desenvolvedor(String nome) {
        this.nome = nome;
        this.conteudosInscritos = new LinkedHashSet<>();
        this.conteudosConcluidas = new LinkedHashSet<>();
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

   public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
   }
   public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidas;
   }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Desenvolvedor that = (Desenvolvedor) o;
        return Objects.equals(nome, that.nome) && Objects.equals(conteudosInscritos, that.conteudosInscritos) && Objects.equals(conteudosConcluidas, that.conteudosConcluidas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidas);
    }
}
