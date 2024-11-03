package Equipamentos;
import Personagens.Personagem;

public class Armadura extends Equipamento {

    private int vida;

    public Armadura(String nome) {
        super(nome);
        this.vida = 5;
    }

    @Override
    protected int getValorEfeito() {
        return vida;
    }

    @Override
    protected void aplicarEfeito(Personagem personagem, int valor) {
        int novaVida = personagem.getVida() + valor;
        personagem.setVida(novaVida);
    }
}