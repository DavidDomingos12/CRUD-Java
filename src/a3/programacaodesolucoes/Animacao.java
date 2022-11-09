/*
        SISTEMA DE ANIMAÇÃO
 */
package a3.programacaodesolucoes;

/**
 *
 * @author 1272228159
 */
public class Animacao {
    private String nome;
    private String diretor;
    private String lancamento;
    private int temporada;
    private int episodios;
    private double nota;
    private String dublagem;
    private String idioma;

    public Animacao
        (String nome, String diretor, String lancamento, int temporada, int episodios, double nota ,String dublagem, String idioma)
    {
        this.nome = nome;
        this.diretor = diretor;
        this.lancamento = lancamento;
        this.temporada = temporada;
        this.episodios = episodios;
        this.nota = nota;
        this.dublagem = dublagem;
        this.idioma = idioma;
    }

     public void imprimir_dados()
    {
        System.out.println("------ Informações da animação -------");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Diretor: " + this.getDiretor());
        System.out.println("Lancamento: " + this.getLancamento());
        System.out.println("Temporada: " + this.getTemporada());
        System.out.println("Episodios: " + this.getEpisodios());   
        System.out.println("Dublagem: " + this.getDublagem());   
        System.out.println("Idioma: " + this.getIdioma());   
    }
    //                                  GET E SET                        //
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

    public String getDublagem() {
        return dublagem;
    }


    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
    
}
