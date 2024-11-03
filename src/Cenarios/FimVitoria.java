package Cenarios;

public class FimVitoria extends Cenario {
    public FimVitoria(ControleCenario controle) {
        super(controle);
    }

    @Override
    public void exibir() {
        System.out.println("Vitória! Você derrotou o inimigo e saiu da Floresta!");
        System.out.println("0 - Reiniciar o jogo");
        System.out.println("1 - Sair");
    }

    @Override
    public void proximoCenario(int opcao) {
        if (opcao == 0) {
            controle.reiniciarJogo();
        } else if (opcao == 1) {
            System.exit(0);
        }
    }
}
