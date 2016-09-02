package com.stu;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studentArray[] = new Student[3];
		String namedata[] = { "홍길동", "한사람", "임걱정" };
		int data[] = { 15, 170, 80, 13, 180, 70, 16, 175, 65 };
		for (int i = 0; i < studentArray.length; i++) {
			studentArray[i] = new Student(namedata[i], data[i * 3], data[i * 3 + 1], data[i * 3 + 2]);
		}
		System.out.println("이름  \t 나이 \t신장 \t몸무게");
		for (int i = 0; i < studentArray.length; i++) {
			System.out.println(studentArray[i].studentInfo());
		}
		double avgage = 0;
		double avgheight = 0;
		double avgweight = 0;
		for (int i = 0; i < studentArray.length; i++) {
			avgage += studentArray[i].getAge();
			avgheight += studentArray[i].getHeight();
			avgweight += studentArray[i].getWeight();
		}
		avgage = avgage / 3;
		avgheight = avgheight / 3;
		avgweight = avgweight / 3;

		System.out.printf("나이의 평균: %.3f \n", avgage);
		System.out.printf("신장의 평균: %.3f \n", avgheight);
		System.out.printf("몸무게의 평균: %.3f \n", avgweight);
		int min = 0;
		int max = 0;
		int mindata = 0;
		int maxdata = 0;
		// 나이
		for (int i = 0; i < studentArray.length; i++) {
			if (i == 0) {
				mindata = studentArray[0].getAge();
				maxdata = studentArray[0].getAge();
			} else {
				if (mindata > studentArray[i].getAge()) {
					min = i;
					mindata = studentArray[i].getAge();
				}
				if (maxdata < studentArray[i].getAge()) {
					max = i;
					maxdata = studentArray[i].getAge();
				}
			}
		}
		System.out.println("나이가 가장 많은 학생: " + studentArray[max].getName());
		System.out.println("나이가 가장 적은 학생: " + studentArray[min].getName());
		// 신장
		min = 0;
		max = 0;
		mindata = 0;
		maxdata = 0;
		for (int i = 0; i < studentArray.length; i++) {
			if (i == 0) {
				mindata = studentArray[0].getHeight();
				maxdata = studentArray[0].getHeight();
			} else {
				if (mindata > studentArray[i].getHeight()) {
					min = i;
					mindata = studentArray[i].getHeight();
				}
				if (maxdata < studentArray[i].getHeight()) {
					max = i;
					maxdata = studentArray[i].getHeight();
				}
			}
		}
		System.out.println("신장이 가장 큰 학생: " + studentArray[max].getName());
		System.out.println("신장이 가장 작은 학생: " + studentArray[min].getName());

		// 몸무게
		min = 0;
		max = 0;
		mindata = 0;
		maxdata = 0;
		for (int i = 0; i < studentArray.length; i++) {
			if (i == 0) {
				mindata = studentArray[0].getWeight();
				maxdata = studentArray[0].getWeight();
			} else {
				if (mindata > studentArray[i].getWeight()) {
					min = i;
					mindata = studentArray[i].getWeight();
				}
				if (maxdata < studentArray[i].getWeight()) {
					max = i;
					maxdata = studentArray[i].getWeight();
				}
			}
		}
		System.out.println("몸무게가 가장 많이 나가는 학생: " + studentArray[max].getName());
		System.out.println("몸무게가 가장 적게 나가는 학생: " + studentArray[min].getName());

	}

}
