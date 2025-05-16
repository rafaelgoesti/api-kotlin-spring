# 📦 API de Clientes com Kotlin + Spring Boot

Projeto de exemplo de uma API REST para gerenciamento de clientes, construída com **Kotlin**, **Spring Boot** e banco de dados em memória **H2**.

---

## 🚀 Tecnologias Utilizadas

- [Kotlin](https://kotlinlang.org/)
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring Web](https://spring.io/guides/gs/rest-service/)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [H2 Database](https://www.h2database.com/)
- [Gradle](https://gradle.org/)

---

## ⚙️ Como rodar o projeto

### 1. Clone o repositório
```bash
git clone https://github.com/rafaelgoesti/api-kotlin-spring.git
cd nome-do-repo
```

### 2. Importe o projeto no IntelliJ IDEA

> **Tipo de projeto:** Gradle - Kotlin

### 3. Execute a aplicação

Rode a aplicação pelo `ApiApplication.kt` ou com o comando:

```bash
./gradlew bootRun
```

---

## 🧪 Testando a API

### 🔸 Criar cliente
```bash
curl -X POST http://localhost:8080/clientes -H "Content-Type: application/json" -d '{"nome":"RafaelTI", "email":"rafael@email.com"}'
```

### 🔸 Listar todos
```bash
curl http://localhost:8080/clientes
```

### 🔸 Buscar por ID
```bash
curl http://localhost:8080/clientes/1
```

### 🔸 Atualizar cliente
```bash
curl -X PUT http://localhost:8080/clientes/1 -H "Content-Type: application/json" -d '{"nome":"Rafael Atualizado", "email":"novo@email.com"}'
```

### 🔸 Deletar cliente
```bash
curl -X DELETE http://localhost:8080/clientes/1
```

---

## 🗂 Estrutura de Pastas

```
src
├── main
│   ├── kotlin
│   │   └── com.exemplo.api
│   │       ├── ApiApplication.kt
│   │       ├── controller
│   │       │   └── ClienteController.kt
│   │       ├── model
│   │       │   └── Cliente.kt
│   │       └── repository
│   │           └── ClienteRepository.kt
│   └── resources
│       ├── application.properties
│       └── static / templates (opcional)
```

---

## 💾 Console do H2

Acesse via navegador:
```
http://localhost:8080/h2-console
```

**JDBC URL:** `jdbc:h2:mem:testdb`  
**User:** `sa`  
**Password:** (vazio)

---

## 🧑‍💻 Autor

Desenvolvido por [Rafael Góes](https://github.com/rafaelgoesti)

---

## 📄 Licença

Este projeto está licenciado sob a [MIT License](LICENSE).
