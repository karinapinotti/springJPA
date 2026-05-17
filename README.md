# ☕ Spring JPA API

API REST desenvolvida com **Spring Boot + Spring Data JPA** durante estudos de persistência, relacionamentos, services e Query Methods.

Projeto focado em:
- JPA e Hibernate
- Relacionamentos entre entidades
- Repository Pattern
- Query By Method Name
- Services
- Controle transacional
- API REST com Spring Boot

---

# 🚀 Tecnologias

![Java](https://img.shields.io/badge/Java-21-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)
![Spring Data JPA](https://img.shields.io/badge/Spring_Data_JPA-6DB33F?style=for-the-badge)
![Hibernate](https://img.shields.io/badge/Hibernate-59666C?style=for-the-badge&logo=hibernate)
![MySQL](https://img.shields.io/badge/MySQL-005C84?style=for-the-badge&logo=mysql)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apachemaven)

---

# 📚 Conceitos aplicados

## 🔹 Spring Data JPA
Utilização do JPA para persistência de dados e mapeamento objeto-relacional com Hibernate.

## 🔹 Query By Method Name
Criação automática de queries apenas pelo nome do método no repository.

Exemplo:

```java
List<Subscription> findBySession(Session session);
```

## 🔹 Relacionamentos JPA
Mapeamentos utilizando:
- `@OneToMany`
- `@ManyToOne`
- `@EmbeddedId`
- Chave composta

## 🔹 Services
Separação da lógica de negócio em camadas de serviço.

## 🔹 Controle Transacional
Uso de `@Transactional` para garantir integridade das operações.

## 🔹 API REST
Endpoints REST utilizando:
- `@RestController`
- `@RequestMapping`
- `@GetMapping`
- `@PostMapping`

---

# 🗂️ Estrutura do projeto

```bash
src/main/java
│
├── controller
├── dto
├── exception
├── model
├── repo
├── service
└── EventsApplication
```

---

# ⚙️ Configuração

## application.properties

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/events
spring.datasource.username=root
spring.datasource.password=senha

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

# ▶️ Como executar

## Clonar projeto

```bash
git clone -b feature/aula5_JPA https://github.com/karinapinotti/springJPA.git
```

## Entrar na pasta

```bash
cd springJPA
```

## Executar

```bash
./mvnw spring-boot:run
```

Ou pela IDE:
- IntelliJ IDEA
- VSCode
- Eclipse

---

# 📌 Funcionalidades

- Cadastro de usuários
- Cadastro de sessões/eventos
- Inscrições em sessões
- Busca por usuário
- Busca por sessão
- Relacionamentos entre entidades
- Persistência em banco relacional

---

# 🧠 Aprendizados

Projeto criado para prática de:
- JPA/Hibernate
- Modelagem relacional
- Repositories
- Services
- Exceptions
- Transactions
- Arquitetura em camadas
- APIs REST

---

# 👩‍💻 Autora

## Deusa suprema — Karina Pinotti

🔗 GitHub: https://github.com/karinapinotti  
🔗 LinkedIn: https://www.linkedin.com/in/karina-bruschi-pinotti/

---

# 📌 Observação

Adicionar na raiz do projeto o arquivo `.gitattributes` para o GitHub reconhecer corretamente Java como linguagem principal:

```gitattributes
*.java linguist-detectable=true
*.html linguist-detectable=false
*.css linguist-detectable=false
*.js linguist-detectable=false
```
