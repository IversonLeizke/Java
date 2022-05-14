import javax.sound.sampled.SourceDataLine;

public class App {
    public static void main(String[] args) throws Exception {

        Passageiros onibus1 = new Passageiros("AD9Q786", "Nacional", "Volksvagen", "15.190", 2020, 2019, "A956DF904", 96429837, "Branco", "Azul", "Diesel", "Cumins", 127580, 4.3, 3, 32, "Ar-Condicionado");

        Veiculo caminhao1 = new Carga("AE9R239", "Nacional", "Volksvagen", "17.140", 1999, 1998, "R95F9A096", 567624952, "Branco", "Branco", "Diesel", "Cumins", 432599, 4.8, 10000, 1.7, 3.5, 6.8);
    }
}
