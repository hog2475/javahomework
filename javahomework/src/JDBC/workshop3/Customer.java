package JDBC.workshop3;

public class Customer {
	private String custId;
	private String custName;
	private String pass;
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	@Override
	public String toString() {
		return " ID=" + custId + ", pass=" + pass;
	}
	
}
