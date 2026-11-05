package questao3;

/** Demonstração do Pedido de Café (padrão Decorator). */
public class Main {
    public static void main(String[] args) {
        // Pedido 1: Espresso com Leite
        Bebida pedido1 = new Leite(new Espresso());

        // Pedido 2: Chá com Calda e Chantilly
        Bebida pedido2 = new Chantilly(new Calda(new Cha()));

        // Pedido 3: Espresso com Chantilly repetido (duas vezes) e Leite
        Bebida pedido3 = new Leite(new Chantilly(new Chantilly(new Espresso())));

        // Pedido 4: Chá puro
        Bebida pedido4 = new Cha();

        imprimir(1, pedido1);
        imprimir(2, pedido2);
        imprimir(3, pedido3);
        imprimir(4, pedido4);
    }

    private static void imprimir(int numero, Bebida pedido) {
        System.out.printf("Pedido %d: %s | Total: R$ %.2f%n", numero, pedido.getDescricao(), pedido.getPreco());
    }
}
