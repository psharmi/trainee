package day2;

public class Testhotel {

	public static void main(String[] args) {
		Hotel hot=new Hotel();
		hot.HotelName="xyz";
		hot.address ="no.18,south street,T Nagar,chennai-600095";
        hot.contact = "456564";
		hot.rating =3.6f;
		hot.homeDelivery =true;
		System.out.println("HotelName:"+hot.HotelName+'\n'+"address:"+hot.address+'\n'+"contact:"+hot.contact+'\n'+"rating:"+hot.rating+'\n'+"homeDelivery:"+hot.homeDelivery);
	}
}

