public class Armadura extends Equipamento {

    private int vida;

    public Armadura(String nome) {
        super(nome);
        this.vida = 5;
    }

    public void adicionarEfeito(Personagem personagem)
    {
        int vida = personagem.getVida()+this.vida;
        personagem.setVida(vida);
    }
    public void removerEfeito(Personagem personagem,Equipamento equipamento)
    {
        int vida = personagem.getVida()-this.vida;
        personagem.setVida(vida);
    }
}