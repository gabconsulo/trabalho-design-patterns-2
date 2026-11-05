package questao3;

public abstract class Complemento implements Bebida {
    private final Bebida bebida;
    private final String nome;
    private final double preco;

    protected Complemento(Bebida bebida, String nome, double preco) {
        if (bebida == null) {
            throw new IllegalArgumentException("A bebida não pode ser nula");
        }
        if (nome == null) {
            throw new IllegalArgumentException("O nome do complemento não pode ser nulo");
        }
        this.bebida = bebida;
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", " + nome;
    }

    @Override
    public double getPreco() {
        return bebida.getPreco() + preco;
    }
}
