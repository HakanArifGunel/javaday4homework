package dorduncuGunOdev3;

public class AuthManager implements Auther{

	@Override
	public boolean auth(Gamer gamer) {
		if (gamer.getFirstName() == "Hakan") {
			System.out.println("Kullanýcý Doðrulandý.");
			return true;
		}
		else {
			System.out.println("Kullanýcý Doðrulama Baþarýsýz. Lütfen geçerli bir isim giriniz");
			return false;
		}
	}
	

}
