package excliente;

public class TesteCliente {

	public static void main(String[] args) {
		
		PessoaFisica pf1 = new PessoaFisica("Renata Vasconcelos",  "111.222.333-44", 34, "Rua Estudios, 5", "(021) 99999-9999", "78.910.786-5");
		PessoaFisica pf2 = new PessoaFisica("William Bonner", "555.666.777-88", 57, "Rua Globo, 1", "(021) 98989-8989", "12.340.456-4");

		PessoaJuridica pj1 = new PessoaJuridica("Empresa Globo", "12.345.678/0001-00", 50, "Rua Estudios, 1", "3333-3333", "globo@gmail.com", "Globo");
        PessoaJuridica pj2 = new PessoaJuridica("Empresa Globe", "98.765.432/0001-00", 5, "Rua Globo, 5", "4444-4444", "globe@gmail.com", "Globe");
        
        pf1.visualizar();
        pf2.visualizar();
        pj1.visualizar();
        pj2.visualizar();
    }
}

