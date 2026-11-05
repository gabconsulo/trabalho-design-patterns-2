package questao2;

final class HorasUtil {
    private static final int MINUTOS_POR_HORA = 60;

    private HorasUtil() {
    }

    static int horasIniciadas(int minutos) {
        return (minutos + MINUTOS_POR_HORA - 1) / MINUTOS_POR_HORA;
    }
}
