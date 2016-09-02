package student;

public class Student {
	int korean;
	int english;
	int math;
	int science;
	String name;

	Student() {
	}

	Student(String name, int korean, int english, int math, int science) {
		this.korean = korean;
		this.english = english;
		this.math = math;
		this.science = science;
		this.name = name;
	}

	double getAvg() {
		return (korean + english + math + science)/4.0;
	}

	String getGrade() {
		double score = getAvg();
		if(score <= 100 && score >=90)
			return "A학점";
		if(score < 90 && score >70)
			return "B학점";
		if(score < 70 && score >=50)
			return "C학점";
		if(score < 50  && score >=30)
			return "D학점";
		else
			return "F학점";
	}

	public int getKorean() {
		return korean;
	}

	public void setKorean(int korean) {
		this.korean = korean;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getScience() {
		return science;
	}

	public void setScience(int science) {
		this.science = science;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
