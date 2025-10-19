import java.util.*;

public class Challage {
	
	//length of longest String
	public static int longestStringLen(String[] arr) {
		int ans=0;
		for(int i=0 ; i<arr.length ; i++) {
			if(ans<arr[i].length()) {
				ans=arr[i].length();
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		String[] arr = { "hello" , "world" , "welcome" ,"jkhjkh" , "bjhgfjhfff"};
		System.out.println(longestStringLen(arr));
	}
}
