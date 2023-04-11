package exfarmacia;

public class TesteFarmacia {

	public static void main(String[] args) {
		
        Farmacia produto1 = new Farmacia("Aspirina", "Analgésico", 55, 4.0, "Bayer");
        Farmacia produto2 = new Farmacia("Dipirona", "Analgésico", 39, 2.0, "Sanofi");

        produto1.visualizar();
        System.out.println("********************");
        produto2.visualizar();
        
	}
}
