import java.util.*;
class Palindrome{
	public static boolean isPalindrome(String str)
	{
		for(int i=0,j=str.length()-1;i<=j;i++,j--)
		{
			if(str.charAt(i) == str.charAt(j))
				continue;
			return false;
		}
		return true;
	}
	public static void main(String[] args){
		String str = "";
		boolean result;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string:");
		str = scan.nextLine();
		result = isPalindrome(str);
		if(result)
			System.out.println(str+" is a Palindrome!");
		else
			System.out.println(str+" is a not Palindrome!");
	}
}