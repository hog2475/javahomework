package mobile;

public class MobileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ltab lt = new Ltab("Ltab", 500, "AP-01");
		Otab ot = new Otab("Otab",1000,"AND-20");
		System.out.println("Mobile \t Battery \t OS");
		System.out.println("-------------------------");
		System.out.println(lt);
		System.out.println(ot);
		System.out.println();
		
		System.out.println("10분 충전");
		lt.charge(10);
		ot.charge(10);
		System.out.println("Mobile \t Battery \t OS");
		System.out.println("-------------------------");
		System.out.println(lt);
		System.out.println(ot);
		System.out.println();
		
		System.out.println("5분 통화");
		lt.operate(5);
		ot.operate(5);
		System.out.println("Mobile \t Battery \t OS");
		System.out.println("-------------------------");
		System.out.println(lt);
		System.out.println(ot);
		System.out.println();

	}

}
