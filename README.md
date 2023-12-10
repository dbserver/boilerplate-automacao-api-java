![Logo](logo.png)

# Boilerplate Java para Automação de Testes de APIs

O boilerplate Java para automação de testes de APIs contém um conjunto inicial de recursos que possibilitam um rápido e simplificado início de construção de testes automatizados. <!-- TODO: SOM [...] utilizando a proposta "DB" do modelo [ServiceObject](https://www.linkedin.com/pulse/service-object-model-itay-melamed). -->

## Getting started

### Pré-requisitos

- [Java SE Development Kit 11](https://www.oracle.com/br/java/technologies/downloads/#java11) ou superior

### Workspace

O workspace contém a seguinte estrutura:

```shell
.
├── gradle
└── src
    ├── main
    │   ├── java
    │   │   ├── app
    │   │   └── framework
    │   └── resources
    └── test
        ├── java
        │   └── testcases
        └── resources
```
<!-- TODO: SOM [...] 
    └── test
        ├── java
        │   ├── services
        │   └── testcases
        └── resources
[...] -->

- `gradle` - Local da distribuição Gradle em utilização no projeto (Gradle Wrapper)
- `src` - Local dos arquivos de código fonte da codebase
  - `main` - Local que centraliza a parte da codebase a ser executada em formato de aplicação convencional (Java ou outras)
    - `java/app` - Local do web server que provê uma aplicação web + API de exemplo (cujos arquivos HTML, JavaScript, CSS e API JSON estão em `main/resources/app`)
    - `java/framework` - Local da parte base do framework para automação de testes
    - `resources` - Local de arquivos utilitários (ex.: arquivos da aplicação web + API de exemplo, arquivos de dados, arquivos de propriedades para a aplicação)
  - `test` - Local que centraliza a parte da codebase a ser executada em formato de testes (Java ou outras, via frameworks como por exemplo JUnit)
    <!-- TODO: SOM 
    - `java/services` - Local complementar ao framework para automação de testes que possui as classes que representam os serviços das APIs alvo (ex.: aplicação provida pelo web server em `main/java/app`)
    [...] -->
    - `java/testcases` - Local complementar ao framework para automação de testes que possui as classes que representam os casos de teste de fato <!-- TODO: SOM [...], executados através do uso de `test/java/services` -->
    - `resources` - Local de arquivos utilitários para os testes (ex.: arquivos de dados, output padrão de relatórios de execução de testes, arquivos de propriedades para os testes)

> [!NOTE]
> As pastas intermediárias `java` contidas em `main` e `test` tem propósito de centralizar os arquivos Java. Essa convenção ajuda na organização do código e é flexível para suportar outras linguagens (Gradle suporta ambientes multi-linguagem). Se houvessem também arquivos em uma linguagem diferente, como por exemplo Kotlin, também poderia haver uma pasta correspondente (ex.: `kotlin`).

### Executando o projeto

#### 1. Aplicação

##### 1.1 Via terminal de comandos

Executar o arquivo `gradlew` (Gradle Wrapper) para atualizar (sincronizar) as dependências configuradas no projeto
```shell
./gradlew --refresh-dependencies
```

Executar o arquivo `gradlew` (Gradle Wrapper) usando a task **run** 
```shell
./gradlew run
```

#### 2. Testes

##### 2.1 Via terminal de comandos

Executar o arquivo `gradlew` (Gradle Wrapper) para atualizar (sincronizar) as dependências configuradas no projeto
```shell
./gradlew --refresh-dependencies
```

Executar o arquivo `gradlew` (Gradle Wrapper) usando a task **test** 
```shell
./gradlew test
```
