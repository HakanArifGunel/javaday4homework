package dorduncuGunOdev3;
// Bu interfaceolsa daha iyi

public class GamerManager extends Gamer{

	public void add(Gamer gamer) {
		System.out.println(gamer.firstName + " Adl� oyuncu eklendi");
	}
	
	public void delete(Gamer gamer) {
		System.out.println(gamer.firstName + " Adl� oyuncu silindi");
	}
	
	public void update(Gamer gamer) {
		System.out.println(gamer.firstName + " Adl� oyuncunun bigileri g�ncellendi");
	}

}
