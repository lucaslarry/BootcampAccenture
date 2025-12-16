# 🐳 Microserviços: A Jornada de Toshiro Shibakita

Este projeto simula um ambiente de microsserviços containerizado, desenvolvido como parte da narrativa de aprendizado focada em **Toshiro Shibakita**. O objetivo é demonstrar a orquestração de containers para garantir a persistência de dados e a comunicação entre serviços.

## 📋 Cenário do Projeto

A aplicação resolve o desafio de **conectar uma aplicação Java a um banco de dados isolado**, garantindo que as mensagens do sistema (como as de Toshiro) sejam persistidas e recuperadas corretamente, independente do ambiente onde o código está rodando.

### Componentes:

1.  **API (Spring Boot):** Microsserviço responsável por expor os dados.
2.  **Banco de Dados (MySQL):** Container isolado para persistência.
3.  **Docker Compose:** Orquestrador que sobe e conecta os dois serviços automaticamente.

---

## 📂 Estrutura de Arquivos

A organização reflete a separação entre a infraestrutura (na raiz) e o código da aplicação (na pasta `api`):

    Docker/
    ├── api/                         # Código Fonte do Microsserviço
    │   ├── src/main/java/.../
    │   │   ├── controller/MensagemController.java
    │   │   ├── model/Mensagem.java
    │   │   └── repository/MensagemRepository.java
    │   └── Dockerfile               # Receita da imagem da API
    ├── banco.sql                    # Script de inicialização (Seed Data)
    └── docker-compose.yml           # Orquestração (API + MySQL)

---

## 🛠️ Tecnologias e Configurações

- **Spring Boot:** Exposição do endpoint REST `/mensagens`.
- **MySQL 8.0:** Banco de dados containerizado.
- **Docker Compose:** Cria a rede virtual ligando a API ao Banco.
- **Volume Mapping:** O arquivo `banco.sql` é injetado automaticamente no container MySQL ao iniciar (`/docker-entrypoint-initdb.d`), criando a tabela e inserindo a mensagem inicial.

---

## 🚀 Como Executar

Não é necessário ter Java ou MySQL instalados na máquina, apenas o Docker.

1.  **Navegue até a pasta:**

    ```bash
    cd Docker
    ```

2.  **Suba o ambiente completo:**

    ```bash
    docker-compose up --build
    ```

    _Isso irá construir a imagem da API Java, baixar a imagem do MySQL, configurar o banco e conectar tudo._

3.  **Teste o funcionamento:**
    Acesse no navegador: `http://localhost:8080/mensagens`

    **Resultado esperado (JSON):**

    ```json
    [
      {
        "id": 1,
        "texto": "Microsserviço Spring rodando com Docker"
      }
    ]
    ```

---
