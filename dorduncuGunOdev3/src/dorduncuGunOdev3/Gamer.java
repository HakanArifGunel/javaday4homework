package dorduncuGunOdev3;

public class Gamer {
	
	int id;
	String firstName;
	String lastName;
	String NationalityId;
	
	public Gamer() {
		
	}
	
	
	public Gamer (int id, String firstName, String lastName, String NationalityId) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.NationalityId = NationalityId;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getNationalityId() {
		return NationalityId;
	}
	public void setNationalityId(String nationalityId) {
		NationalityId = nationalityId;
	}
	
}
