import java.util.*;
class Factorial
{
	public static int factorialOfNumber(int num)
	{
		int n = 1 , factorial = 1;
		if(num == 0){	
			return 1;
		}
		if(num < 0){
			return -1;
		}
		while(n <= num){
			factorial *= n;
			n++;
		}
		return factorial;
	}	
	public static void main(String[] args){
		int num = 0, result = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		num = scan.nextInt();
		result = factorialOfNumber(num);
		if(!(result < 0))
			System.out.println("Factorial of number " + num + " is: " + result);
		System.out.println("Factorial in not defined for negative numbers");
	}
}