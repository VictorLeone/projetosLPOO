public class Cliente extends Pessoa {

    private String codCliente;

    public String getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(String codCliente) {
        this.codCliente = codCliente;
    }
    
    @Override
       public void ImprimeCadastro(){
        super.ImprimeCadastro();
        System.out.println(getCodCliente());
    } 
}
