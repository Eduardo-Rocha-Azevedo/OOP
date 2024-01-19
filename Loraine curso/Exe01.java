

public class Exe01 {
    public static void main(String[] args) {

      Lampada lamp = new Lampada();
      lamp.modelo = "LED";
      lamp.tensao = "120V";
      lamp.garantiaMeses = 10;
      lamp.cor = "Branco quente";
      lamp.getLigada();
    
  
      lamp.getStatus(lamp);

      System.out.println("\nLigar a lampada\n");
    
      lamp.ligarLampada(lamp);
      lamp.getStatus(lamp);

      System.out.println("\nDesligar a lampada\n");
      lamp.desligarLampada(lamp);
      lamp.getStatus(lamp);
     
      // =============================

    /* */
  }
}
