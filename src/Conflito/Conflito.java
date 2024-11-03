package Conflito;
import Personagens.*;
public class Conflito {

    private Personagem heroi;
    private Inimigo inimigo;
    public Conflito(String nomeHeroi, String nomeInimigo) {
        this.heroi = Personagem.getInstanciaPersonagem(nomeHeroi);
        this.inimigo = Inimigo.getInstanciaInimigo(nomeInimigo);
    }

    public Personagem getHeroi() {
        return heroi;
    }

    public Inimigo getInimigo() {
        return inimigo;
    }

    public String lutar() {
        while(heroi.getVida() > 0 && inimigo.getVida() > 0){
            atacar(inimigo);
            if(inimigo.getVida() > 0) {atacar(heroi);}
            imprimirLuta();
            try {
                Thread.sleep(25*100);
            }catch (InterruptedException e){e.printStackTrace();}
        }
        if(heroi.getVida() > inimigo.getVida()){return "heroi";}
        else {return "inimigo";}
    }
    
    public void imprimirLuta() {
        System.out.println();
        //System.out.println("------------------------------------------------------------------");
        System.out.println(heroi.getNome()+"("+(Math.max(heroi.getVida(), 0))+" de vida)\n"
                + inimigo.getNome()+"("+(Math.max(inimigo.getVida(), 0))+" de vida)");
        System.out.println("-------------------------------------------------------------------");
        System.out.println();
    }

    public void atacar(Inimigo inimigo) {

        int dano = heroi.getAtaque() - inimigo.getDefesa();
        if(dano  > 0) {
            inimigo.levarDano(dano);
            System.out.println(heroi.getNome()+" causou : "+ dano +" de dano ");
        }
        else {System.out.println("Personagens.Inimigo defendeu!");}
    }

    public void atacar(Personagem personagem) {

        int dano = inimigo.getAtaque() - personagem.getDefesa();
        if(dano  > 0) {
            personagem.levarDano(dano);
            System.out.println(inimigo.getNome()+" causou : "+ dano +" de dano ");
        }
        else {System.out.println("Você defendeu!");}
    }

}