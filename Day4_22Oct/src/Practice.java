import java.util.*;

public class Practice {
	
	//add 2 numbers
	public static int add(int a ,int b) {
		return a+b;
	}
	
	//print table
	public static void printTable(int n) {
		for(int i=1 ; i<11 ; i++) {
			System.out.println(i +" * "+n +" = " +(i*n));
		}
	}
	
	//triangle pattern
	public static void patternTriangle(int n) {
		for(int i=0 ; i<n ; i++) {
			for(int k=1 ; k<n-i ; k++) {
				System.out.print(" ");
			}
			for(int j=0 ; j<((i+1)*2)-1 ; j++) {
				if(j>0 && j<((i+1)*2)-2 && i<n-1) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	
	//pyramid pattern
	public static void patternPyramid(int n) {
		for(int i=0 ; i<n ; i++) {
			for(int k=1 ; k<n-i ; k++) {
				System.out.print(" ");
			}
			for(int j=0 ; j<((i+1)*2)-1 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	//GCD of two numbers
	public static int findGcd(int a , int b) {
		int min = Math.min(a ,  b);
		int max= Math.max(a , b);
		
		for(int i=1 ; i<min ; i++) {
			if(min%i==0 && max%(min/i)==0) {
				return min/i;
			}
		}
		return 1;
	}
	
	//find lcm
	public static int findLcm(int a , int b) {
		int min = Math.min(a ,  b);
		int max= Math.max(a , b);
		
		for(int i=1 ; true ; i++) {
			int cur = max*i;
			if(cur%min==0) {
				return cur;
			}
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Numbers: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
//		System.out.println(add(a ,b));
//		
//		printTable(a);
		
//		patternTriangle(a);
//		
//		patternPyramid(a);
		
//		System.out.println(findGcd(a ,b));
		
		System.out.println(findLcm(a ,b));
		
	}
}
