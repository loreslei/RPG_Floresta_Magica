package Cenarios;

public class FimDerrota extends Cenario {
    public FimDerrota(ControleCenario controle) {
        super(controle);
    }

    @Override
    public void exibir() {
        System.out.println("Derrota! Você foi derrotado pelo inimigo.");
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

