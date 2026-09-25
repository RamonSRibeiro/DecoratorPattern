package padroesestruturais.decorator;

public class Bebida extends PedidoDecorator {

    public Bebida(Pedido pedido) {
        super(pedido);
    }

    public float getPercentualValor() {
        return 20.0f;
    }

    public String getNomeEstrutura() {
        return "Bebida";
    }
}