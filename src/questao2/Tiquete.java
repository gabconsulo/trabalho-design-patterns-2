package questao2;

public class Tiquete {
    private final String placa;
    private final int minutosPermanencia;
    private PerfilCobranca perfil;

    public Tiquete(String placa, int minutosPermanencia, PerfilCobranca perfil) {
        if (placa == null) {
            throw new IllegalArgumentException("Placa não pode ser nula");
        }
        if (minutosPermanencia < 0) {
            throw new IllegalArgumentException("Tempo de permanência não pode ser negativo");
        }
        if (perfil == null) {
            throw new IllegalArgumentException("Perfil de cobrança não pode ser nulo");
        }
        this.placa = placa;
        this.minutosPermanencia = minutosPermanencia;
        this.perfil = perfil;
    }

    public void setPerfil(PerfilCobranca perfil) {
        if (perfil == null) {
            throw new IllegalArgumentException("Perfil de cobrança não pode ser nulo");
        }
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
