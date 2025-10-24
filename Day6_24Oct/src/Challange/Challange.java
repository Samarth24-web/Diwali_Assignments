package Challange;

import java.util.Arrays;

public class Challange {
	public static int[] merageTwoSortedArr(int[] arr1 , int[] arr2) {
		int l1=arr1.length;
		int l2=arr2.length;
		int[] ansArr=new int[l1+l2];
		int i1=0;
		int i2=0;
		int ig=0;
		while(i1<l1 && i2<l2) {
			if(arr1[i1]<arr2[i2]) {
				ansArr[ig++]=arr1[i1++];
			}else {
				ansArr[ig++]=arr2[i2++];
			}
		}
		if(i1<l1) {
			ansArr[ig++]=arr1[i1++];
		}
		if(i2<l2) {
			ansArr[ig++]=arr2[i2++];
		}
		return ansArr;
	}

	public static void main(String[] args) {
		int[]arr1= {1 , 4 , 7, 8,12, 34 , 56 , 76 , 545 , 4355};
		int[] arr2= {2 , 3 ,5, 6, 8, 9, 12 ,23 , 45 , 66, 75 , 456,3554 };
		System.out.println(Arrays.toString(merageTwoSortedArr(arr1 , arr2)));
	}
}
