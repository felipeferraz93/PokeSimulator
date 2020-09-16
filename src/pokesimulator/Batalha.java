
package pokesimulator;

import java.util.Random;

public class Batalha {
    
    private int life1;
    private int life2;
    private Pokemon pokemon1;
    private Pokemon pokemon2;
    
    public Batalha(Pokemon pokemon1, Pokemon pokemon2){
        this.life1 = pokemon1.getVida();
        this.life2 = pokemon2.getVida();
        this.pokemon1 = pokemon1;
        this.pokemon2 = pokemon2;
    }
    
    public void letsBattle(){
        
        while(life1>0 && life2>0){
            life1 = life1 - (pokemon2.getAtaque() - pokemon1.getDefesa())*accuracy(pokemon2.getAcertividade());
            if(life1>0){
                life2 = life2 - (pokemon1.getAtaque() - pokemon2.getDefesa())*accuracy(pokemon1.getAcertividade()); 
            }
            
        }
        
        if(life1<=0){
            System.out.println("O vencedor é: " + pokemon2.getNome() + "!");
        }else{
           System.out.println("O vencedor é: " + pokemon1.getNome() + "!"); 
        }
        System.out.println("Placar");
        System.out.println(pokemon1.getNome() + ": " + life1);
        System.out.println(pokemon2.getNome() + ": " + life2);
    }
    
    public int accuracy(int acertividade){
        Random rand = new Random(); 
        if(rand.nextInt(11)>acertividade){
           return 0; 
        }
        return 1;
    }
}
