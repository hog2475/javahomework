package book;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1 = new Book("SQL Plus",50000,5.0);
		Book book2 = new Book("Java 2.0",40000,3.0);
		Book book3 = new Book("JSP Servlet",60000,6.0);
		System.out.println("책이름 \t 가격 \t 할인율\t  할인후금액");
		System.out.println("___________________________________________________________");
		System.out.println(book1.getBookName()+"\t"+book1.getBookPrice()+ "\t"+book1.getBookDiscountRate()+"%\t"+book1.getBookDiscountBookPrice());
		System.out.println(book2.getBookName()+"\t"+book2.getBookPrice()+ "\t"+book2.getBookDiscountRate()+"%\t"+book2.getBookDiscountBookPrice());
		System.out.println(book3.getBookName()+"\t"+book3.getBookPrice()+ "\t"+book3.getBookDiscountRate()+"%\t"+book3.getBookDiscountBookPrice());
	}
}
