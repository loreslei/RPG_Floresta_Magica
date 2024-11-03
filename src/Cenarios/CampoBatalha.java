package Cenarios;
import Equipamentos.*;


public class CampoBatalha extends Cenario {

    private final Equipamento escudo = new Escudo("Escudo");
    public CampoBatalha(ControleCenario controle) {
        super(controle);
    }

    @Override
    public void exibir() {
        controle.getConflito().getHeroi().equipar(escudo);
        System.out.println("Você encontrou vários esqueletos e no meio deles achou um ESCUDO.");
        System.out.println("0 - Seguir em frente");
        System.out.println("1 - Voltar");
    }

    @Override
    public void proximoCenario(int opcao) {
        if (opcao == 0) {
            controle.setCenarioAtual(new CenarioInimigo(controle));
        } else if (opcao == 1) {
            controle.voltarCenario();
        }
    }

}