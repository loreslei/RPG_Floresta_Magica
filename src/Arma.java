public class Arma extends Equipamento {

    private int ataque;

    public Arma(String nome) {
        super(nome);
        this.ataque = 5;

    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public void adicionarEfeito(Personagem personagem)
    {
        int ataque = personagem.getAtaque()+this.ataque;
        personagem.setAtaque(ataque);
    }
    public void removerEfeito(Personagem personagem,Equipamento equipamento)
    {
        int ataque = personagem.getAtaque()-this.ataque;
        personagem.setAtaque(ataque);
    }

}
