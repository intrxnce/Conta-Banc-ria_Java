package exfarmacia;

public class Farmacia {
	
    private String nome;
    private String tipo;
    private int estoque;
    private double preco;
    private String fabricante;

    public Farmacia(String nome, String tipo, int estoque, double preco, String fabricante) {
        this.nome = nome;
        this.tipo = tipo;
        this.estoque = estoque;
        this.preco = preco;
        this.fabricante = fabricante;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void visualizar() {
        System.out.println("Produto: " + this.nome);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Estoque: " + this.estoque);
        System.out.println("Preço: " + this.preco);
        System.out.println("Fabricante: " + this.fabricante);
    }
}

