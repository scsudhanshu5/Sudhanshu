package DSAPI.algos.searching;

public class BinarySearch {
	
	public static int search(int[] a, int element) {
		return recursiveSearch(a, 0, a.length-1, element);
	}
	
	private static int recursiveSearch(int[] a, int startIndex, int endIndex, int element) {
		if(endIndex>=startIndex) {
			int mid = startIndex + (endIndex-startIndex) /2;
			
			if(element==a[mid]) {
				return mid;
			}
			
			if(element<a[mid]) {
				return recursiveSearch(a, startIndex, mid-1, element);
			}
			return recursiveSearch(a, mid+1, endIndex, element);
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int a[] = {10,20,30,40,50,60,70};
		System.out.println(search(a, 80));
	}

}
