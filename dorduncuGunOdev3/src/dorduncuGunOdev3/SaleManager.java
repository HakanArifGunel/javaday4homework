package dorduncuGunOdev3;

public class SaleManager implements Sales{

	@Override
	public void saleDetail(Gamer gamer, Game game, Campaign campaign) {
		
		double newPrice = game.getGamePrice() - (game.getGamePrice()*campaign.getDiscount() /100) ;
		
		System.out.println(gamer.getFirstName() + " Adlý kullanýcýya " + 
				game.getGameName() + " Adlý oyun " +
				campaign.getDiscount() + " Ýndirim oranýyla satýlmýþtýr. " + 
				"Oyunun yeni fiyatý = " + newPrice);
	}
	


}
