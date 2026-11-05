package questao2;

/** Demonstração da Tarifa de Estacionamento (padrão Strategy). */
public class Main {
    public static void main(String[] args) {
        int minutos = 135; // 2h15min -> 3 horas iniciadas

        PerfilCobranca[] perfis = {
                new PerfilRotativo(),
                new PerfilMensalista(),
                new PerfilConveniado()
        };

        System.out.println("=== Mesmo tempo de permanência (" + minutos + " min) nos três perfis ===");
        for (PerfilCobranca perfil : perfis) {
            Tiquete t = new Tiquete("ABC1D23", minutos, perfil);
            imprimir(t);
        }

        System.out.println("\n=== Troca de perfil em um mesmo tíquete ===");
        Tiquete tiquete = new Tiquete("XYZ9K87", 75, new PerfilRotativo());
        imprimir(tiquete);

        tiquete.setPerfil(new PerfilConveniado());
        imprimir(tiquete);

        tiquete.setPerfil(new PerfilMensalista());
        imprimir(tiquete);

        System.out.println("\n=== Conveniado dentro dos 30 minutos gratuitos ===");
        imprimir(new Tiquete("GRA7T15", 25, new PerfilConveniado()));
    }

    private static void imprimir(Tiquete t) {
        System.out.printf("Placa %s | %d min | Perfil %-10s | Valor: R$ %.2f%n",
                t.getPlaca(), t.getMinutosPermanencia(), t.getPerfil().getNome(), t.calcularValor());
    }
}
