package Searching;

public class BinarySearch {

	public static void main(String[] args) {
		
		int a[] = {10,20,30,40,50,60};  
		int key = 30;
		int first =0;
		int last=a.length-1;
		int mid=last-first/2;
		
		while(first<=last) {
			
			if(a[mid]<key){
				first=mid+1;
			}
			else if(a[mid]>key) {
				last=last-1;
			}
			else if(a[mid]==key) {
				System.out.println("Element found "+key+" at index "+a[mid]);
			}
			
		}
		
		
	}
}
