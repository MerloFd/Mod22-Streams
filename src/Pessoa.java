public class Pessoa {
    private String nome;
    private String genero;

    public Pessoa (String nome, String gen){
        this.nome=nome;
        this.genero=gen;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return nome;
    }
}
