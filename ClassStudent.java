package week1day1assign1;

public class ClassStudent {
	String studentname="Tharun";
	int rollno=2475;
	String collegename="Anna university";
	int markscored=95;
	float cgpa=95.5f;
	 public void report() {
		 System.out.println("Student name is: "+studentname);
		 System.out.println("Student rollno is: "+rollno);
		 System.out.println("College name is: "+collegename);
		 System.out.println("Marks scored is: "+markscored);
		 System.out.println("Cgpa is: "+cgpa);
		 
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassStudent student=new ClassStudent();
student.report();
	}

}
