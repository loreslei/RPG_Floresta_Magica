package Cenarios;


public abstract class Cenario {
    protected ControleCenario controle;

    public Cenario(ControleCenario controle) {
        this.controle = controle;
    }

    public abstract void exibir();
    public abstract void proximoCenario(int opcao);
}
