# Employee Management

### With objective to test knowledge on Spring Boot application and Hibernate ORM

## 🔧 <b>Configuration file (application.yaml)</b> 🔧

```yaml
spring:
  devtools:
    restart:
      enabled: true
    livereload:
      enabled: false
  datasource:
    url: $YOUR_URL
    username: $YOUR_USERNAME
    password: $YOUR_PASSWORD
    driver-class-name: "org.postgresql.Driver"
  jooq:
    sql-dialect: "org.hibernate.dialect.PostgreSQLDialect"
provider: "org.hibernate.jpa.HibernatePersistenceProvider"
server:
  port: 3000
```

- You should too configure your [<b>persistence.xml</b>](https://docs.jboss.org/hibernate/orm/6.3/userguide/html_single/Hibernate_User_Guide.html#bootstrap-jpa-xml-files)

> [!IMPORTANT]
> Add those files if you want yo publish the copy of that project


## 🔨 <b>Packing application</b> 🔨

```bash
    mvn clean package
```

## ▶️  <b>Running the project</b> ▶️

- Direct run process: 

```bash
    mvn clean spring-boot:run
```

- Jar version

```bash
    java -jar target/employee-management-3.1.3.jar
```

## 🔍 <b>Testing</b> 🔍

```bash
    mvn test
```
