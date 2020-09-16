package pokesimulator;

public class Pokemon {

    private String nome;
    private String tipo;
    private int level;
    private int vida = 200;
    private int ataque;
    private int defesa;
    private int acertividade=8;

    public Pokemon(String nome, String tipo, int level) {
        this.nome = nome;
        this.tipo = tipo;
        this.level = level;
        calculaAtributos();        
        calculaBonus();        
        imprimiPokemon();
    }
    
    public int getVida(){
        return this.vida;
    }
    
    public int getAtaque(){
        return this.ataque;
    }
    
    public int getDefesa(){
        return this.defesa;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public int getAcertividade(){
        return this.acertividade;
    }
    

    private void calculaAtributos() {
        switch (tipo) {
            case "Fogo":
                vida = vida - 20;
                ataque = 35;
                defesa = 20;
                break;
            case "Planta":
               vida = 90;
                ataque = 30;
                defesa = 30;
                break;
            case "Agua":
               vida = vida - 10;
                ataque = 20;
                defesa = 35;
                break;
            case "Eletrico":
               vida = vida - 20;
                ataque = 40;
                defesa = 25;
                break;    

        }
    }
    
    private void calculaBonus(){
        vida = vida + (level /2);
        ataque = ataque + (level / 3);
        defesa = defesa + (level /4);
    }

    public void imprimiPokemon() {

        System.out.println(nome + " --> "
                + "Tipo: " + tipo + " | "
                + "Level: " + level + " | "
                + "Vida: " + vida + " | "
                + "Ataque: " + ataque + " | "
                + "Defeasa: " + defesa + " | "
                + "Acertividade do ataque: " + acertividade + "%") ;

    }

}
