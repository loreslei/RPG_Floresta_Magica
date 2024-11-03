package Equipamentos;
import Personagens.Personagem;

public class Escudo extends Equipamento {

    private int defesa;

    public Escudo(String nome) {
        super(nome);
        this.defesa = 3;
    }

    @Override
    protected int getValorEfeito() {
        return defesa;
    }

    @Override
    protected void aplicarEfeito(Personagem personagem, int valor) {
        int novaDefesa = personagem.getDefesa() + valor;
        personagem.setDefesa(novaDefesa);
    }
}