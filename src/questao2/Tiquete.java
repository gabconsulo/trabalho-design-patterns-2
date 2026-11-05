package questao2;

/**
 * Context do padrão Strategy: o tíquete delega o cálculo ao perfil atual,
 * sem if/else ou switch sobre o tipo de cliente (RQ2.7).
 */
public class Tiquete {
    private final String placa;
    private final int minutosPermanencia;
    private PerfilCobranca perfil;

    public Tiquete(String placa, int minutosPermanencia, PerfilCobranca perfil) {
        if (minutosPermanencia < 0) {
            throw new IllegalArgumentException("Tempo de permanência não pode ser negativo");
        }
        this.placa = placa;
        this.minutosPermanencia = minutosPermanencia;
        this.perfil = perfil;
    }

    /** RQ2.6: troca o perfil de cobrança em tempo de execução. */
    public void setPerfil(PerfilCobranca perfil) {
        this.perfil = perfil;
    }

    public double calcularValor() {
        return perfil.calcular(minutosPermanencia);
    }

    public String getPlaca() {
        return placa;
    }

    public int getMinutosPermanencia() {
        return minutosPermanencia;
    }

    public PerfilCobranca getPerfil() {
        return perfil;
    }
}
