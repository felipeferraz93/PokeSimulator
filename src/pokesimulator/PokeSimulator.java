package pokesimulator;

public class PokeSimulator {

    public static void main(String[] args) {
        // TODO code application logic here
       Pokemon meuPokemon = new Pokemon("Charmander","Fogo", 20);
       Pokemon outroPokemon = new Pokemon("Bulbassaur","Planta", 20);   
       
       Batalha batalha = new Batalha(meuPokemon,outroPokemon);
       
       batalha.letsBattle();
       
    }    
}
