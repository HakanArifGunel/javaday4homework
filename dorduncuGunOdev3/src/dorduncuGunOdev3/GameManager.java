package dorduncuGunOdev3;

public class GameManager extends Game{

	public void addGame(Game game) {
		System.out.println(game.getGameName()+ " Adlý oyun eklendi");
	}
	
	public void deleteGame(Game game) {
		System.out.println(game.getGameName()+ " Adlý oyun silindi");
	}
	
}
