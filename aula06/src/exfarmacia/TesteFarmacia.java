package exfarmacia;

public class TesteFarmacia {

	public static void main(String[] args) {
		
		 Medicamento med1 = new Medicamento("Aspirina", "Analgésico", 50, 5.99, "Bayer", "Bayer");
	        Medicamento med2 = new Medicamento("Tylenol", "Analgésico", 30, 7.99, "J&J", "J&J");
	        
	        Perfumaria perf1 = new Perfumaria("Perfume A", "Fragrância", 20, 50.99, "L'Oreal", "Floral");
	        Perfumaria perf2 = new Perfumaria("Perfume B", "Fragrância", 10, 80.99, "Chanel", "Amadeirado");
	        
	        System.out.println("Informações do medicamento 1:");
	        med1.visualizar();
	        
	        System.out.println("\nInformações do medicamento 2:");
	        med2.visualizar();
	        
	        System.out.println("\nInformações do perfume 1:");
	        perf1.visualizar();
	        
	        System.out.println("\nInformações do perfume 2:");
	        perf2.visualizar();
	    }
	}