public class Lampada{
    String modelo;
    String tensao;
    int potencia;
    String cor;
    String tipoLuz;
    int garantiaMeses;
    String[] tipos;
    boolean tipoAbajur;
    private boolean ligada;

    public Lampada(){
       // this.ligada = false;
    }
   

    public boolean ligarLampada(Lampada lamp){
       if(lamp.ligada == false){
           lamp.ligada = true;
           return true;
        }
        return false;
    }

    public boolean desligarLampada(Lampada lamp){
       if(lamp.ligada == true){
           lamp.ligada = false;
           return false;
        }
        return false;
    }

    public boolean getLigada(){
        return ligada;
    }   

    public void getStatus(Lampada lamp){
        System.out.print("Modelo: " + modelo +"\n");
        System.out.print("Tensao; "+tensao + "\n");
        System.out.print("Garantia: " + garantiaMeses + "\n");
        System.out.print("Cor: "+ cor + "\n");
        System.out.print("Ligada: " + ligada + "\n");
        System.out.print("============================");
    }
}