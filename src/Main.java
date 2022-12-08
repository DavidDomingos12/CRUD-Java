
public class Main {

	public static void main(String[] args) {
		AnimeController animesController = new AnimeController(); 

		Anime a1 = new Anime(1,"Naruto", "Rilton", "03-01-2003", 5, 167, 6, "Brasileiro", "Portugues", "Shonen", "Mangá");
		Anime a2 = new Anime(2,"Chainsaw Man", "David Domingos", "23-12-2021", 5, 167, 1, "Portuguesa", "Portugues",
                "Shonen", "lightNovel");
		Anime a3 = new Anime(3,"Jujutsu  Kaisen", "Jv", "31-08-1993", 5, 167, 4, "Brasileiro", "Portugues", "Shonen", "lightNovel");
		Anime a4 = new Anime(4,"One Piece", "Lucas castro", "12-09-2004", 5, 167, 3.2, "Brasileiro", "Portugues",
                "Shonen", "Mangá");
		Anime a5 = new Anime(5,"Mob Psycho 100", "Lucas Rosa", "10-11-2011", 5, 167, 11, "Brasileiro", "Portugues",
                "Shonen", "Anime");
		Anime a6 = new Anime(6,"DBZ", "Arthur", "10-02-2017", 5, 167, 3.2, "Portuguesa", "Portugues", "Luta", "lightNovel");
		Anime a7 = new Anime(7,"Death note", "Adailton", "10-11-1991", 5, 167, 10, "Portuguesa", "Portugues", "Onen", "lightNovel");
        animesController.listaAnimes.add(a1);
        animesController.listaAnimes.add(a2);
        animesController.listaAnimes.add(a3);
        animesController.listaAnimes.add(a4);
        animesController.listaAnimes.add(a5);
        animesController.listaAnimes.add(a6);
        animesController.listaAnimes.add(a7);

        animesController.menu();

	}

}
