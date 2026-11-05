package questao1;

import java.util.ArrayList;
import java.util.List;

public class Produto {
    private final String nome;
    private int quantidade;
    private final List<ObservadorEstoque> observadores = new ArrayList<>();

    public Produto(String nome, int quantidadeInicial) {
        if (nome == null) {
            throw new IllegalArgumentException("Nome do produto não pode ser nulo");
        }
        if (quantidadeInicial < 0) {
            throw new IllegalArgumentException("Quantidade não pode ser negativa");
        }
        this.nome = nome;
        this.quantidade = quantidadeInicial;
    }

    public void adicionarObservador(ObservadorEstoque observador) {
        if (observador == null) {
            throw new IllegalArgumentException("Observador não pode ser nulo");
        }
        if (!observadores.contains(observador)) {
            observadores.add(observador);
        }
    }

    public void removerObservador(ObservadorEstoque observador) {
        observadores.remove(observador);
    }

    public void setQuantidade(int novaQuantidade) {
        if (novaQuantidade < 0) {
            throw new IllegalArgumentException("Quantidade não pode ser negativa");
        }
        if (novaQuantidade == this.quantidade) {
            return;
        }
        int anterior = this.quantidade;
        this.quantidade = novaQuantidade;
        notificarObservadores(anterior);
    }

    private void notificarObservadores(int quantidadeAnterior) {
        for (ObservadorEstoque o : new ArrayList<>(observadores)) {
            o.atualizar(nome, quantidadeAnterior, quantidade);
        }
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
