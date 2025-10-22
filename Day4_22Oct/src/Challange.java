
public class Challange {
	
	//find missing num in array
	public static int findMissing(int[] arr) {
		int l = arr.length;
		int sum=0;
		for(int i=0 ; i<l ; i++) {
			sum+=arr[i];
		}
		int maxSum=(((l+1) * (l+2))/2);
		return maxSum-sum;
	}
	
	public static void main(String[] args) {
		int[] arr= { 1 , 2 , 3 , 5 ,7 , 6 , 4};
		System.out.println(findMissing(arr));
	}
}
