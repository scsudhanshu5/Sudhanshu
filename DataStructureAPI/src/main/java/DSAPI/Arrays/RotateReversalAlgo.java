package DSAPI.Arrays;

public class RotateReversalAlgo {
	
	public static int[] rotate(int[] a, int n, int d) {
		a= reverseArray(a, 0, d-1);
		a= reverseArray(a, d, n-1);
		a=reverseArray(a, 0, n-1);
		return a;
	}
	
	public static int[] reverseArray(int[] a, int startIndex, int endIndex) {
		int temp;
		while(startIndex<endIndex) {
			temp = a[startIndex];
			a[startIndex] = a[endIndex];
			a[endIndex] = temp;
			/*System.out.println(a[startIndex] + " , "+ a[endIndex]);*/
			startIndex++;
			endIndex--;
		}
		return a;
	}
	
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		a= rotate(a,5,2);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
