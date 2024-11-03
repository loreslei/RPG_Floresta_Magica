package Cenarios;

public class CaminhoDireita extends Cenario {
    public CaminhoDireita(ControleCenario controle) {
        super(controle);
    }

    @Override
    public void exibir() {
        System.out.println("Caminho à Direita: O caminho à direita é íngreme e perigoso.");
        System.out.println("0 - Continuar");
        System.out.println("1 - Fugir");
    }

    @Override
    public void proximoCenario(int opcao) {
        if (opcao == 0)
        {
            controle.setCenarioAtual(new CenarioInimigo(controle));
        } else if (opcao == 1) {
            controle.setCenarioAtual(new FimFuga(controle));
        }
    }
}