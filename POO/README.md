# ☕ Desafio POO:

Simulação de um ecossistema de Bootcamp aplicando os fundamentos da **Programação Orientada a Objetos** e arquitetura **MVC**.

## 📋 Resumo do Desafio

O projeto seguiu 5 passos de modelagem:

1.  **Abstração:** Análise do cenário real (Cursos, Mentorias, Devs).
2.  **Encapsulamento:** Proteção de atributos com métodos de acesso.
3.  **Herança & Polimorfismo:** Uso da classe base `Conteudo` para calcular XP de forma dinâmica.
4.  **Arquitetura MVC:** Organização clara entre regras de negócio e interação.

---

## 📂 Estrutura do Projeto

A organização das pastas reflete a separação de responsabilidades:

    src/
    ├── controller/
    │   └── DesenvolvedorController.java  # Lógica de interação
    ├── model/
    │   ├── Bootcamp.java
    │   ├── Conteudo.java                 # Classe Abstrata (Base)
    │   ├── Curso.java
    │   ├── Mentoria.java
    │   └── Desenvolvedor.java
    ├── view/
    │   └── DesenvolvedorView.java        # Interface (Console)
    └── Main.java

## 🛠️ Tecnologias

- **Java 17**
- **Paradigma OO** (Abstração, Encapsulamento, Herança, Polimorfismo)

---
