public class Veiculo {

    String placa;
    String procedencia;
    String marca;
    String modelo;
    int anoModelo;
    int anoFabricacao;
    String chassi;
    int renavam;
    String corInt;
    String corExt;
    String combustivel;
    String motor;
    int kilometragem;
    double consumoM;
    
    public Veiculo(String placa, String procedencia, String marca, String modelo, int anoModelo, int anoFabricacao,
            String chassi, int renavam, String corInt, String corExt, String combustivel, String motor,
            int kilometragem, double consumoM) {
        this.placa = placa;
        this.procedencia = procedencia;
        this.marca = marca;
        this.modelo = modelo;
        this.anoModelo = anoModelo;
        this.anoFabricacao = anoFabricacao;
        this.chassi = chassi;
        this.renavam = renavam;
        this.corInt = corInt;
        this.corExt = corExt;
        this.combustivel = combustivel;
        this.motor = motor;
        this.kilometragem = kilometragem;
        this.consumoM = consumoM;
    }

}