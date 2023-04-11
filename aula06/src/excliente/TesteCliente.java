package excliente;

public class TesteCliente {

	public static void main(String[] args) {
		
        Cliente cliente1 = new Cliente("Renata Vasconcelos", "111.222.333-44", 45, "Rua A, 123", "(021) 99999-9999");
        Cliente cliente2 = new Cliente("William Bonner", "555.666.777-88", 60, "Rua B, 456", "(021) 98989-8989");

        cliente1.visualizar();
        System.out.println("****************************");
        cliente2.visualizar();
    }
}

