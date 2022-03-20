import Modelo.Cliente;
import Modelo.Veiculo;

public class Principal {
    
    public static void main(String[] args) {
        Cliente customer1 = new Cliente("99999999999", "Iverson", "Guaramirim-SC", "email@email.com", "99-99999-9999");
        Veiculo car1 = new Veiculo("ABC4E678", "Onix", 2019, "Chevrolet", "Preto");
        customer1.showCustomer();
        car1.showCar();
    }
}
