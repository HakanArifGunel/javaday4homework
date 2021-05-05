package dorduncuGunOdev3;

public class Main {

	public static void main(String[] args) {
		
		GamerManager gamerManager = new GamerManager();
		Gamer gamer1 = new Gamer();
		gamer1.id=1;
		gamer1.firstName="Hakan";
		gamer1.lastName="G�nel";
		gamer1.NationalityId="123123";
		
		gamerManager.add(gamer1); // Kullan�c� ekleme, silme, g�ncelleme
		
		AuthManager authManager = new AuthManager();
		authManager.auth(gamer1); // Ad'a g�re do�rulama
		
		GameManager gameManager = new GameManager();
		Game game1 = new Game(1, "Call of Duty", "FPS", 100);
		gameManager.addGame(game1); // Oyun ekleme, silme
		
		CampaignManager campaignManager = new CampaignManager();
		Campaign campaign1 = new Campaign();
		campaign1.id=1;
		campaign1.gameId=1;
		campaign1.discount=10;
		campaignManager.addCampaign(campaign1); //kampanya ekleme, silme, g�ncelleme
		
		SaleManager saleManager = new SaleManager(); //�ndirim oran�na g�re sat�� ger�ekle�tirme
		saleManager.saleDetail(gamer1, game1, campaign1);
		
	}

}
