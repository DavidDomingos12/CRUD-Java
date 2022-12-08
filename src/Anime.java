public class Anime extends Animacao {
    private String categoria;
    private String origem;
    
    public Anime(int id,String nome, String diretor, String lancamento, int temporada, int episodios, double nota,
            String dublagem, String idioma, String categoria, String origem) {
    	
        super(id, nome, diretor, lancamento, temporada, episodios, nota, dublagem, idioma);
        this.categoria = categoria;
        this.origem = origem;
    }
    
    @Override
    public void showInfo() {
        System.out.println("ID :" + this.getId());
        System.out.println("Nome: " + this.getNome());
        System.out.println("Diretor: " + this.getDiretor());
        System.out.println("Lançamento: " + this.getLancamento());
        System.out.println("Temporada: " + this.getTemporada());
        System.out.println("Episodios: " + this.getEpisodios());
        System.out.println("Nota: " + this.getNota());
        System.out.println("Dublagem: " + this.getDublagem());
        System.out.println("Idioma: " + this.getIdioma());
        System.out.println("Categoria: " + this.getCategoria());
        System.out.println("Origem: " + this.getOrigem());


    }

    public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	
}
