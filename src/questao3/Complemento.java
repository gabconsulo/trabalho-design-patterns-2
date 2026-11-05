package questao3;

/**
 * Decorator abstrato: envolve uma Bebida e acrescenta nome e preço do complemento.
 * Como o próprio complemento é uma Bebida, ele pode ser empilhado em qualquer
 * combinação e quantidade (RQ3.4, RQ3.5), sem classes de combinações prontas (RQ3.6).
 */
public abstract class Complemento implements Bebida {
    protected final Bebida bebida;

    protected Complemento(Bebida bebida) {
        this.bebida = bebida;
    }

    protected abstract String getNomeComplemento();

    protected abstract double getPrecoComplemento();

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", " + getNomeComplemento();
    }

    @Override
    public double getPreco() {
        return bebida.getPreco() + getPrecoComplemento();
    }
}
