package week1day2;

public class Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int value =8;
int firstnum=0;
int secnum=1;
for(int i=1;i<=value;i++) {

 int sum =firstnum+secnum;
 firstnum=secnum;
 secnum=sum;
 System.out.println("print"+sum);
	}
	}
}
