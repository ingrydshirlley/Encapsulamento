# 💡 Encapsulamento em Java

Este repositório apresenta um exemplo prático e didático do conceito de **encapsulamento** em Java, desenvolvido durante meus estudos de Programação Orientada a Objetos (POO) na faculdade.

---

## 🔐 O que é encapsulamento?

Encapsulamento é um dos pilares da POO e consiste em esconder os detalhes internos de uma classe, expondo apenas o que é necessário para o mundo externo. Isso é feito por meio de modificadores de acesso (`private`, `protected`, `public`) e do uso de métodos **getters** e **setters**.

Com isso, garantimos:

- Segurança dos dados;
- Controle sobre as alterações nos atributos;
- Reutilização e manutenção mais fácil do código.

---

## 📌 O que o código faz?

### 🔸 `Cliente.java`

Classe base com os seguintes atributos:

- `nome` (String)
- `cpf` (String)
- `ativo` (boolean)

Todos os atributos são `protected` e acessados via métodos públicos (`getters` e `setters`). Também possui:

- `exibirDados()`: mostra nome, CPF e status formatado.
- `formatarDado()`: método `private` que retorna "Ativo" ou "Inativo".

### 🔸 `ClienteEspecial.java`

Subclasse que **herda de `Cliente`** e sobrescreve o método `exibirDados()` para mostrar apenas nome e CPF.

### 🔸 `Main.java`

Classe principal onde:

- Um objeto `Cliente` é instanciado;
- Nome é definido com `setNome`;
- Informações são exibidas com `getNome()` e `exibirDados()`.
