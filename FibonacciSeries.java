package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		int range = 8 , firstNum = 0 , secNum = 1 , sum = 0 ;
		System.out.println(firstNum);
		for(int i=1 ; i < range ; i++)
		{
			System.out.println(secNum);
			sum = firstNum + secNum ;
			firstNum = secNum ;
			secNum = sum;

		}

	}

}
