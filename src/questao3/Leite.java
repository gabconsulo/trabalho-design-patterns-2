package questao3;

/** Complemento concreto (ConcreteDecorator). */
public class Leite extends Complemento {
    public static final double PRECO = 1.50;

    public Leite(Bebida bebida) {
        super(bebida);
    }

    @Override
    protected String getNomeComplemento() {
        return "Leite";
    }

    @Override
    protected double getPrecoComplemento() {
        return PRECO;
    }
}
