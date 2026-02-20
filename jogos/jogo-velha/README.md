# JogoVelha.class
Ele apenas inicia o codigo e chama o Jogo.class

# Jogo.class
    Faz todas as chamadas para gravar uma jogada, exibir tabuleiro, verificar se o jogo acabou, etc.

# Tabuleiro.class
    Ele é responsável por criar o tabuleiro, exibir o tabuleiro, gravar jogadas e etc.

# CPU.class
    é um bot que joga aleatoriamente no momento.
    
# README Jogo da velha

## 🎮 Jogo da Velha em Java

Projeto simples jogano no terminal feito para praticar **Programação Orientada a Objetos em Java**.
Basicamente o jogador (`X`) VS uma CPU (`O`).

A partida é executada apenas pelo terminal.

---

## ▶️ Como executar

Compile os arquivos:

```bash
javac *.java
```

Execute:

```bash
java JogoVelha
```

---

## 🕹️ Como jogar

O tabuleiro é uma matriz 3x3.

Você deve informar:

* linha (0 a 2)
* coluna (0 a 2)

Exemplo:

```
Informe a linha: 1
Informe a coluna: 2
```

---

## 🧠 Regras implementadas

* Verificação de vitória
* Detecção de empate (velha)
* Impede jogadas inválidas

A CPU no momento só escolhe posições **aleatórias válidas**.

---

## 🏗️ Estrutura do projeto

### `JogoVelha`

Ponto de entrada do programa.
Apenas inicia a partida. 

### `Jogo`

Controla todo o fluxo da partida:

* turnos
* leitura do jogador
* chamadas da CPU
* verificação de vitória e empate 

### `Tabuleiro`

Representa o estado do jogo:

* guarda as posições
* valida jogadas
* detecta vitória
* detecta empate 

### `CPU`

Responsável pela jogada aleatoria do computador (aleatória). 

---

## 📚 Objetivos do projeto

Praticar conceitos de:

* Encapsulamento
* Separação de responsabilidades
* Interação entre classes
* Lógica de jogo em loop contínuo

---

## 🚀 Melhorias futuras

* CPU inteligente (bloquear e vencer)
* Interação com a interface
* Cancelar jogada
* Reiniciar partida