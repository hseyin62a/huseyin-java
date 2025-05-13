package finalprojehyeni;
import java.util.ArrayList;
public class Library {
	 private ArrayList<Game> games = new ArrayList<>();

	    public void addGame(Game game) {
	        games.add(game);
	    }

	    public void listGames() {
	        System.out.println("Kütüphanedeki Oyunlar:");
	        for (Game g : games) {
	            System.out.println("- " + g.getName() +  g.getgenre()+" | Fiyat: $" + g.getPrice());
	        }
	    }

	    public static void main(String[] args) {
	        Library library = new Library();

	        Game game1 = new Game("RDR2", "Açık dünya", 30);
	        Game game2 = new Game("Detroit BH", "Sinematik", 19.99);
	        Game game3 = new Game("The Witcher 3", "Akisyon RPG", 15.49);
            Game game4 = new Game ("Resident evil4 remake", "Hayatta kalma", 24);
            Game game5 = new Game ( "kingdom come deliverance", "aksiyon rpg",20.45);
            Game game6 = new Game ( "GTA6",  "Açık dünya",100);
	        library.addGame(game1);
	        library.addGame(game2);
	        library.addGame(game3);
            library.addGame(game4);
            library.addGame(game5);
            library.addGame(game6);
	        library.listGames();
	    }
	}