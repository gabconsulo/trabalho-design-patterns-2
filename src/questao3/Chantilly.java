package questao3;

/** Complemento concreto (ConcreteDecorator). */
public class Chantilly extends Complemento {
    public static final double PRECO = 2.00;

    public Chantilly(Bebida bebida) {
        super(bebida);
    }

    @Override
    protected String getNomeComplemento() {
        return "Chantilly";
    }

    @Override
    protected double getPrecoComplemento() {
        return PRECO;
    }
}
