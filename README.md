![Logo](logo.png)

# Boilerplate Java para Automação de Testes de APIs

O boilerplate Java para automação de testes de APIs contém um conjunto inicial de recursos que possibilitam um rápido e simplificado início de construção de testes automatizados.
<!-- O boilerplate Java para automação de testes de APIs contém um conjunto inicial de recursos que possibilitam um rápido e simplificado início de construção de testes automatizados utilizando a proposta "DB" do modelo [PageObject](https://martinfowler.com/bliki/PageObject.html). -->

## Getting started

### Pré-requisitos

- [Java SE Development Kit 11](https://www.oracle.com/br/java/technologies/downloads/#java11) ou superior
- [Gradle 6.8](https://docs.gradle.org/6.8/userguide/installation.html#installing_with_a_package_manager) ou superior (se superior, demanda atualização do Gradle Wrapper)

### Workspace

O workspace contém a seguinte estrutura:

```shell
.
├── Capkcfjm_configuracao
│   └── gradle
└── Capuaajm_TestesAPIAutomatizados
    ├── relatorios_testes
    │   └── link
    └── testes
        └── functionalTest
            └── pgm
                └── bergs
                    └── Cap
                        └── Capuaajm
                            ├── main
                            │   ├── java
                            │   │   ├── app
                            │   │   └── framework
                            │   │       ├── browser
                            │   │       └── utils
                            │   │           └── simplereportbuilder
                            │   └── resources
                            │       ├── app
                            │       ├── properties
                            │       └── simplereportbuilder
                            └── test
                                ├── java
                                │   └── testcases
                                └── resources
                                    └── properties
```

- `Capkcfjm_configuracao` - 
  - `gradle` - Local da distribuição Gradle em utilização no projeto (Gradle Wrapper)
- `src` - Local dos arquivos de código fonte da codebase
  - `main` - Local que centraliza a parte da codebase a ser executada em formato de aplicação convencional (Java ou outras)
    - `java/app` - Local do web server que provê uma aplicação web de exemplo (cujos arquivos HTML, JavaScript e CSS estão em `src/main/resources/app`)
    - `java/framework` - Local da parte base do framework para automação de testes
    - `resources` - Local de arquivos utilitários (ex.: arquivos da aplicação web de exemplo, arquivos de dados)
  - `test` - Local que centraliza a parte da codebase a ser executada em formato de testes (Java ou outras, via frameworks como por exemplo JUnit)
    - `java/testcases` - Local complementar ao framework para automação de testes que possui as classes que representam os casos de teste de fato, através do uso em conjunto de `pageobjects`, `tasks` e `validations`
    - `resources` - Local de arquivos utilitários para os testes (ex.: arquivos de dados, output padrão de relatórios de execução de testes)

> [!NOTE]
> As pastas intermediárias `java` contidas em `main` e `test` tem propósito de centralizar os arquivos Java. Essa convenção ajuda na organização do código e é flexível para suportar outras linguagens (Gradle suporta ambientes multi-linguagem). Se houvessem também arquivos em uma linguagem diferente, como por exemplo Kotlin, também poderia haver uma pasta correspondente (ex.: `kotlin`).

### Executando o projeto

#### 1. Aplicação

##### 1.1 Via terminal de comandos

Atualizar (sincronizar) as dependências configuradas no projeto
```shell
gradle --refresh-dependencies
```

Executar o arquivo `gradlew` usando a task **run** 
```shell
./gradlew run
```

#### 2. Testes

##### 2.1 Via terminal de comandos

Atualizar (sincronizar) as dependências configuradas no projeto
```shell
gradle --refresh-dependencies
```

Executar o arquivo `gradlew` usando a task **test** 
```shell
./gradlew test
```
