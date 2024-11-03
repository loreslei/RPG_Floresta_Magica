package Cenarios;

public class Inicio extends Cenario {
    public Inicio(ControleCenario controle) {
        super(controle);
    }

    @Override
    public void exibir() {
        System.out.println("Entrada da Floresta: Você está na entrada de uma floresta sombria. Há dois caminhos.");
        System.out.println("0 - Esquerda");
        System.out.println("1 - Direita");
    }

    @Override
    public void proximoCenario(int opcao) {
        if (opcao == 0) {
            controle.setCenarioAtual(new CaminhoEsquerda(controle));
        } else if (opcao == 1) {
            controle.setCenarioAtual(new CaminhoDireita(controle));
        }
    }
}