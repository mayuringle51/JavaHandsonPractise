package JavaCodingQuestions;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		
		//Find the second highest number in an array.
		//Remove duplicates from an array or ArrayList.
		//Find missing number in an array of 1 to N.
		//Sort a HashMap by values.
		int nums []= {10,20,30,50,99,80,70,60,50,55};
		
		//findHighest(nums);
		findHighestwithoutsort(nums);
		removeDuplicate(nums);
		

	}
	
	private static void removeDuplicate(int[] nums) {
		int duplicateIndex= findDuplicateIndex(nums);
		removeElementofIndex(nums, duplicateIndex);
		

		
		
		
		
	}

	private static void removeElementofIndex(int[] nums, int duplicateIndex) {
		
		//int[] arr = new arr int [5];
		
		
	}

	private static int findDuplicateIndex(int[] nums) {
		int duplicateIndex=0;
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]==nums[j])
					duplicateIndex=i;
			}
		}
		return duplicateIndex;
	}

	private static void findHighestwithoutsort(int[] nums) {
		int max=nums[0];
		int min=nums[0];
		
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>max)
				max=nums[i];
			if(nums[i]<min)
				min=nums[i];
		}
		
		System.out.println("Maximum of number is :"+max);
		System.out.println("Minimum of number is :"+min);
		
		
	}

	public static void findHighest(int[] nums) {
		
		Arrays.sort(nums);
		System.out.println(nums[nums.length-2]);
		
	}

}
