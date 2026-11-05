# Padrões de Projeto — Atividade

Autor: Matheus Henrique Farias de Jesus — Engenharia de Software, Universidade Positivo

| Questão | Pacote | Padrão | Por quê |
|---|---|---|---|
| 1 — Monitor de Estoque | `questao1` | **Observer** | O produto (Subject) notifica automaticamente as áreas (Observers) quando a quantidade muda; áreas entram e saem em tempo de execução sem alterar `Produto`. |
| 2 — Tarifa de Estacionamento | `questao2` | **Strategy** | Cada perfil encapsula sua regra de cobrança; o `Tiquete` (Context) delega o cálculo e pode trocar de perfil em tempo de execução, sem `if/else`/`switch`. |
| 3 — Pedido de Café | `questao3` | **Decorator** | Complementos envolvem a bebida base e somam descrição e preço, em qualquer combinação e quantidade, sem classes de combinações prontas. |

## Valores definidos (constantes nomeadas)

- **Questão 2:** `PerfilRotativo.VALOR_POR_HORA = 10.00`, `PerfilMensalista.VALOR_FIXO = 5.00`,
  `PerfilConveniado.MINUTOS_GRATUITOS = 30`, `PerfilConveniado.VALOR_POR_HORA = 10.00`,
  `PerfilConveniado.PERCENTUAL_DESCONTO = 20%`.
- **Questão 3:** Espresso R$ 6,00 · Chá R$ 4,50 · Leite R$ 1,50 · Chantilly R$ 2,00 · Calda R$ 1,75.

## Como executar (Java 17+)

```bash
javac -encoding UTF-8 -d out $(find src -name "*.java")
java -cp out questao1.Main
java -cp out questao2.Main
java -cp out questao3.Main
```
