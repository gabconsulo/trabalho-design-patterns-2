package questao1;

public class Compras implements ObservadorEstoque {
    private static final int ESTOQUE_MINIMO = 5;

    @Override
    public void atualizar(String nomeProduto, int quantidadeAnterior, int novaQuantidade) {
        if (novaQuantidade < ESTOQUE_MINIMO) {
            System.out.println("  [COMPRAS] ALERTA: estoque de '" + nomeProduto
                    + "' abaixo de " + ESTOQUE_MINIMO + " unidades (atual: " + novaQuantidade + "). Providenciar reposição.");
        }
    }
}
