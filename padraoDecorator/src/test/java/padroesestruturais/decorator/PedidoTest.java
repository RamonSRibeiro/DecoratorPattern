package padroesestruturais.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {

    @Test
    void deveRetornarValorPedido() {
        Pedido pedido = new PedidoComida(1000.0f);

        assertEquals(1000.0f, pedido.getValor());
    }

    @Test
    void deveRetornarValorPedidoComEntrega() {
        Pedido pedido = new Entrega(new PedidoComida(1000.0f));

        assertEquals(1100.0f, pedido.getValor());
    }

    @Test
    void deveRetornarValorPedidoComBebida() {
        Pedido pedido = new Bebida(new PedidoComida(1000.0f));

        assertEquals(1200.0f, pedido.getValor());
    }

    @Test
    void deveRetornarValorPedidoComSobremesa() {
        Pedido pedido = new Sobremesa(new PedidoComida(1000.0f));

        assertEquals(1050.0f, pedido.getValor());
    }

    @Test
    void deveRetornarValorPedidoComEntregaMaisBebida() {
        Pedido pedido = new Entrega(new Bebida(new PedidoComida(1000.0f)));

        assertEquals(1320.0f, pedido.getValor());
    }

    @Test
    void deveRetornarValorPedidoComEntregaMaisSobremesa() {
        Pedido pedido = new Entrega(new Sobremesa(new PedidoComida(1000.0f)));

        assertEquals(1155.0f, pedido.getValor());
    }

    @Test
    void deveRetornarValorPedidoComBebidaMaisSobremesa() {
        Pedido pedido = new Bebida(new Sobremesa(new PedidoComida(1000.0f)));

        assertEquals(1260.0f, pedido.getValor());
    }

    @Test
    void deveRetornarValorPedidoComEntregaMaisBebidaMaisSobremesa() {
        Pedido pedido = new Entrega(new Bebida(new Sobremesa(new PedidoComida(1000.0f))));

        assertEquals(1386.0f, pedido.getValor());
    }

    @Test
    void deveRetornarEstruturaPedido() {
        Pedido pedido = new PedidoComida();

        assertEquals("Pedido", pedido.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaPedidoComEntrega() {
        Pedido pedido = new Entrega(new PedidoComida());

        assertEquals("Pedido/Entrega", pedido.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaPedidoComBebida() {
        Pedido pedido = new Bebida(new PedidoComida());

        assertEquals("Pedido/Bebida", pedido.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaPedidoComSobremesa() {
        Pedido pedido = new Sobremesa(new PedidoComida());

        assertEquals("Pedido/Sobremesa", pedido.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaPedidoComEntregaMaisBebida() {
        Pedido pedido = new Entrega(new Bebida (new PedidoComida()));

        assertEquals("Pedido/Bebida/Entrega", pedido.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaPedidoComEntregaMaisSobremesa() {
        Pedido pedido = new Entrega(new Sobremesa (new PedidoComida()));

        assertEquals("Pedido/Sobremesa/Entrega", pedido.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaPedidoComBebidaMaisSobremesa() {
        Pedido pedido = new Bebida(new Sobremesa (new PedidoComida()));

        assertEquals("Pedido/Sobremesa/Bebida", pedido.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaPedidoComEntregaMaisBebidaMaisSobremesa() {
        Pedido pedido = new Entrega (new Bebida(new Sobremesa (new PedidoComida())));

        assertEquals("Pedido/Sobremesa/Bebida/Entrega", pedido.getEstrutura());
    }

}