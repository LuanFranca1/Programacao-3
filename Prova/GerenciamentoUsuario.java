import java.util.ArrayList;


public class GerenciamentoUsuario {

    private String nome;
    private int cpf;

    ArrayList<String>usuarios = new ArrayList<String>();


    public void adicionarUsuario(String nome,int cpf){

        if(cpf == 11 && cpf<= 0 && cpf>=9){// cpf só pode ter 11 númeroo
            usuarios = this.getCpf();


        }
    }
    public boolean removerUsuario(String nome,int cpf){
        if() {

        }

    }

    public void tirarRepetido(String nome,String cpf){

    }
    public GerenciamentoUsuario(String nome, int cpf) {
        this.nome = nome;
        this.cpf = cpf;
        ArrayList<String>usuarios = new ArrayList<String>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
}
