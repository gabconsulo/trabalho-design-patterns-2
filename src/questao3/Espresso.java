package questao3;

/** Bebida base (ConcreteComponent). */
public class Espresso implements Bebida {
    public static final double PRECO = 6.00;

    @Override
    public String getDescricao() {
        return "Espresso";
    }

    @Override
    public double getPreco() {
        return PRECO;
    }
}
