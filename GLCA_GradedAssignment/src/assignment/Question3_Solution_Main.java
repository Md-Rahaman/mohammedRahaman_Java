package assignment;
import java.util.Arrays;
public class Question3_Solution_Main 
{
	public static void main(String[] args) 
	{

		int[] nums= {1,2,3,4,5};

		System.out.println("Input : "+Arrays.toString(nums));
		System.out.println("ODD NUMBERS : "+Arrays.toString(Arrays.stream(nums).filter(num -> num %2  != 0).toArray()));
		System.out.println("SQUARES "+Arrays.toString(Arrays.stream(nums).filter(num -> num % 2 != 0).map(num -> num* num).toArray()));
		System.out.println("SUM : "+Arrays.stream(nums).filter(num -> num % 2 != 0).map(num -> num * num).sum());	
		System.out.println("OUTPUT : "+Arrays.stream(nums).filter(num -> num % 2 != 0).map(num -> num * num).sum());	


	}
}
