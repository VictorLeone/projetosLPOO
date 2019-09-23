abstract class AbsFuncionario extends Pessoa{
    private String matricula;
    private String departamento; 
    double salario = 1500.00; 

   public String getMatricula(){
   return matricula;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

   public String getDepartamento(){
   return departamento;
    }

    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }

   public double getSalario(){
   return salario;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public abstract double definirSalario();
    
        @Override
       public void ImprimeCadastro(){
        super.ImprimeCadastro();
        System.out.println(getMatricula());
        System.out.println(getDepartamento());
    } 
}
