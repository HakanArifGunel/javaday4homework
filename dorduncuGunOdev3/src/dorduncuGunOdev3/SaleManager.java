package dorduncuGunOdev3;

public class SaleManager implements Sales{

	@Override
	public void saleDetail(Gamer gamer, Game game, Campaign campaign) {
		
		double newPrice = game.getGamePrice() - (game.getGamePrice()*campaign.getDiscount() /100) ;
		
		System.out.println(gamer.getFirstName() + " Adl� kullan�c�ya " + 
				game.getGameName() + " Adl� oyun " +
				campaign.getDiscount() + " �ndirim oran�yla sat�lm��t�r. " + 
				"Oyunun yeni fiyat� = " + newPrice);
	}
	


}
