import java.util.ArrayList;

public class Livros {

    private String livroF;
    private String livroD;

    public Livros(){
        ArrayList<String>livros = new ArrayList<>();
    }


    public void livroFisico(String livroF){ //

    }
    public void livroDigital(String livroD){

    }

    public String getLivroF() {
        return livroF;
    }

    public void setLivroF(String livroF) {
        this.livroF = livroF;
    }

    public String getLivroD() {
        return livroD;
    }

    public void setLivroD(String livroD) {
        this.livroD = livroD;
    }
}
