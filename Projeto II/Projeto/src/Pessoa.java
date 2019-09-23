import java.util.Calendar;
import java.util.GregorianCalendar;

public class Pessoa {

    private String cpf;
    private String nome;
    private String dtNasc;
    private String telefone;
    private String email;
    private String sexo;
    private int idade;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDtNasc() {
        return dtNasc;
    }

    public void setDtNasc(String dtNasc) {
        this.dtNasc = dtNasc;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

 public int getIdade() {

        GregorianCalendar atual = new GregorianCalendar();
        int dAtual = atual.get(Calendar.DAY_OF_MONTH);
        int mAtual = atual.get(Calendar.MONTH)+1;
        int aAtual = atual.get(Calendar.YEAR);

        int dNasc = Integer.valueOf(dtNasc.substring(0,2));
        int mNasc = Integer.valueOf(dtNasc.substring(3,5));
        int aNasc = Integer.valueOf(dtNasc.substring(6,10));

        if ((mNasc < mAtual) || (mNasc == mAtual && dNasc <= dAtual)) {
            idade = (aAtual - aNasc);
        } else {
            idade = ((aAtual - aNasc) - 1);
        }
        return idade;
   }
    
    public void ImprimeCadastro(){
        System.out.println(getCpf());
        System.out.println(getNome());
        System.out.println(getDtNasc());
        System.out.println(getTelefone());
        System.out.println(getEmail());
        System.out.println(getSexo());
        System.out.println(getIdade());
    }
}
