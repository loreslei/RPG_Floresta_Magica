package Cenarios;

public class CaminhoEsquerda extends Cenario {
    public CaminhoEsquerda(ControleCenario controle) {
        super(controle);
    }

    @Override
    public void exibir() {
        System.out.println("Caminho à Esquerda: O caminho é tranquilo, mas você sente que está sendo observado.");
        System.out.println("0 - Abrir o Bau");
        System.out.println("1 - Voltar para a entrada da floresta");
    }

    @Override
    public void proximoCenario(int opcao) {
        if (opcao == 0) {
            controle.setCenarioAtual(new BauTesouro(controle));
        } else if (opcao == 1) {
            controle.voltarCenario();
        }
    }
}


