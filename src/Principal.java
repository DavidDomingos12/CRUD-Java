
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author rilton
 */
public class Principal {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Animacao> listaAnimacao = new ArrayList<>();

        String nome, diretor, lancamento, dublagem, idioma;
        int temporada, episodios;
        double nota;

        Animacao a1 = new Animacao("Naruto", "Rilton", "03-01-2003", 5, 167, 3.2, "Portuguesa", "Portugues");
        Animacao a2 = new Animacao("Chainsaw Man", "David Domingos", "23-12-2021", 5, 167, 3.2, "Portuguesa",
                "Portugues");
        Animacao a3 = new Animacao("Jujutsu  Kaisen", "Jv", "31-08-1993", 5, 167, 3.2, "Portuguesa", "Portugues");
        Animacao a4 = new Animacao("One Piece", "Lucas castro", "12-09-2004", 5, 167, 3.2, "Portuguesa", "Portugues");
        Animacao a5 = new Animacao("Mob Psycho 100", "Lucas Rosa", "10-11-2011", 5, 167, 3.2, "Portuguesa",
                "Portugues");
        Animacao a6 = new Animacao("DBZ", "Arthur", "10-02-2017", 5, 167, 3.2, "Portuguesa", "Portugues");
        Animacao a7 = new Animacao("Death note", "Adailton", "10-11-1991", 5, 167, 3.2, "Portuguesa", "Portugues");

        listaAnimacao.add(a1);
        listaAnimacao.add(a2);
        listaAnimacao.add(a3);
        listaAnimacao.add(a4);
        listaAnimacao.add(a5);
        listaAnimacao.add(a6);
        listaAnimacao.add(a7);

        int opcao = 0;
        do {
            System.out.println("Digite 0 para sair | digite 1 para listar animes | Digite 2 para adicionar um Anime ");
            System.out.println("Digite 3 para pesquisar por ID:");
            System.out.println("--------------------------------------------------------");
            opcao = scan.nextInt();

            switch (opcao) {
                case 0:
                    break;
                case 1:
                    for (int i = 0; i < listaAnimacao.size(); i++) {
                        System.out.println("Nome :" + listaAnimacao.get(i).getNome());
                        System.out.println("Diretor :" + listaAnimacao.get(i).getDiretor());
                        System.out.println("Idioma :" + listaAnimacao.get(i).getIdioma());
                        System.out.println("ID :" + i);
                        System.out.println("======================");
                    }
                    break;
                case 2:
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
                    Animacao temp = new Animacao(nome, diretor, lancamento, temporada, episodios, nota, dublagem,idioma);
                    listaAnimacao.add(temp);
                    System.out.println(
                        "--------------------------   ANIME CADASTRADO     ------------------------------");
                    System.out.println(
                        "");
                    break;
                case 3:

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
                    break;
            }

        } while (opcao != 0);

    }
}
