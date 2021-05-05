package dorduncuGunOdev3;

public class Game {
	
	private int id;
	private String gameName;
	private String gameType;
	private int gamePrice;
	
	public Game() {
		
	}
	
	public Game(int id, String gameName, String gameType, int gamePrice) {
		super();
		this.id = id;
		this.gameName = gameName;
		this.gameType = gameType;
		this.gamePrice = gamePrice;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getGameName() {
		return gameName;
	}


	public void setGameName(String gameName) {
		this.gameName = gameName;
	}


	public String getGameType() {
		return gameType;
	}


	public void setGameType(String gameType) {
		this.gameType = gameType;
	}


	public int getGamePrice() {
		return gamePrice;
	}


	public void setGamePrice(int gamePrice) {
		this.gamePrice = gamePrice;
	}
	
	
	
	

}
