package day2;
public class TestBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book book= new Book();
		book.Name="shortStroy";
		book.authorName="ram";
		book.price = 500;
		book.contact =399322l;
		book.chapters=12;
		System.out.println("name:"+book.Name+'\n'+"authorName:"+book.authorName+'\n'+"price:"+book.price+"\n"+"contact:"+book.contact+'\n'+"chapters:"+book.chapters);
		

	}

}
