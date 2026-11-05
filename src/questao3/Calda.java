package questao3;

/** Complemento concreto (ConcreteDecorator). */
public class Calda extends Complemento {
    public static final double PRECO = 1.75;

    public Calda(Bebida bebida) {
        super(bebida);
    }

    @Override
    protected String getNomeComplemento() {
        return "Calda";
    }

    @Override
    protected double getPrecoComplemento() {
        return PRECO;
    }
}
