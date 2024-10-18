# bookRentalback API
Este projeto é uma API para gerenciamento de uma biblioteca online. Ele fornece funcionalidades CRUD (Create, Read, Update, Delete) para livros, usuários, aluguéis e editoras, com regras de negócio específicas, como não permitir deletar usuários com aluguéis pendentes ou livros sem editoras associadas.

Tecnologias Utilizadas
Java 17
Spring Boot 2.5.2
Maven
PostgreSQL
Flyway (para migração de banco de dados)
Springfox Swagger (para documentação da API)
Lombok (para simplificação de código)
Configuração do Projeto
Pré-requisitos
Java 17 ou superior instalado.
Maven instalado.
PostgreSQL configurado e em execução.
Passos para Configuração

## Clone o repositório
```
git clone https://github.com/LuizGuilhes123/bookStoreRental.git
cd bookStoreRental
```

## Configure o banco de dados

Certifique-se de ter o PostgreSQL instalado e em execução.
Crie um banco de dados para o projeto.
Altere o arquivo application.properties com as informações de conexão com o banco.

## Instalar dependências

```
mvn install
```

## Executar a aplicação

```
mvn spring-boot:run

```

## Endpoints
A documentação da API está disponível através do Swagger em: http://localhost:8080/swagger-ui/

### Principais Endpoints
.Usuários: CRUD de usuários.
.Livros: CRUD de livros.
.Aluguéis: Gerenciamento de aluguéis de livros.
.Editoras: CRUD de editoras.

### Regras de Negócio
.Um usuário não pode ser deletado se tiver um aluguel pendente.
.Não é possível criar um livro sem associar uma editora.
.Aluguéis devem ser finalizados ou cancelados antes de deletar o livro ou usuário associado.

##Migração de Banco de Dados
Utiliza o Flyway para gerenciar versões do banco de dados. Para aplicar as migrações, execute:

```
mvn test
```

Licença
Esse projeto é licenciado sob a MIT License.

OBS
Esse projeto foi feito para um trabalho da faculdade por Luiz Guilherme de Sousa Braga, estudante da Unifametro.
