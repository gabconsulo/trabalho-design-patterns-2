package questao2;

public class PerfilConveniado implements PerfilCobranca {
    public static final int MINUTOS_GRATUITOS = 30;
    public static final double VALOR_POR_HORA = 10.00;
    public static final double PERCENTUAL_DESCONTO = 20.0;

    @Override
    public double calcular(int minutos) {
        int minutosCobrados = Math.max(0, minutos - MINUTOS_GRATUITOS);
        double valorBruto = HorasUtil.horasIniciadas(minutosCobrados) * VALOR_POR_HORA;
        return valorBruto * (1 - PERCENTUAL_DESCONTO / 100.0);
    }

    @Override
    public String getNome() {
        return "Conveniado";
    }
}
