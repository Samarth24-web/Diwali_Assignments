package Challange.java;

import java.util.Arrays;

public class Challange{
	
	public static void rotateArr(int[] arr , int k) {
		k = k% arr.length;
		if(k==0) return;
		int l=arr.length;
		rotateHelp(arr , k , 0 , l);
	}
	
	public static void rotateHelp(int[] arr , int k , int s , int e) {
		int rot=0;
		while(e-s>k) {
			for(int i=k-1 ; i>=0 ; i--) {
				int temp=arr[s];
				arr[s]=arr[e-1-i];
				arr[e-1-i]=temp;
				s++;
			}
			rot++;
		}
		if(rot%2!=0) return;
		else if(e-s>k/2)
		rotateHelp(arr , e-s%k , s , e);
	}
	
	public static void main(String[] args) {
		int[] arr =new int[] {1 ,2 ,3 ,4 ,5 ,6 ,7 ,8, 9 , 10 , 11 , 12 , 13 , 14};
		rotateArr( arr,5);
		System.out.println(Arrays.toString(arr));
	}
}
