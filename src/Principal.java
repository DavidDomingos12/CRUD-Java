    import java.util.ArrayList;
    import java.util.Scanner;

    public class Principal {
        ArrayList<Animes> listaAnimacao = new ArrayList<Animes>();
  
        String nome, diretor, lancamento, dublagem, idioma, tipo;
        int temporada, episodios;
        Scanner scan = new Scanner(System.in);
        double nota;
        
        public void listarAnimacoes()
         {
          for (int i = 0; i < listaAnimacao.size(); i++) 
              {
                System.out.println("Nome :" + listaAnimacao.get(i).getNome());
                System.out.println("Diretor :" + listaAnimacao.get(i).getDiretor());
                System.out.println("Idioma :" + listaAnimacao.get(i).getIdioma());
                System.out.println("ID :" + i);
                System.out.println("__________________________________________________");
              }
         }
        public void cadastrarAnimacoes()
        {
         System.out.println(" ---  Cadastre as informações  --- ");
                    System.out.println("Nome:");
                    nome = scan.nextLine();
                    nome = scan.nextLine();
                    System.out.println("Diretor:");
                    diretor = scan.nextLine();
                    System.out.println("Lancamento:");
                    lancamento = scan.nextLine();
                    System.out.println("Temporada:");
                    temporada = scan.nextInt();
                    System.out.println("Episodios:");
                    episodios = scan.nextInt();
                    System.out.println("Nota");
                    nota = scan.nextDouble();
                    System.out.println("Dublagem:");
                    dublagem = scan.nextLine();
                    dublagem = scan.nextLine();
                    System.out.println("Idioma: ");
                    idioma = scan.nextLine();
                    System.out.println("Tipo: ");
                    tipo = scan.nextLine();
                    Animes temp = new Animes(nome, diretor, lancamento, temporada, episodios, nota, dublagem,idioma, tipo);
                    listaAnimacao.add(temp);
                    System.out.println(
                        "--------------------------   ANIME CADASTRADO     ------------------------------");
                    System.out.println("\n");
        }
        public void pesquisarporID()
        {
        System.out.println("Digite o ID para a pesquisa");
           int idPesquisa = scan.nextInt();
                    System.out.println(
                            "--------------------------   RESULTADO DA PESQUISA     ------------------------------");
                    System.out.println("Nome :" + listaAnimacao.get(idPesquisa).getNome());
                    System.out.println("Diretor :" + listaAnimacao.get(idPesquisa).getDiretor());
                    System.out.println("Lançamento :" + listaAnimacao.get(idPesquisa).getLancamento());
                    System.out.println("Temporada :" + listaAnimacao.get(idPesquisa).getTemporada());
                    System.out.println("Episodios:" + listaAnimacao.get(idPesquisa).getEpisodios());
                    System.out.println("--------------------------------------------------------");
        }
        public void pesquisarporNome()
        {            
             System.out.println("Digite o nome de uma Animacao para pesquisa: ");
             nome = scan.nextLine();  
             boolean achei = false;
            for(int i = 0; i < listaAnimacao.size(); i++)
            {
                Animacao animacao = (Animacao) listaAnimacao.get(i); //
                if(animacao.getNome().equals(nome))
                {
                  System.out.println("--------***** LISTA *****--------");
                  System.out.println("Nome:" + listaAnimacao.get(i).getNome());
                  System.out.println("Diretor :" + listaAnimacao.get(i).getDiretor());
                  System.out.println("Lançamento :" + listaAnimacao.get(i).getLancamento());
                  System.out.println("Temporada :" + listaAnimacao.get(i).getTemporada());
                  System.out.println("Episodios:" + listaAnimacao.get(i).getEpisodios());
                  System.out.println("-------------"); 
                  achei = true; 
                }
            } 
            if(!achei)
            {
              System.out.println("Anime não encontrado!");        
            }
        }
        public void removerAnimacao(){
           System.out.println("Digite o ID para remover");
           int idPesquisa = scan.nextInt();
           System.out.println("Digite 1 caso queira remover");
           int opcaoRemover = scan.nextInt();
           
           if(opcaoRemover == 1){
              listaAnimacao.remove(idPesquisa);
           } else {
              System.out.println("Saindo...");
           }
        }
        public void alterarAnimacao(){
            int opAlteracao = 0;
            System.out.println("--------***** O QUE DESEJA ALTERAR? *****--------");
            System.out.println("| Digite 0 para sair");
            System.out.println("| Digite 1 para nome");
            System.out.println("| Digite 2 para diretor");
            System.out.println("| Digite 3 para lancamento");
            System.out.println("| Digite 4 para dublagem");
            System.out.println("| Digite 5 para idioma");
            System.out.println("| Digite 6 para temporada");
            System.out.println("| Digite 7 para episodios");
            System.out.println("| Digite 1 para nota");

            switch (opAlteracao) {
                case 0:
                    break;
                case 1:
                    
                case 2:
                    break;
                    
                case 3:
                    break;
                  
                case 4:          
                    break;
                case 5:
            }
        }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Principal principal = new Principal(); //instanciando os métodos
       
        Animes a1 = new Animes("Naruto", "Rilton", "03-01-2003", 5, 167, 3.2, "Brasileiro", "Portugues","Shonen");
        Animes a2 = new Animes("Chainsaw Man", "David Domingos", "23-12-2021", 5, 167, 3.2, "Portuguesa","Portugues","Shonen");
        Animes a3 = new Animes("Jujutsu  Kaisen", "Jv", "31-08-1993", 5, 167, 3.2, "Brasileiro", "Portugues","Shonen");
        Animes a4 = new Animes("One Piece", "Lucas castro", "12-09-2004", 5, 167, 3.2, "Brasileiro", "Portugues","Shonen");
        Animes a5 = new Animes("Mob Psycho 100", "Lucas Rosa", "10-11-2011", 5, 167, 3.2, "Brasileiro", "Portugues", "Shonen");
        Animes a6 = new Animes("DBZ", "Arthur", "10-02-2017", 5, 167, 3.2, "Portuguesa", "Portugues","Luta");
        Animes a7 = new Animes("Death note", "Adailton", "10-11-1991", 5, 167, 3.2, "Portuguesa", "Portugues","Onen"); 
            principal.listaAnimacao.add(a1);
            principal.listaAnimacao.add(a2);
            principal.listaAnimacao.add(a3);
            principal.listaAnimacao.add(a4);   
            principal.listaAnimacao.add(a5);
            principal.listaAnimacao.add(a6);
            principal.listaAnimacao.add(a7);

        int opcao = 0;
        do {
            System.out.println("------------- BEM VINDO -------------");
            System.out.println("| Digite 0 para sair");
            System.out.println("| Digite 1 para listar animes");
            System.out.println("| Digite 2 para adicionar um Anime");
            System.out.println("| Digite 3 para pesquisar por ID:");
            System.out.println("| Digite 4 para pesquisar um Anime por Nome");
            System.out.println("| Digite 5 para remover uma Animação");
            System.out.println("---------------------------------------------");
            opcao = scan.nextInt();

            switch (opcao) {
                case 0:
                    break;
                case 1:
                    principal.listarAnimacoes();
                    break;
                case 2:
                    principal.cadastrarAnimacoes();
                    break;
                    
                case 3:
                   principal.pesquisarporID();
                    break;
                  
                case 4:          
                    principal.pesquisarporNome();
                    break;
                case 5:
                    principal.removerAnimacao();
            }
         
        } while (opcao != 0);

    }
}
