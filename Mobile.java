package week1day1assign1;

public class Mobile {
	public void makecall()
	
	{
		String mobilemodel="samsung";
		float mobileweight=150.55f;
		System.out.println("The name of  mobilemodel is: "+mobilemodel);
		System.out.println("The weight of mobile is: "+mobileweight);
	}
public void mobileweight()
{
	boolean isFullyCharged=true;
	int mobilecost=15000;
	System.out.println("Is mobile charged fully: "+isFullyCharged);
	System.out.println("Cost of mobile is: "+mobilecost);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile model =new Mobile();
		model.makecall();
		model.mobileweight();
		System.out.println("This is my mobile");

	}

}
