package dorduncuGunOdev3;

public class AuthManager implements Auther{

	@Override
	public boolean auth(Gamer gamer) {
		if (gamer.getFirstName() == "Hakan") {
			System.out.println("Kullan�c� Do�ruland�.");
			return true;
		}
		else {
			System.out.println("Kullan�c� Do�rulama Ba�ar�s�z. L�tfen ge�erli bir isim giriniz");
			return false;
		}
	}
	

}
