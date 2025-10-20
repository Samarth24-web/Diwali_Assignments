
public class Challange {
	
	//reverse a number
	public static int reverse(int n) {
		boolean isN=(n<0);
		if(isN)n*=-1;
		int ans=0;
		while(n>0) {
			ans*=10;
			ans+=n%10;
			n/=10;
		}
		return isN?-1 * ans:ans;
	}
	public static void main(String[] args) {
		System.out.println(reverse(-2300));
	}
}
