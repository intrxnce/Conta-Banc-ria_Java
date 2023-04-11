package excliente;

public class PessoaJuridica extends Cliente {
	
    private String cnpj;
    private String razaoSocial;
    
    public PessoaJuridica(String nome, String cpf, int idade, String endereco, String telefone, String cnpj, String razaoSocial) {
        super(nome, cpf, idade, endereco, telefone);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }
    
    public String getCnpj() {
        return cnpj;
    }
    
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    public String getRazaoSocial() {
        return razaoSocial;
    }
    
    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
    
    @Override
    public void visualizar() {
        super.visualizar();
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Razão Social: " + razaoSocial);
    }
}