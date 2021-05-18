package TP3.Desafio;

public class Humano {
    protected String nome;
    protected char sexo;
    protected String idade;
    protected String lingua;
    protected String etnia;

    public Humano (String nome, char sexo, String idade, String lingua, String etnia) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.lingua = lingua;
        this.etnia = etnia;
    }

    public String getNome() {
        return nome;
    }
    public char getsexo() {
        return sexo;
    }
    public String getIdade() {
        return idade;
    }
    public String getLingua(){
        return lingua;
    }
    public String getEtnia(){
        return etnia;
    }
    public String toString(){
        return getNome()+""+getsexo()+""+getIdade()+""+getLingua()+""+getEtnia();
    }


}
