package DSAPI.algos.searching;

public class LinearSearch {
	public static int search(int[] a, int element) {
		int index=0;
		while(index<a.length) {
			if(a[index]==element) {
				return index;
			}
			else {
				index++;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int a[] = {10,30,20,50,90,110};
		System.out.println(search(a,50));
	}
}
