public class Passageiros extends Veiculo{
    
    int qPortas;
    int qPassageiros;
    String opcionais;

    public Passageiros(String placa, String procedencia, String marca, String modelo, int anoModelo, int anoFabricacao,
    String chassi, int renavam, String corInt, String corExt, String combustivel, String motor,
    int kilometragem, double consumoM, int qPortas, int qPassageiros, String opcionais) {
        super(placa, procedencia, marca, modelo, anoModelo, anoFabricacao, chassi, renavam, corInt, corExt, combustivel, motor, kilometragem, consumoM);
        this.qPortas = qPortas;
        this.qPassageiros = qPassageiros;
        this.opcionais = opcionais;
    }

    
}
