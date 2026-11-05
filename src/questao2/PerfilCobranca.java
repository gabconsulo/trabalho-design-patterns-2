package questao2;

/**
 * Strategy: cada perfil de cliente encapsula sua própria regra de cobrança.
 * Um novo perfil é só uma nova implementação desta interface (RQ2.8).
 */
public interface PerfilCobranca {
    double calcular(int minutos);

    String getNome();
}
