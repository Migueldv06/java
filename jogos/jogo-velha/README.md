# 🎮 Jogo da Velha em Java

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
java Velha
```

---

## 🕹️ Como jogar

O tabuleiro é uma matriz 3x3.

Para jogar, bastar informar a casa desejada

┌───┬───┬───┐
│ 1 │ 2 │ 3 │
├───┼───┼───┤
│ 4 │ 5 │ 6 │
├───┼───┼───┤
│ 7 │ 8 │ 9 │
└───┴───┴───┘

Exemplo:

```
Informe a casa selecionada: 5
```

---

## 🧠 Regras implementadas

* Verificação de vitória
* Detecção de empate (velha)
* Impede jogadas inválidas
* CPU com logica básica

---

## 🏗️ Estrutura do projeto

### `Velha`

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

Implementa a lógica da jogada do computador.

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