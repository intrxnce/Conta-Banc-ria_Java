package excliente;

public class PessoaFisica extends Cliente {

private String rg;
    
    public PessoaFisica(String nome, String cpf, int idade, String endereco, String telefone, String rg) {
        super(nome, cpf, idade, endereco, telefone);
        this.rg = rg;
    }
    
    public String getRg() {
        return rg;
    }
    
    public void setRg(String rg) {
        this.rg = rg;
    }
    
    @Override
    public void visualizar() {
        super.visualizar();
        System.out.println("RG: " + rg);
    }
}