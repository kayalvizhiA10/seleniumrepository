package week1day2;

import java.util.Arrays;

public class MissingelementinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]arr= {1,2,3,4,7,6,8};
Arrays.sort(arr);
for(int i=0;i<arr.length;i++)
{

if((i+1)==arr[i])
{System.out.println("the index is matched");
}
else {
	System.out.println("index value "+ i + " not equal to array " +arr[i]);
		break;
	}

	}}}
