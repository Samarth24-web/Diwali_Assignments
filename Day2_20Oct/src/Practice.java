import java.util.*;
public class Practice {
	
	//sum of first n even number
	public static int sumOfNEvenNums(int n) {
		int ans=0;
		for(int i=0 ; i<=n*2 ; i+=2) {
			ans+=i;
		}
		return ans;
		//return n(n+1);
	}
	
	//sum of first n odd number
	public static int sumOfNOddNums(int n) {
		int ans=0;
		for(int i=1 ; i<=n*2 ; i+=2) {
			ans+=i;
		}
		return ans;
	    // return n*n;
	}
	
	//palindrome number
	public static boolean isPalindrome(int n) {
		int ans=0;
		int temp=n;
		while(temp>0) {
			ans*=10;
			ans+=temp%10;
			temp/=10;
		}
		return ans==n;
	}
	
	private static int findDigits(int n) {
		int i=0;
		int temp=n;
		while(temp>0) {
			temp/=10;
			i++;
		}
		return i;
	}
	//check armstrong no
	public static  boolean isArmstrong(int n) {
		int ans=0;
		int digits=findDigits(n);
		System.out.println(digits);
		int temp=n;
		while(temp>0) {
			int rem=temp%10;
			int cur=1;
			temp/=10;
			for(int i=0; i<digits ; i++) {
				cur*=rem;
			}
			ans+=cur;
		}
		return ans==n;
	}
	
	//reverse a number
	public static int reverse(int n) {
		int ans=0;
		while(n>0) {
			ans*=10;
			ans+=n%10;
			n/=10;
		}
		return ans;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number :");
		int n = sc.nextInt();
		
//		System.out.println(sumOfNEvenNums(n));
//		
//		System.out.println(sumOfNOddNums(n));
		
//		System.out.println(isPalindrome(n));
		
//		System.out.println(isArmstrong(n));
		
		System.out.println(reverse(n));
		
		
	}
}
