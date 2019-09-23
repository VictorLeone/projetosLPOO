public class Gerente extends AbsFuncionario{
    private final double gratificacao = 0.3;
    
    @Override
    public double definirSalario() {
       salario = salario + (salario*gratificacao);
        return salario;
    }
    
    @Override
        public void ImprimeCadastro(){
        super.ImprimeCadastro();
        System.out.println(definirSalario());
    } 
}
