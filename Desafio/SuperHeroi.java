package TP3.Desafio;

public class SuperHeroi extends Humano implements Inseto {
    String codinome;
    String trauma;
    String poderes;

public SuperHeroi(String nome, char sexo, String idade, String lingua, String etnia, String codinome, String trauma, String poderes) {
    super(nome, sexo, idade, lingua, etnia);
    this.codinome = codinome;
    this.trauma = trauma;
    this.poderes = poderes;
}

public String obternome(){
    return "Abelha";
}
public boolean obterveneno() {
    return true;
}
    public boolean obterasa() {
        return true;
    }

    public boolean obterferrao() {
        return true;
    }

    public String toString() {
        return super.toString()+codinome+trauma+poderes+obternome()+obterveneno()+obterasa()+obterferrao();
    }
}

