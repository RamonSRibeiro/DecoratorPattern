package padroesestruturais.decorator;

public abstract class PedidoDecorator implements Pedido {

    private Pedido pedido;
    public String estrutura;

    public PedidoDecorator(Pedido pedido) {
        this.pedido = pedido;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public abstract float getPercentualValor();

    public float getValor() {
        return this.pedido.getValor() * (1 + (this.getPercentualValor() / 100));
    }

    public abstract String getNomeEstrutura();

    public String getEstrutura() {
        return this.pedido.getEstrutura() + "/" + this.getNomeEstrutura();
    }

    public void setEstrutura(String estrutura) {
        this.estrutura = estrutura;
    }
}