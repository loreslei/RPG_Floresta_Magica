package Cenarios;
import Equipamentos.*;


public class BauTesouro extends Cenario {

    private final Equipamento arma = new Arma("Espada");
    public BauTesouro(ControleCenario controle) {
        super(controle);
    }


    @Override
    public void exibir() {
        controle.getConflito().getHeroi().equipar(arma);
        System.out.println("Baú do Tesouro: Você ganhou uma ARMA !!");
        System.out.println("0 - Esquerda");
        System.out.println("1 - Direita");
    }

    @Override
    public void proximoCenario(int opcao) {
        if (opcao == 0) {
            controle.setCenarioAtual(new CabanaCacador(controle));
        } else if (opcao == 1) {
            controle.setCenarioAtual(new CampoBatalha(controle));
        }
    }

}