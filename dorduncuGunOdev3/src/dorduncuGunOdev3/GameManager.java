package dorduncuGunOdev3;

public class GameManager extends Game{

	public void addGame(Game game) {
		System.out.println(game.getGameName()+ " Adl� oyun eklendi");
	}
	
	public void deleteGame(Game game) {
		System.out.println(game.getGameName()+ " Adl� oyun silindi");
	}
	
}
