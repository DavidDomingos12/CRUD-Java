import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AnimeController {
	 ArrayList<Anime> listaAnimes = new ArrayList<Anime>();

	    String nome, diretor, lancamento, dublagem, idioma, categoria, origem;
	    int temporada, episodios;
	    Scanner scan = new Scanner(System.in);
	    double nota;

	    public void menu() {
	        int opcao = 0;
	        do {
	            System.out.println("------------- MENU -------------");
	            System.out.println("| Digite 0 para sair");
	            System.out.println("| Digite 1 para listar animes");
	            System.out.println("| Digite 2 para adicionar um Anime");
	            System.out.println("| Digite 3 para pesquisar por ID");
	            System.out.println("| Digite 4 para pesquisar um Anime por Nome");
	            System.out.println("| Digite 5 para remover uma Animação");
	            System.out.println("| Digite 6 para alterar uma Animação");
	            System.out.println("---------------------------------------------");
	            opcao = scan.nextInt();

	            switch (opcao) {
	                case 0:
	                    break;
	                case 1:
	                    listarAnimacoes();
	                    break;
	                case 2:
	                	cadastrarAnime();
	                    break;

	                case 3:
	                	pesquisarPorID();
	                    break;

	                case 4:
	                    pesquisarporNome();
	                    break;
	                case 5:
	                	removerAnime();
	                    break;
	                case 6:
	                	alterarAnime();
	                    break;
	            }

	        } while (opcao != 0);
	    }

	    public void listarAnimacoes() {
	    	Collections.sort(listaAnimes);
	        for (int i = 0; i < listaAnimes.size(); i++) {
	        	listaAnimes.get(i).showPartialInfo();
	            System.out.println("__________________________________________________");
	        }
	    }

	    public void cadastrarAnime() {
	        System.out.println(" ---  Cadastre as informações  --- ");
	        System.out.println("Nome:");
	        nome = scan.next();
	        System.out.println("Diretor:");
	        diretor = scan.next();
	        System.out.println("Lancamento:");
	        lancamento = scan.next();
	        System.out.println("Temporada:");
	        temporada = scan.nextInt();
	        System.out.println("Episodios:");
	        episodios = scan.nextInt();
	        System.out.println("Nota");
	        nota = scan.nextDouble();
	        System.out.println("Dublagem:");
	        dublagem = scan.next();
	        System.out.println("Idioma: ");
	        idioma = scan.next();
	        System.out.println("Categoria: ");
	        categoria = scan.next();
	        System.out.println("Origem: ");
	        origem = scan.next();
	        Anime temp = new Anime(listaAnimes.size() + 1, nome,diretor, lancamento, temporada, episodios, nota, dublagem, idioma, categoria, origem);
	        listaAnimes.add(temp);
	        System.out.println(
	                "--------------------------   ANIME CADASTRADO     ------------------------------");
	        System.out.println("\n");
	    }

	    public void pesquisarPorID() {
	        System.out.println("Digite o ID para a pesquisa");
	        int idPesquisa = scan.nextInt();
	        System.out.println(
	                "--------------------------   RESULTADO DA PESQUISA     ------------------------------");
	        try {
		        listaAnimes.get(idPesquisa - 1).showInfo();

	        }
	        catch(Exception e) {
	        	System.out.println("Anime nao encontrado.");
	        }
	       
	        System.out.println("--------------------------------------------------------");
	    }

	    public void pesquisarporNome() {
	        System.out.println("Digite o nome de uma Animacao para pesquisa: ");
	        nome = scan.next();
	        boolean hasAnime = false;
	        for (int i = 0; i < listaAnimes.size(); i++) {
	            Animacao animacao = (Animacao) listaAnimes.get(i); //
	            if (animacao.getNome().equals(nome)) {
	                System.out.println("--------***** LISTA *****--------");
	                listaAnimes.get(i).showInfo();
	                System.out.println("-------------");
	                hasAnime = true;
	            }
	        }
	        if (!hasAnime) {
	            System.out.println("Anime não encontrado!");
	        }
	    }

	    public void removerAnime() {
	        System.out.println("Digite o ID para remover");
	        int idPesquisa = scan.nextInt();
	        System.out.println("Você realmente deseja remover?");
	        System.out.println("1 = SIM");
	        System.out.println("2 = NAO");
	        int opcaoRemover = scan.nextInt();

	        if (opcaoRemover == 1) {
	        	listaAnimes.remove(idPesquisa - 1);
	            System.out.println("Item removido!");
	        } else {
	            System.out.println("Item NÃO removido!");
	           
	        }
	    }

	    public void alterarAnime() {
	        System.out.println("Digite o ID do anime que deseja alterar?");
	        int indice = scan.nextInt() - 1;

	        Anime animePesquisado = listaAnimes.get(indice);

	        int option;

	        do {

	            System.out.println("--------***** O QUE DESEJA ALTERAR? *****--------");
	            System.out.println("| Digite 0 para voltar ao menu");
	            System.out.println("| Digite 1 para Nome");
	            System.out.println("| Digite 2 para Diretor");
	            System.out.println("| Digite 3 para Lancamento");
	            System.out.println("| Digite 4 para Dublagem");
	            System.out.println("| Digite 5 para Idioma");
	            System.out.println("| Digite 6 para Temporada");
	            System.out.println("| Digite 7 para Episodios");
	            System.out.println("| Digite 8 para Nota");
	            System.out.println("| Digite 9 para Categoria");
	            System.out.println("| Digite 10 para Origem");

	            option = scan.nextInt();

	            switch (option) {
	                case 0:          
	                    
	                    break;
	                case 1:
	                    System.out.println("Digite o novo valor para (Nome): " + listaAnimes.get(indice).getNome());
	                    animePesquisado.setNome(scan.next());
	                    System.out.println("Alteração feita com Sucesso!");
	                    break;
	                case 2:
	                    System.out.println("Digite o novo valor para (Diretor): " + listaAnimes.get(indice).getDiretor());
	                    animePesquisado.setDiretor(scan.next());
	                    System.out.println("Alteração feita com Sucesso!");
	                    break;

	                case 3:
	                    System.out.println("Digite o novo valor para (Lançamento): " + listaAnimes.get(indice).getLancamento());
	                    animePesquisado.setLancamento(scan.next());
	                    System.out.println("Alteração feita com Sucesso!");

	                    break;

	                case 4:
	                    System.out.println("Digite o novo valor para (Dublagem) :" + listaAnimes.get(indice).getDublagem());
	                    animePesquisado.setDublagem(scan.next());
	                    System.out.println("Alteração feita com Sucesso!");

	                case 5:
	                    System.out.println("Digite o novo valor para (Idioma): " + listaAnimes.get(indice).getIdioma());
	                    animePesquisado.setIdioma(scan.next());
	                    System.out.println("Alteração feita com Sucesso!");

	                    break;
	                case 6:
	                    System.out.println("Digite o novo valor para (Temporada): " + listaAnimes.get(indice).getTemporada());
	                    animePesquisado.setTemporada(scan.nextInt());	
	                    System.out.println("Alteração feita com Sucesso!");
	                    

	                    break;
	                case 7:
	                    System.out.println("Digite o novo valor para (Episodios): " + listaAnimes.get(indice).getEpisodios());
	                    animePesquisado.setEpisodios(scan.nextInt());
	                    System.out.println("Alteração feita com Sucesso!");

	                    break;
	                case 8:
	                    System.out.println("Digite o novo valor para (Nota): " + listaAnimes.get(indice).getNota());
	                    animePesquisado.setNota(scan.nextInt());
	                    System.out.println("Alteração feita com Sucesso!");

	                    break;
	                case 9:
	                    System.out.println("Digite o novo valor para (Categoria): " + listaAnimes.get(indice).getCategoria());
	                    animePesquisado.setCategoria(scan.next());
	                    System.out.println("Alteração feita com Sucesso!");

	                    break;
	                case 10:
	                    System.out.println("Digite o novo valor para (Origem) :" + listaAnimes.get(indice).getOrigem());
	                    animePesquisado.setOrigem(scan.next());
	                    System.out.println("Alteração feita com Sucesso!");

	                    break;
	                    
	                default:
	                	System.out.println("Opção inválida");
	            }

	        } while (option != 0);

}

}