package questao2;

/** Rotativo: cobra um valor por hora iniciada. */
public class PerfilRotativo implements PerfilCobranca {
    public static final double VALOR_POR_HORA = 10.00;

    @Override
    public double calcular(int minutos) {
        return HorasUtil.horasIniciadas(minutos) * VALOR_POR_HORA;
    }

    @Override
    public String getNome() {
        return "Rotativo";
    }
}
