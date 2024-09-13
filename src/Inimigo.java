

public class Inimigo {
    public static final int VIDA_MAX = 80;
    private String nome;
    private int vida;
    private int ataque;
    private int defesa;

    public Inimigo(String nome)
    {
        this.nome = nome;
        this.vida = VIDA_MAX;
        this.ataque = 19;
        this.defesa = 10;
    }
    public int getVida() {
        return vida;
    }

    public void levarDano(int dano) {
        this.vida -= dano;
    }

    public String getNome()
    {
        return nome;
    }

    public void setVida(int vida) {this.vida = vida;}
    public int getAtaque() {return ataque;}

    public void setAtaque(int ataque) {this.ataque = ataque;}

    public int getDefesa() {return defesa;}

    public void setDefesa(int defesa) {this.defesa = defesa;}
}

