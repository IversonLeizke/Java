public class Carga extends Veiculo{
    int capacidade;
    double altura;
    double largura;
    double comprimento;
    public Carga(String placa, String procedencia, String marca, String modelo, int anoModelo, int anoFabricacao,
            String chassi, int renavam, String corInt, String corExt, String combustivel, String motor,
            int kilometragem, double consumoM, int capacidade, double altura, double largura, double comprimento) {
        super(placa, procedencia, marca, modelo, anoModelo, anoFabricacao, chassi, renavam, corInt, corExt, combustivel,
                motor, kilometragem, consumoM);
        this.capacidade = capacidade;
        this.altura = altura;
        this.largura = largura;
        this.comprimento = comprimento;
    }

}
