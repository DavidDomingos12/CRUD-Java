
public class Animacao {

    private int id;
    private String nome;
    private String diretor;
    private String lancamento;
    private int temporada;
    private int episodios;
    private double nota;
    private String dublagem;
    private String idioma;

    public Animacao(String nome, String diretor, String lancamento, int temporada, int episodios, double nota,
            String dublagem, String idioma) {
        this.nome = nome;
        this.diretor = diretor;
        this.lancamento = lancamento;
        this.temporada = temporada;
        this.episodios = episodios;
        this.nota = nota;
        this.dublagem = dublagem;
        this.idioma = idioma;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getLancamento() {
        return lancamento;
    }

    public void setLancamento(String lancamento) {
        this.lancamento = lancamento;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getDublagem() {
        return dublagem;
    }

    public void setDublagem(String dublagem) {
        this.dublagem = dublagem;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

}
