package exfarmacia;

public class Perfumaria extends Farmacia {

	public Perfumaria(String nome, String tipo, int estoque, double preco, String fabricante, String fragrancia) {
		super(nome, tipo, estoque, preco, fabricante);
		 this.fragrancia = fragrancia;
    }
    
    public String getFragrancia() {
        return fragrancia;
    }
    
    public void setFragrancia(String fragrancia {
        this.fragrancia = fragrancia;
    }
    
    public void visualizar() {
        System.out.println("Produto: " + getNome());
        System.out.println("Tipo: " + getTipo());
        System.out.println("Estoque: " + getEstoque());
        System.out.println("Preço: " + getPreco());
        System.out.println("Fabricante: " + getFabricante());
        System.out.println("Fragrância: " + getFragrancia());
	}

}
