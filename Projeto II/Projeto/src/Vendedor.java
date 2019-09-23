public class Vendedor extends AbsFuncionario{
    private final double bonus = 0.0515;
       
    @Override
    public double definirSalario() {
       salario = salario + (salario*bonus);
        return salario;
    }

    @Override
        public void ImprimeCadastro(){
        super.ImprimeCadastro();
        System.out.println(definirSalario());
    } 

}
