package Cenarios;

public class FimFuga extends Cenario {
    public FimFuga(ControleCenario controle) {
        super(controle);
    }

    @Override
    public void exibir() {
        System.out.println("Fuga! Você fugiu do inimigo e retornou para casa em segurança.");
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

