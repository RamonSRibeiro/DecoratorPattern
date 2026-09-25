# Padrão Decorator - Pedido de Comida

Este projeto demonstra a utilização do **padrão de projeto estrutural Decorator** em Java.

## Tema

O sistema representa um **pedido de comida**, permitindo adicionar diferentes itens ou serviços ao pedido sem alterar a classe principal.

## Estrutura

O projeto possui as seguintes classes:

* `Pedido` — interface principal do pedido.
* `PedidoComida` — representa o pedido básico.
* `PedidoDecorator` — classe abstrata responsável pelo padrão Decorator.
* `Bebida` — adiciona uma bebida ao pedido.
* `Entrega` — adiciona o serviço de entrega ao pedido.
* `Sobremesa` — adiciona uma sobremesa ao pedido.
* `PedidoTest` — contém os testes automatizados da aplicação.

## Funcionamento

Cada Decorator pode envolver um pedido existente, acrescentando um percentual ao seu valor.

Os percentuais utilizados são:

* **Bebida:** 20%
* **Entrega:** 10%
* **Sobremesa:** 5%

Os decorators podem ser combinados, permitindo criar diferentes configurações de pedidos.

### Exemplo

```java
Pedido pedido = new Entrega(
    new Bebida(
        new Sobremesa(
            new PedidoComida(1000.0f)
        )
    )
);
```

Nesse caso, o pedido recebe os três decorators:

`Pedido/Sobremesa/Bebida/Entrega`

E seu valor é calculado de forma acumulativa.

## Tecnologias

* Java
* JUnit 5
* Padrão de Projeto Decorator

## Objetivo

O objetivo da atividade é demonstrar como o padrão **Decorator** permite adicionar responsabilidades e comportamentos a um objeto dinamicamente, mantendo a estrutura original das classes.
