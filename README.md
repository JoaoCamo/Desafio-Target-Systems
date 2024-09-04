# Desafios Target Systems

Este repositório contém uma série de desafios de programação, juntamente com suas respectivas soluções e testes. Os desafios cobrem uma variedade de tópicos, incluindo cálculos matemáticos, manipulação de strings, processamento de JSON e análise de dados.

## Desafios

### Desafio 1
Observe o trecho de código abaixo: int INDICE = 13, SOMA = 0, K = 0; 
Enquanto K < INDICE faça { K = K + 1; SOMA = SOMA + K; }
Imprimir(SOMA); 
Ao final do processamento, qual será o valor da variável SOMA? 

### Desafio 2
Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência. 

IMPORTANTE: Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código; 

### Desafio 3
Dado um vetor que guarda o valor de faturamento diário de uma distribuidora, faça um programa, na linguagem que desejar, que calcule e retorne: 
• O menor valor de faturamento ocorrido em um dia do mês; 
• O maior valor de faturamento ocorrido em um dia do mês; 
• Número de dias no mês em que o valor de faturamento diário foi superior à média mensal. 

IMPORTANTE: 
a) Usar o json ou xml disponível como fonte dos dados do faturamento mensal; 
b) Podem existir dias sem faturamento, como nos finais de semana e feriados. Estes dias devem ser ignorados no cálculo da média; 

### Desafio 4
Dado o valor de faturamento mensal de uma distribuidora, detalhado por estado: 
•	SP – R$67.836,43 
•	RJ – R$36.678,66 
•	MG – R$29.229,88 
•	ES – R$27.165,48 
•	Outros – R$19.849,53 

Escreva um programa na linguagem que desejar onde calcule o percentual de representação que cada estado teve dentro do valor total mensal da distribuidora.  

### Desafio 5
Escreva um programa que inverta os caracteres de um string. 

IMPORTANTE: 
a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código; 
b) Evite usar funções prontas, como, por exemplo, reverse; 

## Execução do Código

Para executar os códigos, use uma IDE como IntelliJ IDEA ou Eclipse. 

### Passos para Executar na IDE:

1. **Importar o Projeto**:
   - Abra sua IDE (IntelliJ IDEA, Eclipse, etc.).
   - Importe o projeto como um projeto Maven.

2. **Executar uma Classe Específica**:
   - Navegue até a classe que você deseja executar. Por exemplo, para executar `Desafio1`, localize `Desafio1.java` dentro do diretório `src/testeTargetSystems/`.
   - Clique com o botão direito na classe e selecione a opção para executar a classe (geralmente chamada "Run 'Desafio1.main()'").

## Execução dos Testes

Os testes são realizados usando JUnit 5 e Maven. Para executar os testes, siga estas etapas:

1. **Com Maven**:
    - Navegue até o diretório do projeto e execute:
      ```bash
      mvn test
      ```

2. **Usando uma IDE**:
    - Abra o projeto em uma IDE que suporte JUnit 5 (por exemplo, IntelliJ IDEA ou Eclipse).
    - Navegue até a classe de testes em `src/testeTargetSystemsTest/`.
    - Execute os testes clicando com o botão direito na classe de teste e selecionando a opção para executar os testes (geralmente chamada "Run 'DesafioTest'").

## Resultados dos Testes

![Resultados dos Desafios JUnit](Images/image.png)

## Estrutura do Projeto

- `src/testeTargetSystems/`: Contém as soluções para os desafios.
- `src/testeTargetSystemsTest/`: Contém os testes correspondentes para as soluções.
- `src/main/resources/`: Contém arquivos de recursos, como `dados.json`, usados pelos desafios.

## Requisitos

- JDK 11 ou superior.
- Maven para execução dos testes.
- JUnit 5 para execução de testes.
