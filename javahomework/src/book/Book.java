package book;

public class Book {

	String bookName;
	int bookPrice;
	double bookDiscountRate;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}
	public Book(String bookName,int bookPrice,double bookDiscountRate){
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.bookDiscountRate = bookDiscountRate;
	}
	public double getBookDiscountBookPrice(){
		return bookPrice-(bookPrice*bookDiscountRate/100);
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	public double getBookDiscountRate() {
		return bookDiscountRate;
	}
	public void setBookDiscountRate(double bookDiscountRate) {
		this.bookDiscountRate = bookDiscountRate;
	}
}
