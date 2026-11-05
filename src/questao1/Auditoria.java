package questao1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Auditoria implements ObservadorEstoque {
    private final List<String> registros = new ArrayList<>();

    @Override
    public void atualizar(String nomeProduto, int quantidadeAnterior, int novaQuantidade) {
        String registro = "'" + nomeProduto + "': " + quantidadeAnterior + " -> " + novaQuantidade;
        registros.add(registro);
        System.out.println("  [AUDITORIA] Registro #" + registros.size() + ": " + registro);
    }

    public List<String> getRegistros() {
        return Collections.unmodifiableList(registros);
    }
}
