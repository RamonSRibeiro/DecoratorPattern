package padroesestruturais.decorator;

public class Sobremesa extends PedidoDecorator {

    public Sobremesa(Pedido pedido) {
        super(pedido);
    }

    public float getPercentualValor() {
        return 5.0f;
    }

    public String getNomeEstrutura() {
        return "Sobremesa";
    }
}