package student;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student kim = new Student("Kim",100,90,95,89);
		Student Lee = new Student("Lee",60,70,99,98);
		Student Park = new Student("Park",68,86,60,40);
		System.out.println(kim.getName()+" 평균: "+kim.getAvg()+" 학점:"+kim.getGrade());
		System.out.println(Lee.getName()+" 평균: "+Lee.getAvg()+" 학점:"+Lee.getGrade());
		System.out.println(Park.getName()+" 평균: "+Park.getAvg()+" 학점:"+Park.getGrade());
	}
}
