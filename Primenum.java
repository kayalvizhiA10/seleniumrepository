package week1day2;

public class Primenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int input=13;
boolean flag=false;
for(int i=2;i<=input/2;i++)
{
	if(input%i==0)
	{
		flag=true;
		break;}
	
}	if(flag==false)
	{		System.out.println("It is a primenumber");
	}
else
	System.out.println("It is not a primenumber");
	}

}
