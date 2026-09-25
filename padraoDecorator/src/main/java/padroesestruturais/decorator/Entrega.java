package padroesestruturais.decorator;

public class Entrega extends PedidoDecorator {

    public Entrega(Pedido pedido) {
        super(pedido);
    }

    public float getPercentualValor() {
        return 10.0f;
    }

    public String getNomeEstrutura() {
        return "Entrega";
    }
}