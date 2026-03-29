# Padrões de Projeto - Singleton

Este repositório contém um exemplo simples de implementação do padrão de projeto **Singleton** utilizando **Java**.

O objetivo do exercício é demonstrar como garantir que uma classe possua **apenas uma instância** durante a execução do sistema e fornecer um **ponto global de acesso** a essa instância.

---

## Estrutura do Projeto

O projeto possui duas classes principais:

- **ConfigSistema** → Implementa o padrão Singleton
- **ConfigSistemaTest** → Classe de testes utilizando JUnit

---

## Padrão Singleton

O padrão Singleton garante que apenas uma instância da classe seja criada.  
Isso é feito através de:

- Construtor **privado**
- Instância **estática**
- Método público **getInstance()**

---

## Diagrama de Classes

Abaixo está o diagrama de classes representando a estrutura da implementação.


<img width="616" height="537" alt="Diagrama" src="https://github.com/user-attachments/assets/3d966697-afe5-4c4b-b0d6-68af329589ea" />

---
