package dorduncuGunOdev3;

public class Campaign {
	
	int id;
	int gameId;
	int discount;
	
	public Campaign() {
		
	}

	public Campaign(int id, int gameId, int discount) {
		super();
		this.id = id;
		this.gameId = gameId;
		this.discount = discount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}
	
	
	

}
