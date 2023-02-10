package week1day2;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =34345;
		int temp=0;
		int rem=0;
		for(int i=0;i<5;i++) {
	
			temp=num%10;
		rem=(rem*10)+temp;
		num=num/10;
		}
		if(temp==num)
		{System.out.println("The given number is palindrome");}
		else
		{
			System.out.println("The given number is not palindrome");
		}
	}

}
