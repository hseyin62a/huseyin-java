package finalprojehyeni;

public class Game {
	
	private String name;
    private double price;
    private String genre;
    
    public Game(String name,String genre, double price) {
        this.name = name;
        this.price = price;
        this.genre = genre;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getgenre() {
        return genre;
    }

    public void setgenre(String genre) {
        this.genre = genre;
    }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}