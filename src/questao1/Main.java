package questao1;

public class Main {
    public static void main(String[] args) {
        Produto notebook = new Produto("Notebook", 10);

        Compras compras = new Compras();
        Vendas vendas = new Vendas();
        Auditoria auditoria = new Auditoria();

        notebook.adicionarObservador(compras);
        notebook.adicionarObservador(vendas);
        notebook.adicionarObservador(auditoria);

        alterar(notebook, 7);
        alterar(notebook, 7);
        alterar(notebook, 3);
        alterar(notebook, 0);
        alterar(notebook, 12);

        System.out.println("\n>>> Removendo a área de Compras do produto " + notebook.getNome());
        notebook.removerObservador(compras);

        alterar(notebook, 2);
        alterar(notebook, 0);
        alterar(notebook, 4);

        System.out.println("\nTotal de registros na auditoria: " + auditoria.getRegistros().size());
    }

    private static void alterar(Produto produto, int novaQuantidade) {
        System.out.println("\nAlterando '" + produto.getNome() + "' de "
                + produto.getQuantidade() + " para " + novaQuantidade);
        produto.setQuantidade(novaQuantidade);
    }
}
