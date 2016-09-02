package school;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studentArray [] = new Student[3];
		String namedata[] = {"홍길동","한사람","임걱정"};
		int data[] = {15,171,81,13,183,72,16,175,65};
		for(int i =0; i <studentArray.length; i++){
			studentArray[i]= new Student(namedata[i],data[i*3],data[i*3+1],data[i*3+2]);
		}
		System.out.println("이름  \t 나이 \t신장 \t몸무게");
		for(int i = 0; i < studentArray.length;i++)
			System.out.println(studentArray[i].getName()+"\t"+ 
					studentArray[i].getAge()+"\t"+
					studentArray[i].getHeight()+"\t"+
					studentArray[i].getWeight());
		float avgage = 0;
		float avgheight = 0;
		float avgweight = 0;
		for(int i = 0; i < studentArray.length;i++){
			avgage += studentArray[i].getAge();
			avgheight += studentArray[i].getHeight();
			avgweight += studentArray[i].getWeight();
		}
		avgage = avgage/3;
		avgheight = avgheight/3;
		avgweight = avgweight/3;
		System.out.printf("나이의 평균: %.2f \n",avgage);
		System.out.printf("신장의 평균: %.2f \n",avgheight);
		System.out.printf("몸무게의 평균: %.2f \n",avgweight);
	}

}
