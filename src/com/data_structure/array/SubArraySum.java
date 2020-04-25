package com.data_structure.array;

public class SubArraySum {
	
	public int findSubArray(int arr[],int n,int arrsum) {
		
		int cursum=arr[0],start=0,i;
		
		for(i=1;i<=n;i++)
		{
			while(cursum>arrsum && start<i-1)
			{
				cursum=cursum-arr[start];
				start++;
			}
			if(cursum==arrsum)
			{
				System.out.println("Sum found between indexs "+start+" and "+(i-1));
				return 1;
			}
			if(i<n)
				cursum+=arr[i];
		}
		System.out.println("No subarray is found");
		return 0;
	}
	
	public static void main(String[] args) {
		SubArraySum obj=new SubArraySum();
		int arr[]= {12,6,87,12,45,6,2};
		obj.findSubArray(arr, arr.length,65);
		
	}

}
