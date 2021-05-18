package TP3.Equipamento;

public class EquipamentoSonoro extends Equipamento {
    //Atributos
    private short volume;
    private boolean stereo;

    //Metodos para ler e alterar o volume (getter e setter)
    public short getVolume() {
        return volume;
    }

    public void setVolume(short volume) {
        this.volume = volume;
    }

    //Metodo mono
    public void mono(boolean falso){
          stereo = false; // O metodo mono torna o atributo stereo falso
    }
    //Metodo stereo
    public void stereo() {
         stereo = true; // O metodo stereo torna o atributo stereo verdadeiro
    }

    //Metodo liga
    public boolean liga(){
        setVolume(5);
        super.liga();
        return false;
    }

    private void setVolume(int volume) {
    }

    //Metodo principal
    public static void main(String[] args) {

        /*Ligar o Equipamento através do método liga, seu volume é automaticamente ajustado para 5. */


            // Instanciando um objeto, criando o objeto "volume"
            EquipamentoSonoro v = new EquipamentoSonoro();

            v.liga();


            //Imprime volume do equipamento sonoro
            System.out.println("Volume "+v.getVolume());
        }


    }


