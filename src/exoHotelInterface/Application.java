package exoHotelInterface;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Chalet chalet1 = new Chalet();
		chalet1.setNom("\"chez Greg\"");
		chalet1.setNbChambres(42);
		chalet1.setEtoiles(2.5);
		chalet1.setPrix(300);
		
		chalet1.descriptionHotel();
		chalet1.reserverHotel();
		
		HotelSeptEtoiles hotel1 = new HotelSeptEtoiles();
		hotel1.setNom("\"le manoir de Dio\"");
		hotel1.setNbChambres(42);
		hotel1.setEtoiles(7);
		hotel1.setPrix(300);
		
		hotel1.descriptionHotel();
		hotel1.reserverHotel();
		

	}

}
