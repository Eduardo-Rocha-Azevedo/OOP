public class Carro {
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    public Carro(String marca, String modelo, int numPassageiros) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        System.out.println("Chamando construtor com 3 parâmetros");
    
    }

     public Carro(String marca, String modelo) {
        this(marca, modelo, 10);
        System.out.println("Chamando construtor com 2 parâmetros");
    }

    public void exibirAutonomia() {
        System.out.println("A autonomia do carro é: " + this.capCombustivel * this.consumoCombustivel + " km");
    }

    public double obterAutonomia() {
        System.out.println("Método obterAutonomia foi chamado.");
        return this.capCombustivel * this.consumoCombustivel;
    }

    public double calcularCombustivel(double km) {
        double qtdCombustivel = km/this.consumoCombustivel;
        return qtdCombustivel;
    }
   
}
