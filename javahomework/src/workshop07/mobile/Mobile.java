package workshop07.mobile;

public class Mobile {
	String code;
	String name;
	double price;
	public Mobile() {
		// TODO Auto-generated constructor stub
	}
	public Mobile(String code,String name,double price) {
		this.code = code;
		this.name =name;
		this.price =price;
	}
	String printInfo(){
		return code+" "+name+" "+price;
	}
}
