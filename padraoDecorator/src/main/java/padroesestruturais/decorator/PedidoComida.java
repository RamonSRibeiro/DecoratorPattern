package padroesestruturais.decorator;

public class PedidoComida implements Pedido {

    public float valor;

    public PedidoComida() {
    }

    public PedidoComida(float valor) {
        this.valor = valor;
    }

    public float getValor() {
        return valor;
    }

    public String getEstrutura() {
        return "Pedido";
    }

}